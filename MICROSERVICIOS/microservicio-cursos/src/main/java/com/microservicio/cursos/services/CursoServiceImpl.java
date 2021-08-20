package com.microservicio.cursos.services;

import org.springframework.stereotype.Service;

import com.microservicio.commons.services.CommonServiceImpl;
import com.microservicio.cursos.models.entity.Curso;
import com.microservicio.cursos.models.repository.ICursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, ICursoRepository> implements ICursoService{
	
	
	// Buscar curso donde conincida con el id del alumno
	@Override
	public Curso findCursoByAlumnoId(Long idAlumno) {
		return entityRepository.findCursoByAlumnoId(idAlumno);
	}


}