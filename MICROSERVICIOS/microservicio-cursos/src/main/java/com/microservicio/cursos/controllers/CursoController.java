package com.microservicio.cursos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.commons.alumnos.models.entity.Alumno;
import com.microservicio.commons.controllers.CommonController;
import com.microservicio.cursos.models.entity.Curso;
import com.microservicio.cursos.services.ICursoService;


@RestController
public class CursoController extends CommonController<Curso, ICursoService>{

	//TODO: MÉTODOS MAPPING
	
	
			/*
			 *  Actualizar- persistir Curso
			 *  
			 */
			@PutMapping("/{id}")
			public ResponseEntity<?> actualizarCurso(@RequestBody Curso curso, @PathVariable(name = "id") Long idCurso){
				
				Optional<Curso> optional = this.service.findById(idCurso); // -> opcional devuelve o no un curso
				
				if (optional.isEmpty()) { // -> si no devuelve el curso
					
					return ResponseEntity.notFound().build(); // -> retorno de noFound
				}
					
				// -> si devuelve curso
				Curso cursoDB = optional.get(); // -> obtenemos el curso del opcional
				
				// -> Establecemos valores de RequestBody
				cursoDB.setNombre(curso.getNombre());
				
				return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(cursoDB)); // -> retorno curso actualizado
				
			}
			
			
			
			/*
			 *  Agregar alumnos al curso en la bd
			 * 
			 */
			@PutMapping("/{id}/asignar-alumnos")
			public ResponseEntity<?> asignarAlumnos(@RequestBody List<Alumno> alumnos, @PathVariable(name = "id") Long idCurso){
				
				Optional<Curso> optional = this.service.findById(idCurso); // -> opcional devuelve o no un curso
				
				if (optional.isEmpty()) { // -> si no devuelve el curso
					
					return ResponseEntity.notFound().build(); // -> retorno de noFound
				}
				
				// -> si devuelve curso
				Curso cursoDB = optional.get(); // -> obtenemos el curso del opcional
				
				alumnos.forEach( a -> {
						cursoDB.addAlumno(a); // -> agregamos un alumno por cada iteración
				});
				
				return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(cursoDB)); // -> retorno curso actualizado
				
			}
			
			
			
			/*
			 *  Eliminar un solo alumno al curso en la bd
			 * 
			 */
			@PutMapping("/{id}/eliminar-alumno")
			public ResponseEntity<?> eliminarAlumnos(@RequestBody Alumno alumno, @PathVariable(name = "id") Long idCurso){
				
				Optional<Curso> optional = this.service.findById(idCurso); // -> opcional devuelve o no un curso
				
				if (optional.isEmpty()) { // -> si no devuelve el curso
					
					return ResponseEntity.notFound().build(); // -> retorno de noFound
				}
				
				// -> si devuelve curso
				Curso cursoDB = optional.get(); // -> obtenemos el curso del opcional
			
					cursoDB.removeAlumno(alumno); // -> removemos un alumno del curso
	
				
				return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(cursoDB)); // -> retorno curso actualizado
				
			}
			
			
			
			/*
			 * Buscar un curso por el id del alumno
			 * 
			 */
			@GetMapping("/alumno/{id}")
			public ResponseEntity<?> buscarCursoPorAlumnoId(@PathVariable(name = "id") Long idAlumno){
				
				Curso curso = service.findCursoByAlumnoId(idAlumno); // -> obtenemos el curso con el id del alumno
				
				return ResponseEntity.ok(curso); // -> retornamos el curso
			}
			
			
}
