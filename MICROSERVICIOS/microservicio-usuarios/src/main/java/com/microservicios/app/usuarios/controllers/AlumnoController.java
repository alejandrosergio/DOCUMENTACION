package com.microservicios.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.app.usuarios.models.entity.Alumno;
import com.microservicios.app.usuarios.services.IAlumnoService;

@RestController
public class AlumnoController {

	
	// TODO: INYECCIÓNES
	
	
		/*
		 * Inyección de la interfaz alumno service 
		 */
		@Autowired
		private IAlumnoService alumnoService;
		
	
	
		
		
	//TODO: MÉTODOS MAPPING
	
		
	
		/*
		 *  Listar alumnos en la ruta raiz
		 */
		@GetMapping
		public ResponseEntity<?> listarAlumnos(){
			return ResponseEntity.ok().body(alumnoService.findAll());
		}
		
		
		
		/*
		 *  Buscar alumno por su ID en la ruta raiz
		 */
		@GetMapping("/{id}")
		public ResponseEntity<?> verAlumno(@PathVariable(name = "id") Long idAlumno){
			
			Optional<Alumno> optional = alumnoService.findById(idAlumno); // -> opcional devuelve o no
			
			if (optional.isEmpty()) { // -> si no devuelve el alumno
				
				return ResponseEntity.notFound().build(); // -> retorno de noFound
			}
			
			return ResponseEntity.ok(optional.get()); // -> retorno de alumno
		}
		
		
		
		/*
		 *  Guardar- persistir alumno en la ruta raiz
		 */
		@PostMapping
		public ResponseEntity<?> guardarAlumno(@RequestBody Alumno alumno){
			return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumno));	 
		}
	
		
		
		/*
		 *  Actualizar- persistir alumno en la ruta raiz
		 */
		@PutMapping("/{id}")
		public ResponseEntity<?> actualizarAlumno(@RequestBody Alumno alumno, @PathVariable(name = "id") Long idAlumno){
			
			Optional<Alumno> optional = alumnoService.findById(idAlumno); // -> opcional devuelve o no
			
			if (optional.isEmpty()) { // -> si no devuelve el alumno
				
				return ResponseEntity.notFound().build(); // -> retorno de noFound
			}
				
			// -> si devuelve
			Alumno alumnoBD = optional.get(); // -> obtenemos el alumno del opcional
			
			// -> Establecemos valores de RequestBody
			alumnoBD.setNombre(alumno.getNombre());
			alumnoBD.setApellido(alumno.getApellido());
			alumnoBD.setEmail(alumno.getEmail());
			
			return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoBD)); // -> retorno de alumno actualizado
			
		}
		
		
		/*
		 *  Eliminar alumno en la ruta raiz
		 */
		@DeleteMapping("/{id}")
		public ResponseEntity<?> eliminarAlumno(@PathVariable(name = "id") Long idAlumno){
				alumnoService.deleteById(idAlumno);
				return  ResponseEntity.noContent().build();
		}
		
	
}







