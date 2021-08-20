package com.microservicio.alumnos.services;

import org.springframework.stereotype.Service;

import com.microservicio.commons.alumnos.models.entity.Alumno;
import com.microservicio.alumnos.models.repository.IAlumnoRepository;
import com.microservicio.commons.services.CommonServiceImpl;



@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, IAlumnoRepository> implements IAlumnoService {
	
	
	
}
