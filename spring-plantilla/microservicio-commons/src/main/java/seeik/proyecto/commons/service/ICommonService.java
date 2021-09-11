package seeik.proyecto.commons.service;

import java.util.Optional;

public interface ICommonService<E>{

	
	
	// Listar todos los registros 
	public Iterable<E> findAll();
	
	
	// Buscar registro por ID
	public Optional<E> findById(Long ID);
	
	
	// Persistir registro en la BD
	public E save(E enty);
	
	
	// Eliminar registro en la BD
	public void deleteById(Long ID);
	
	
}