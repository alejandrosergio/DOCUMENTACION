package com.curso.spring.empleos.services;

import java.util.List;

import com.curso.spring.empleos.models.Vacante;

public interface IVacantesService {
	
	
	// Debemos guardar vacante
	void guardar(Vacante vacante);
	
	
	
	// Debemos obtener una lista de vacantes
	List<Vacante> obtenerVacantes();
	
	
	
	// Debemos bucar vacante por su ID
	Vacante buscarPorId(Integer idVacante);
	
	
	List<Vacante> buscarDestacadas();
	
	
	

}