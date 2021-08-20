package com.microservicio.alumnos.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.alumnos.services.IAlumnoService;
import com.microservicio.commons.alumnos.models.entity.Alumno;
import com.microservicio.commons.controllers.CommonController;


@RestController
public class AlumnoController extends CommonController<Alumno, IAlumnoService>{
		
		
	//TODO: MÉTODOS MAPPING
	
		
		/*
		 *  Actualizar- persistir alumno
		 */
		@PutMapping("/{id}")
		public ResponseEntity<?> actualizarAlumno(@RequestBody Alumno alumno, @PathVariable(name = "id") Long idAlumno){
			
			Optional<Alumno> optional = this.service.findById(idAlumno); // -> opcional devuelve o no
			
			if (optional.isEmpty()) { // -> si no devuelve el alumno
				
				return ResponseEntity.notFound().build(); // -> retorno de noFound
			}
				
			// -> si devuelve
			Alumno alumnoBD = optional.get(); // -> obtenemos el alumno del opcional
			
			// -> Establecemos valores de RequestBody
			alumnoBD.setNombre(alumno.getNombre());
			alumnoBD.setApellido(alumno.getApellido());
			alumnoBD.setEmail(alumno.getEmail());
			
			return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(alumnoBD)); // -> retorno de alumno actualizado
			
		}
		
		
		/*
		 * Filtrar alumnos mediante el termino enviado por nombre y apellido
		 * 
		 */
		@GetMapping("/filtrar/{term}")
		public ResponseEntity<?> filtrarAlumnos(@PathVariable(name = "term") String termino){
			return ResponseEntity.ok(this.service.findByNombreOrApellido(termino));
		}
		
	
}
