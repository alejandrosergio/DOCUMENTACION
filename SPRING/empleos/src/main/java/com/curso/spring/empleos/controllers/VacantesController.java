package com.curso.spring.empleos.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
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
@RequestMapping(value = "/vacantes")
public class VacantesController {
	
	//=================================================== RUTAS ========================================================//
	
	
	// Obtener el valor de la propiedad especificada del fichero application.properties
	@Value("${ruta.imagenes}")
	private String ruta;
	
	
	//=================================================== INYECCIONES ===================================================//
	
	
	// INYECTAMOS LA INTERFACE IVACANTES-SERVICE
	@Autowired
	private IVacantesService vacantesService;
	
	
	// INYECTAMOS LA INTERFACE ICATEGORIAS-SERVICE
	@Autowired
    //@Qualifier("categoriaServiceJpa")
	private ICategoriaService categoriaService;
	
	
	
	//=================================================== MÉTODOS ======================================================//
	
	// Listaremos todas las vacantes -> OPCIONA!!!!!
	@GetMapping("/index")
	public String listar( Model model) {
		
		List<Vacante> vacantes = vacantesService.obtenerVacantes();
		
		model.addAttribute("vacantes", vacantes);
		
		return "vacantes/listVacantes";
	}
	
	
	// MÉTODO PAGINACION DE VACANTES	
	@GetMapping(value = "/indexPaginate")
	public String mostrarIndexPaginado(Model model, Pageable page) {
		
		Page<Vacante> lista = vacantesService.buscarTodas(page); 
		
		model.addAttribute("vacantes", lista);
		
		return "vacantes/listVacantes";
	}
	
	
	
	// Mapea a la url donde se encunetra el formulario para crear una vacante
	@GetMapping("/create")
	public String crear(Vacante vacante, Model model) {
		
		return "vacantes/formVacante";
	}
	
	
	
	// Mapea a la url donde se hara el data binding y retornara la vista de las listas de vacantes
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
		
		redirectAttributes.addFlashAttribute("msgCreate", "Registro guardado con exito!!");
		
		return "redirect:/vacantes/indexPaginate";
	}

	
	
	// Mapea a la url donde podremos observar el detalle de una vacante por el id dinamico
	@GetMapping("/view/{id}")
	public String verDetalle( @PathVariable("id") int idVacante, Model model) {
		
		Vacante vacante = vacantesService.buscarPorId( idVacante );
		
		model.addAttribute("vacante", vacante);
		
		
		return "detalle";
	}
	
	
	
	// EDITAR UNA VACANTE
	// ENVIAMOS EL ID AL FORMULARIO PARA POBLARLO
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") int idVacante,  Model model) {
		
		Vacante vacante = vacantesService.buscarPorId( idVacante );
		
		model.addAttribute("vacante", vacante);
		
		return "vacantes/formVacante";
	}
	
	
	
	
	// ELIMINAR UNA VACANTE
	// Nos permite mediante el mapeo obtener el id dinamico para eliminar un registro especifico
	@GetMapping("/delete/{id}")
	public String eliminar( @PathVariable("id") int idVacante, RedirectAttributes redirectAttributes) {
		
		vacantesService.eliminar(idVacante);
		
		redirectAttributes.addFlashAttribute("msgDelete", "Registro eliminado con exito!!");
		
		return "redirect:/vacantes/indexPaginate";
	}
	
	
	
	//=================================================== OTROS MÉTODOS ======================================================//
	
	// AGREGAMOS ATRIBUTOS AL MODELO PARA TODOS LOS MÉTODOS
	@ModelAttribute
	public void setGenericos(Model model) {
		
		model.addAttribute("categorias", categoriaService.obtenerCategorias() ); // Obtenemos categorias para el select del form
		
	}
	
	
	
	// Nos permite que spring le de formato a las fechas con el data binding
	@InitBinder
	public void initBinder( WebDataBinder webDataBinder ) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor( Date.class , new CustomDateEditor(dateFormat, false));		
	}
	
	
}
