package com.curso.spring.empleos.controllers;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.curso.spring.empleos.models.Vacante;
import com.curso.spring.empleos.services.IVacantesService;

@Controller
public class HomeController {
	
	
	@Autowired
	private IVacantesService serviceVacantes;
	
	
	// HOME
	
	
	@ModelAttribute
	public void setGenericos( Model model ) {
	
		// ATRIBUTO PARA VACANTES-DESTACADAS
		model.addAttribute("vacantesDestacadas", serviceVacantes.buscarDestacadas());
		
		// ATRIBUTO PARA VACANTES
		model.addAttribute("vacantes", serviceVacantes.obtenerVacantes());
	}
	
	
	

	// URL RAIZ NOS ENSEÑA LAS VACANTES DESTACADAS
	@GetMapping("/")
	public String mostrarHome(Model model) {

		return "home"; // retorno de la vista
		
	}
	
	
	
	
	// LISTADO

	@GetMapping("/listado")
	public String mostrarListado(Model model) {

		List<String> lista = new LinkedList<String>(); // Creamos una lista de tipo string enlasada.
		lista.add("Ingeniero de sistemas"); // Agregamos a la lista
		lista.add("Auxiliar de contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");

		// AGREGAR LISTA AL MODELO
		model.addAttribute("empleos", lista);

		return "listado";

	}
	
	
	
	
	// DETALLE

	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {

		Vacante vacante = new Vacante(); // Creamos una variable de tipo Vacante: MODELO - CONTROLADOR

		// Establecemos los vaolres de la vacante
		

		// AGREGAMOS LA VACANTE AL CONTROLADOR - VISTA
		model.addAttribute("vacante", vacante);

		return "detalle"; // Llamamos la vista
	}
	
	
	
	// TABLA
	
	@GetMapping("/tabla")
	public String mostrarVacante( Model model) {
		
		return "tabla";
	}
	
	

}