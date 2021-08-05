package com.curso.spring.empleos.services;

import java.util.List;

import com.curso.spring.empleos.models.Vacante;

public interface IVacantesService {
	
	// Debemos implementar una lista de vacantes
	List<Vacante> obtenerVacantes();
	
	// Debemos bucar vacantes por su ID
	Vacante buscarPorId(Integer idVacante);
	
	// Debemos guardar nuevas vacantes
	void guardar(Vacante vacante);

}