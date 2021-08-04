package com.curso.spring.empleos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	

	@GetMapping("/view/{id}")
	public String verDetalle( @PathVariable("id") int idVacante, Model model) {
		
		//System.out.println("ID-VACANTE: " + idVacante);
		
		model.addAttribute("idVacante", idVacante);
		
		
		// TODO: Buscar los detalles de la vacante en la BD
		
		return "vacantes/detalle";
	}
	
	
	@GetMapping("/delete")
	public String eliminar( @RequestParam("id") int idVacante, Model model) {
		
		System.out.println("Borrando vacante con ID: " + idVacante);
		
		model.addAttribute("id", idVacante);
		
		return "mensaje";
	}
	
}
