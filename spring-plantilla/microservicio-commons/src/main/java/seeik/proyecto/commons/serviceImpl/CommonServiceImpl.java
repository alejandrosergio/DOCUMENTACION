package seeik.proyecto.commons.serviceImpl;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import seeik.proyecto.commons.service.ICommonService;

public class CommonServiceImpl< E , R extends JpaRepository< E, Long >> implements ICommonService<E> {
	

	// Inyeccion del repositorio-Entity
	protected R entityRepository;
	
	
	// Obtener registros de una tabla
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		return entityRepository.findAll();
	}

	
	// Obtener registro de una tabla por su ID
	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long ID) {
		return entityRepository.findById(ID);
	}

	
	// Persistir un registro en la BD
	@Override
	@Transactional
	public E save(E enty) {
		return entityRepository.save(enty);
	}

	
	// Eliminar registro en la BD
	@Override
	@Transactional
	public void deleteById(Long ID) {
		entityRepository.deleteById(ID);
	}


}