package com.microservicios.app.alumnos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicios.app.alumnos.models.entity.Alumno;
import com.microservicios.app.alumnos.models.repository.IAlumnoRepository;


@Service
public class AlumnoServiceImpl implements IAlumnoService {
	
	/*
	 *  Inyección del repositorio alumno
	 */
	@Autowired
	private IAlumnoRepository alumnoRepository;
	

	/*
	 * Listar todos los alumnos 
	 */
	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		return alumnoRepository.findAll();
	}
	
	
	/*
	 *  Buscar un alumno por ID
	 */
	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long ID) {
		return alumnoRepository.findById(ID);
	}
	

	/*
	 *  Guardar - persistir un alumno en la BD
	 */
	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	
	/*
	 *  Eliminar un alumno en la BD
	 */
	@Override
	@Transactional
	public void deleteById(Long ID) {
		alumnoRepository.deleteById(ID);
	}
	

}
