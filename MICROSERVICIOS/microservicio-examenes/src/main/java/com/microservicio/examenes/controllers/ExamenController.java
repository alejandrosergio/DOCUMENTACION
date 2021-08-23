package com.microservicio.examenes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservicio.commons.controllers.CommonController;
import com.microservicio.examenes.models.entity.Examen;
import com.microservicio.examenes.services.IExameneService;

public class ExamenController extends CommonController<Examen, IExameneService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarExamen(@RequestBody Examen examen, @PathVariable(name = "id") Long idExamen){
		
		return null;
	}
	
}