package com.microservicio.alumnos.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.microservicio.commons.alumnos.models.entity.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {

	
	// Buscar alumnos por su nombre o apellido
	@Query("SELECT alumno FROM Alumno alumno WHERE alumno.nombre LIKE %?1% OR alumno.apellido LIKE %?1%")
	public List<Alumno> findByNombreOrApellido(String termino);
	
}
