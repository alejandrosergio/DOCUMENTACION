package com.microservicio.cursos.services;

import com.microservicio.commons.services.ICommonService;
import com.microservicio.cursos.models.entity.Curso;

public interface ICursoService extends ICommonService<Curso> {
	
	// Buscar curso donde conincida con el id del alumno
	public Curso findCursoByAlumnoId(Long idAlumno);

}