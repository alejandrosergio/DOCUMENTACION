package com.microservicio.cursos.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.microservicio.cursos.models.entity.Curso;

public interface ICursoRepository extends JpaRepository<Curso, Long> {
	
	
	// Buscar curso donde conincida con el id del alumno
	@Query("SELECT curso FROM Curso curso JOIN FETCH curso.alumnos alumno WHERE alumno.id=?1")
	public Curso findCursoByAlumnoId(Long idAlumno);

}