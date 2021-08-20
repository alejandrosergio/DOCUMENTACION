package com.microservicio.commons.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservicio.commons.services.ICommonService;


public class CommonController<E, S extends ICommonService<E>> {

	
	// TODO: INYECCIÓNES
	
	
		/*
		 * Inyección de la interfaz S llega en el generico
		 */
		@Autowired
		protected S service;
		
	
		
	//TODO: MÉTODOS MAPPING
	
		
	
		/*
		 *  Listar registros
		 */
		@GetMapping
		public ResponseEntity<?> listarRegistros(){
			return ResponseEntity.ok().body(service.findAll());
		}
		
		
		
		/*
		 *  Buscar registro por su ID
		 */
		@GetMapping("/{id}")
		public ResponseEntity<?> verRegistroId(@PathVariable(name = "id") Long idRegistro){
			
			Optional<E> optional = service.findById(idRegistro); // -> opcional devuelve o no
			
			if (optional.isEmpty()) { // -> si no devuelve el alumno
				
				return ResponseEntity.notFound().build(); // -> retorno de noFound
			}
			
			return ResponseEntity.ok(optional.get()); // -> retorno de alumno
		}
		
		
		
		/*
		 *  Guardar - persistir registro
		 */
		@PostMapping
		public ResponseEntity<?> guardarRegistro(@RequestBody E registro){
			return ResponseEntity.status(HttpStatus.CREATED).body(service.save(registro));	 
		}
	
		
		
		
		/*
		 *  Eliminar registros
		 */
		@DeleteMapping("/{id}")
		public ResponseEntity<?> eliminarRegistro(@PathVariable(name = "id") Long idRegistro){
			service.deleteById(idRegistro);
				return ResponseEntity.noContent().build();
		}
	
}
