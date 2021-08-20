package com.microservicio.cursos.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.commons.controllers.CommonController;
import com.microservicio.cursos.models.entity.Curso;
import com.microservicio.cursos.services.ICursoService;

@RestController
public class CursoController extends CommonController<Curso, ICursoService>{

	//TODO: MÉTODOS MAPPING
	
	
			/*
			 *  Actualizar- persistir Curso
			 */
			@PutMapping("/{id}")
			public ResponseEntity<?> actualizarCurso(@RequestBody Curso curso, @PathVariable(name = "id") Long idCurso){
				
				Optional<Curso> optional = this.service.findById(idCurso); // -> opcional devuelve o no
				
				if (optional.isEmpty()) { // -> si no devuelve el curso
					
					return ResponseEntity.notFound().build(); // -> retorno de noFound
				}
					
				// -> si devuelve
				Curso cursoDB = optional.get(); // -> obtenemos el alumno del opcional
				
				// -> Establecemos valores de RequestBody
				cursoDB.setNombre(curso.getNombre());
				
				return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(cursoDB)); // -> retorno de alumno actualizado
				
			}
			
			
}
