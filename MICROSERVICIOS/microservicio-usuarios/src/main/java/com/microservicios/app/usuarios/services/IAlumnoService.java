package com.microservicios.app.usuarios.services;

import java.util.Optional;

import com.microservicios.app.usuarios.models.entity.Alumno;


public interface IAlumnoService {

	/*
	 * Debemos listar todos los alumnos 
	 */
	public Iterable<Alumno> findAll();
	
	
	/*
	 *  Denbemos buscar un alumno por ID
	 */
	public Optional<Alumno> findById(Long ID);
	
	
	/*
	 *  Debemos guardar - persistir un alumno en la BD
	 */
	public Alumno save(Alumno alumno);
	
	
	/*
	 * Debemos eliminar un alumno en la BD
	 */
	public void deleteById(Long ID);
	
	
}