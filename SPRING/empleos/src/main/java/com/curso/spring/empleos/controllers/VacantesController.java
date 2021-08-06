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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.curso.spring.empleos.models.Vacante;
import com.curso.spring.empleos.services.ICategoriaService;
import com.curso.spring.empleos.services.IVacantesService;
import com.curso.spring.empleos.util.Utileria;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	
	
	@Autowired
	private IVacantesService vacantesService;
	
	@Autowired
	private ICategoriaService categoriaService;
	
	
	// Listaremos todas las vacantes
	@GetMapping("/index")
	public String listar( Model model) {
		
		List<Vacante> vacantes = vacantesService.obtenerVacantes();
		
		model.addAttribute("vacantes", vacantes);
		
		return "vacantes/listVacantes";
	}
	
	// Mapea a la url donde se encunetra el formulario para crear una vacante
	@GetMapping("/create")
	public String crear(Vacante vacante, Model model) {
		
		model.addAttribute("categorias", categoriaService.obtenerCategorias() );
		
		return "vacantes/formVacante";
	}
	
	
	// Mapea a la url donde se ara el data binding y retornara la vista de las listas de vacantes
	@PostMapping("/save")
	public String guardar( Vacante vacante, BindingResult bindingResult,  RedirectAttributes redirectAttributes, @RequestParam("archivoImagen") MultipartFile multiPart ) {
		
		// En caso de errores en el formulario
		if ( bindingResult.hasErrors() ) {
			for ( ObjectError error: bindingResult.getAllErrors() ) {
				System.out.println("Ocurrio un error: " + error.getDefaultMessage() );
			}
			return "vacantes/formVacante";
		}
		
		// Guardamos la imagen
		if (!multiPart.isEmpty()) { // si multiPart no llego nulo
			
			String ruta = "/Applications/DESKTOP/DOCUMENTACION/SPRING/empleos/empleos/img-vacantes/";
			
			String nombreImagen = Utileria.guardarArchivo( multiPart, ruta );
			
			// La imagen si se subio
			if (nombreImagen != null){
			
				// Procesamos la variable nombreImagen
				vacante.setImagen(nombreImagen); }
			}else {
				
				System.out.println("Error: No se establecio la imagen");
			}
		
		
		// En caso de todo correcto	
		vacantesService.guardar(vacante);
		
		System.out.println("Vacante: " + vacante);
		
		redirectAttributes.addFlashAttribute("msg", "Registro agregado con exito!!");
		
		return "redirect:/vacantes/index";
	}


	// Mapea a la url donde podremos observar el detalle de una vacante por el id dinamico
	@GetMapping("/view/{id}")
	public String verDetalle( @PathVariable("id") int idVacante, Model model) {
		
		Vacante vacante = vacantesService.buscarPorId( idVacante );
		
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
	
	
}
