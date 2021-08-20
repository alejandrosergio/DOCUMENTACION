package com.microservicio.alumnos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicio.commons.alumnos.models.entity.Alumno;
import com.microservicio.alumnos.models.repository.IAlumnoRepository;
import com.microservicio.commons.services.CommonServiceImpl;



@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, IAlumnoRepository> implements IAlumnoService {

	// MÉTODOS
	
		// Buscar alumnos por su nombre o apellido, retorna una lista de tipo alumno
		@Override
		public List<Alumno> findByNombreOrApellido(String termino) {
			return entityRepository.findByNombreOrApellido(termino);
		}
	
}
