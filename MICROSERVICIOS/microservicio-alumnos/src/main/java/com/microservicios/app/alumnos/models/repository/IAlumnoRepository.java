package com.microservicios.app.alumnos.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicios.app.alumnos.models.entity.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {
	
	

}
