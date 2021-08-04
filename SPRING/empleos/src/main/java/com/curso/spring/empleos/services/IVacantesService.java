package com.curso.spring.empleos.services;

import java.util.List;

import com.curso.spring.empleos.models.Vacante;

public interface IVacantesService {
	
	List<Vacante> obtenerVacantes();
	
	Vacante buscarPorId(Integer idVacante);

}