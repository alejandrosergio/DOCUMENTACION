package com.curso.spring.empleos.controllers;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.spring.empleos.models.Vacante;
import com.curso.spring.empleos.services.IVacantesService;

@Controller
public class HomeController {
	
	
	@Autowired
	private IVacantesService serviceVacantes;
	
	
	// HOME

	@GetMapping("/")
	public String mostrarHome(Model model) {
												
		List<Vacante> lista = serviceVacantes.obtenerVacantes();
		
		model.addAttribute("vacantes", lista);

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
		vacante.setNombre("Ingeniero de comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);

		// AGREGAMOS LA VACANTE AL CONTROLADOR - VISTA
		model.addAttribute("vacante", vacante);

		return "detalle"; // Llamamos la vista
	}
	
	
	
	
	// TABLA
	
	@GetMapping("/tabla")
	public String mostrarVacante( Model model) {
		
		List<Vacante> lista =  serviceVacantes.obtenerVacantes();
		model.addAttribute("vacantes", lista);
		
		return "tabla";
	}
	
	

}