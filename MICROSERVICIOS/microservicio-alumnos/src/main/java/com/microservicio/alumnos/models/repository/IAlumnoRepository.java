package com.microservicio.alumnos.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.alumnos.models.entity.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {

	
}
