package com.curso.spring.empleos.services;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.curso.spring.empleos.models.Vacante;

public interface IVacantesService {

	// Debemos guardar vacante
	void guardar(Vacante vacante);

	// Debemos obtener una lista de vacantes
	List<Vacante> obtenerVacantes();

	// Debemos bucar vacante por su ID
	Vacante buscarPorId(Integer idVacante);

	// Dbemos buscar vacantes destacadas
	List<Vacante> buscarDestacadas();

	// Debemos eliminar una vacante por su ID
	void eliminar(Integer idVacante);

	// Debemos tener filtro de vacantes en el menu home
	List<Vacante> buscarByExample(Example<Vacante> example); // Método de consulta por muestra -> se forma unca consulta
																// tipo select en donde las condiciones del where se
																// forma dinamicamente en base a la clase de modelo que
																// pasemos como parametro en este caso vacante, se forma
																// dependiendo de los atributos definidos en el metodo
																// -> no null

	// Debemos implemetar una paginacion en la tabla
	Page<Vacante> buscarTodas(Pageable page);

}