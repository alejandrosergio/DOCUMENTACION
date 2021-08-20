package com.microservicio.commons.services;

import java.util.Optional;


public interface ICommonService<E> {

	
	/*
	 * Debemos listar todos los registros 
	 */
	public Iterable<E> findAll();
	
	
	/*
	 *  Denbemos buscar un registro por ID
	 */
	public Optional<E> findById(Long ID);
	
	
	/*
	 *  Debemos guardar - persistir un registro en la BD
	 */
	public E save(E enty);
	
	
	/*
	 * Debemos eliminar un registro en la BD
	 */
	public void deleteById(Long ID);
	
	
}