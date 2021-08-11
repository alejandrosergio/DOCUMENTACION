package com.curso.spring.empleos.services;

import java.util.List;

import com.curso.spring.empleos.models.Categoria;

public interface ICategoriaService {
	
	// Debemos permitir guardar una categoria
	void guardar( Categoria categoria );
	
	
	
	// Debemos obtener las categorias en una lista
	List<Categoria> obtenerCategorias();
	
	
	
	// Debemos buscar una categoria por su ID
	Categoria buscarPorID(Integer id);
	
	
	
	// Debemos eliminar una vacante por su ID
	void eliminar(Integer idVacante);
	

}