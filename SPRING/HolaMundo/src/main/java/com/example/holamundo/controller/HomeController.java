package com.example.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/") // La diagonal responde a la raiz del proyecto cuando se haga la petición HTTP
	public String inicio() {
		return "Hola mundo";
	}
	
}
