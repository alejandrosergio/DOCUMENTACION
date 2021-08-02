package com.curso.spring.empleos.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String mostrarHome( Model model ) { // Parametro de tipo model -> podemos agregar cualquier tipo de dato al modelo
		model.addAttribute( "mensaje" , "Bienvenidos a EmpleosApp" ); // Agregamos un atributo que se puede usar en el home
		model.addAttribute( "fecha" , new Date() ); // Agregamos atributo de la fecha del sistema
		return "home"; // retorno de la vista
	}
		
}