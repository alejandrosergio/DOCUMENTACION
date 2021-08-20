package com.microservicio.cursos.services;

import org.springframework.stereotype.Service;

import com.microservicio.commons.services.CommonServiceImpl;
import com.microservicio.cursos.models.entity.Curso;
import com.microservicio.cursos.models.repository.ICursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, ICursoRepository> implements ICursoService{


}