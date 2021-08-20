package com.microservicio.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public class CommonServiceImpl< E , R extends JpaRepository<E, Long>> implements ICommonService<E> {
	
	/*
	 *  Inyección del repositorio Entity
	 */
	@Autowired
	protected R entityRepository;
	

	/*
	 * Listar todos los registros 
	 */
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		return entityRepository.findAll();
	}
	
	
	/*
	 *  Buscar un registro por ID
	 */
	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long ID) {
		return entityRepository.findById(ID);
	}
	

	/*
	 *  Guardar - persistir un registro en la BD
	 */
	@Override
	@Transactional
	public E save(E entity) {
		return entityRepository.save(entity);
	}

	
	/*
	 *  Eliminar un reistro en la BD
	 */
	@Override
	@Transactional
	public void deleteById(Long ID) {
		entityRepository.deleteById(ID);
	}
	

}
