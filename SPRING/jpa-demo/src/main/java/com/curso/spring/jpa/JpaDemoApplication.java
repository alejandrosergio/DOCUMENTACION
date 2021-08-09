package com.curso.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.spring.jpa.repository.CategoriasRepository;

@SpringBootApplication
public class JpaDemoApplication  implements CommandLineRunner{
	
	
	// INYECCION CRUD-REPOSITORY
	@Autowired
	private CategoriasRepository categoriasRepository;

	// CORAZON DEL PROYECTO
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	
	// COMPILAR EL PROYECTO EN CONSOLA
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring DATA-JPA");
		System.out.println(categoriasRepository);
		
	}
	
	
	// METODOS IMPLEMENTADOS DE CRUD-REPOSITORY
	
	

}