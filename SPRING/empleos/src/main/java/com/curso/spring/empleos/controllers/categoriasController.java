package com.curso.spring.empleos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping( value="/categorias") // A NIVEL CLASE
public class categoriasController {
	
	
	// @RequestMapping( value="/index", method=RequestMethod.GET ) // A NIVEL METODO
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		return "categorias/listCategorias";
	}
	
	
	// @GetMapping("/create")
	
	@RequestMapping( value="/create", method=RequestMethod.GET )
	public String crear() {
		return "categorias/formCategoria";
	}
	
	
	
	// @PostMapping("/save")
	
	@RequestMapping( value="/save", method=RequestMethod.POST )
	public String guardar( @RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion ) {
		
		System.out.println("Categoria: " + nombre);
		System.out.println("Descripcion: " + descripcion);
		
		return "categorias/listCategorias";
	}

}
