package com.microservicio.alumnos.services;

import java.util.List;

import com.microservicio.commons.alumnos.models.entity.Alumno;
import com.microservicio.commons.services.ICommonService;

public interface IAlumnoService extends ICommonService<Alumno>{

	// Buscar alumnos por su nombre o apellido, retorna una lista de tipo alumno
	public List<Alumno> findByNombreOrApellido(String termino);
	
}