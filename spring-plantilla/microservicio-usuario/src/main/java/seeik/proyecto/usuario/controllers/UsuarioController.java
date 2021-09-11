package seeik.proyecto.usuario.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import seeik.proyecto.commons.controller.CommonController;
import seeik.proyecto.usuario.models.UsuarioModel;
import seeik.proyecto.usuario.services.IUsuarioService;

@RestController
public class UsuarioController extends CommonController<UsuarioModel, IUsuarioService> {

	//TODO: MÉTODOS MAPPING
	
	
		// Actualizar- persistir alumno
		@PutMapping("/{id}")
		public ResponseEntity<?> actualizarUsuario( @RequestBody UsuarioModel usuario, @PathVariable(name = "id") Long idusuario ){
			
			Optional<UsuarioModel> optional = this.service.findById(idusuario); // -> opcional devuelve o no un usuario
			
			if (optional.isEmpty()) { // -> si esta vacio
				
				return ResponseEntity.notFound().build();
			}
			
			UsuarioModel usuarioBD = optional.get(); // -> obtenemos el alumno del opcional
			
			
			// -> Establecemos valores de RequestBody
			usuarioBD.setNombre(usuario.getNombre());
			usuarioBD.setApellido(usuario.getApellido());
			usuarioBD.setEmail(usuario.getEmail());
			
			return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(usuarioBD)); // -> retorno de alumno actualizado
			
		}
}
