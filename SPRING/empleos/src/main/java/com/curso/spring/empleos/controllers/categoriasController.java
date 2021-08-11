package com.curso.spring.empleos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.curso.spring.empleos.models.Categoria;
import com.curso.spring.empleos.services.ICategoriaService;

@Controller
@RequestMapping(value = "/categorias")
public class categoriasController {
	
	
	// INYECTAMOS LA INTERFACE ICATEGORIAS-SERVICE
	@Autowired
	//@Qualifier("categoriaServiceJpa")
	private ICategoriaService categoriaService;
	
	
	// Listado de categorias obtenemos del servicio
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		
		List<Categoria> categorias = categoriaService.obtenerCategorias();
		
		model.addAttribute("categorias", categorias);
		
		return "categorias/listCategorias";
	}
	
	
	
	
	// Mapea a la url donde se encunetra el formulario para crear una cateoria
	@GetMapping("/create")
	public String crear(Categoria categoria) {
		return "categorias/formCategoria";
	}
	
	
	
	
	// Mapea a la url donde se ara el data binding y retornara la vista de las listas de vacantes
	@PostMapping("/save")
	public String guardar( Categoria categoria, BindingResult bindingResult,  RedirectAttributes redirectAttributes ) {
		
		// En caso de errores en el formulario
		if ( bindingResult.hasErrors() ) {
			for ( ObjectError error: bindingResult.getAllErrors() ) {
				System.out.println("Ocurrio un error: " + error.getDefaultMessage() );
			}
			return "categorias/formCategoria";
		}


		// En caso de todo correcto
		categoriaService.guardar(categoria);
		
		redirectAttributes.addFlashAttribute("msg", "Registro agregado con exito!!");
		
		return "redirect:/categorias/index";
	}

}
