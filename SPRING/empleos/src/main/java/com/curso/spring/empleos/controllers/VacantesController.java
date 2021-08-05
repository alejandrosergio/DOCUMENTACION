package com.curso.spring.empleos.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.curso.spring.empleos.models.Vacante;
import com.curso.spring.empleos.services.IVacantesService;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	
	
	// Inyectamos el bin de servicio donde obtenemos las vacantes -> se inyecta la interface que es sobrescrita
	
	@Autowired
	private IVacantesService serviceVacantes;
	
	
	// Listaremos todas las vacantes
	@GetMapping("/index")
	public String listar( Model model) {
		
		List<Vacante> vacantes = serviceVacantes.obtenerVacantes();
		
		model.addAttribute("vacantes", vacantes);
		
		return "vacantes/listVacantes";
	}
	
	// Mapea a la url donde se encunetra el formulario para crear una vacante
	@GetMapping("/create")
	public String crear(Vacante vacante) {
		return "vacantes/formVacante";
	}
	
	
	// Mapea a la url donde se ara el data binding y retornara la vista de las listas de vacantes
	@PostMapping("/save")
	public String guardar( Vacante vacante, BindingResult bindingResult,  RedirectAttributes redirectAttributes ) {
		
		// En caso de errores en el formulario
		if ( bindingResult.hasErrors() ) {
			for ( ObjectError error: bindingResult.getAllErrors() ) {
				System.out.println("Ocurrio un error: " + error.getDefaultMessage() );
			}
			return "vacantes/formVacante";
		}
		
		// En caso de todo correcto
		serviceVacantes.guardar(vacante);
		
		redirectAttributes.addFlashAttribute("msg", "Registro agregado con exito!!");
		
		return "redirect:/vacantes/index";
	}
	

	// Mapea a la url donde podremos observar el detalle de una vacante por el id dinamico
	@GetMapping("/view/{id}")
	public String verDetalle( @PathVariable("id") int idVacante, Model model) {
		
		Vacante vacante = serviceVacantes.buscarPorId( idVacante );
		
		model.addAttribute("vacante", vacante);
		
		
		// TODO: Buscar los detalles de la vacante en la BD
		
		return "detalle";
	}
	
	
	
	// Nos permite que spring le de formato a las fechas con el data binding
	@InitBinder
	public void initBinder( WebDataBinder webDataBinder ) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor( Date.class , new CustomDateEditor(dateFormat, false));		
	}
	
	
	
	
	// Nos permite mediante el mapeo obtener el id dinamico para eliminar un registro especifico
	@GetMapping("/delete")
	public String eliminar( @RequestParam("id") int idVacante, Model model) {
		
		// TODO: Eliminar vacante en la BD
		
		System.out.println("Borrando vacante con ID: " + idVacante);
		
		model.addAttribute("id", idVacante);
		
		return "mensaje";
	}
	
	
	
	
	
	
	/*
	 * REFERECIAS
	 */
	
	
	/*  REFERENCIA DE COMO SE PUEDE GUARDAR LOS DATOS DEL FORMULARIO
	 
	 
	@PostMapping("/save")
	public String guardar(
							@RequestParam("nombre") String nombre,
							@RequestParam("descripcion") String descripcion,
							@RequestParam("estatus") String estatus,
							@RequestParam("fecha") String fecha,
							@RequestParam("destacado") int destacado,
							@RequestParam("salario") double salario,
							@RequestParam("detalles") String detalles
			
						) {
		
		System.out.println("Nombre vacante: " + nombre);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Estatus: " + estatus);
		System.out.println("Fecha publicación: " + fecha);
		System.out.println("Destacado: " + destacado);
		System.out.println("Salario ofrecido: " + salario);
		System.out.println("Detalles Oferta: " + detalles);
		
		return "vacantes/listVacantes";
	}
*/
	
}
