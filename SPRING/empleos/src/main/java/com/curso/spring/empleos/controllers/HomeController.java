package com.curso.spring.empleos.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.spring.empleos.models.Vacante;

@Controller
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model) { // Parametro de tipo model -> podemos recibir cualquier tipo de dato al
												// metodo

		/*
		 * 
		 * model.addAttribute( "mensaje" , "Bienvenidos a EmpleosApp" ); // Agregamos un
		 * atributo que se puede usar en el home model.addAttribute( "fecha" , new
		 * Date() ); // Agregamos atributo de la fecha del sistema
		 * 
		 */

		// VARIABLES
		String nombre = "Auxiliar de contabilidad";
		Date fechaPub = new Date();
		double salario = 9000;
		boolean vigente = true;

		// AGREGAR VARIABLES AL MODELO
		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		return "home"; // retorno de la vista
	}

	@GetMapping("/listado")
	public String mostrarListado(Model model) {

		List<String> lista = new LinkedList<String>(); // Creamos una lista de tipo string enlasada.
		lista.add("Ingeniero de sistemas"); // Agregamos a la lista
		lista.add("Auxiliar de contabilidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");

		// AGREGAR LISTA AL MODELO
		model.addAttribute("empleos", lista);

		return "listado";

	}

	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {

		Vacante vacante = new Vacante(); // Creamos una variable de tipo Vacante: MODELO - CONTROLADOR

		// Establecemos los vaolres de la vacante
		vacante.setNombre("Ingeniero de comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9700.0);

		// AGREGAMOS LA VACANTE AL CONTROLADOR - VISTA
		model.addAttribute("vacante", vacante);

		return "detalle"; // Llamamos la vista
	}
	
	
	@GetMapping("/tabla")
	public String mostrarVacante( Model model) {
		
		List<Vacante> lista = getVacantes();  // Creamos una lista de tipo Vacante y le damos el valor de las vacantes que hay en el método getVacantes
		model.addAttribute("vacantes", lista); // Creamos un atributo MODELO : VISTA
		
		return "tabla";
	}
	
	
	////////// <--------- MÉTODOS OBTENCIÓN ---------> //////////

	/*
	 * 
	 * Método que regresa una lista de objetos de tipo vacante
	 * 
	 * @return
	 * 
	 */

	private List<Vacante> getVacantes(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Darle formato a nuestras fechas
		List<Vacante> lista = new LinkedList<Vacante>(); // Lista de vacantes de tipo Vacante
		
		try {
			
			// OFERTA TRABAJO 1
			Vacante vacante1 = new Vacante();
			
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero Civil");
			vacante1.setDescripcion("Solicitamos ing. civil para diseñar puente peatonal.");
			vacante1.setFecha( sdf.parse("10-02-2021") );
			vacante1.setSalario(8500.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");
			
			// OFERTA TRABAJO 2
			Vacante vacante2 = new Vacante();
			
			vacante2.setId(2);
			vacante2.setNombre("Contador publico");
			vacante2.setDescripcion("Empresa importante solicita contador con 5 años de experiencia titulado.");
			vacante2.setFecha( sdf.parse("11-03-2021") );
			vacante2.setSalario(12000.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");
			
			// OFERTA TRABAJO 3
			Vacante vacante3 = new Vacante();
			
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero electrico");
			vacante3.setDescripcion("Empresa importante solicita ingeniero mecánico para mantenimiento de la instalación eléctrica.");
			vacante3.setFecha( sdf.parse("12-04-2021") );
			vacante3.setSalario(10500.0);
			vacante3.setDestacado(0);
			
			// OFERTA TRABAJO 1
			Vacante vacante4 = new Vacante();
			
			vacante4.setId(4);
			vacante4.setNombre("Diseñador grafico");
			vacante4.setDescripcion("Solicitamos Diseñador Gráfico titulado para el diseño y publicidad de la empresa.");
			vacante4.setFecha( sdf.parse("13-05-2021") );
			vacante4.setSalario(7500.0);
			vacante4.setDestacado(1);
			vacante4.setImagen("empresa4.png");
			
			
			// AGREGAMOS LAS VACANTES A LA LISTA
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			
		}	 catch (ParseException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
		return lista;	
		
		
	}
	
	
	
	
	
	
	
	

}