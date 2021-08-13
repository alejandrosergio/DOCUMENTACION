package com.curso.spring.empleos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.curso.spring.empleos.services.IUsuariosService;

@Controller
@RequestMapping(value = "/usuarios")
public class UsuariosController {

	
    @Autowired
	private IUsuariosService serviceUsuarios;
    
    
    
   @GetMapping("/index")
	public String mostrarIndex(Model model) {
    	
    	model.addAttribute("usuarios", serviceUsuarios.buscarTodos());
    	
		return "usuarios/listUsuarios";
	}
   
    
    @GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idUsuario, RedirectAttributes attributes) {	
    	
		// Eliminamos el usuario
    	serviceUsuarios.eliminar(idUsuario);
    	
		attributes.addFlashAttribute("msgDelete", "El usuario fue eliminado!.");
		
		return "redirect:/usuarios/index";
	}
}