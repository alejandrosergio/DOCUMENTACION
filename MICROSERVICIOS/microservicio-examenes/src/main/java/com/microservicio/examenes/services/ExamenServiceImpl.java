package com.microservicio.examenes.services;

import org.springframework.stereotype.Service;

import com.microservicio.commons.services.CommonServiceImpl;
import com.microservicio.examenes.models.entity.Examen;
import com.microservicio.examenes.models.repository.IExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, IExamenRepository> implements IExameneService  {

	
}