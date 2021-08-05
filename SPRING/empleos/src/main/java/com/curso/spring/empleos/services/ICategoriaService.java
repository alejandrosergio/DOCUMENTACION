package com.curso.spring.empleos.services;

import java.util.List;

import com.curso.spring.empleos.models.Categoria;

public interface ICategoriaService {
	
	// Debemos permitir guardar una categoria
	void guardar( Categoria categoria);
	
	// Debemos obtener las categorias
	List<Categoria> obtenerCategorias();
	
	// Debemos buscar una categoria en especifico por su ID
	Categoria bucarPorID(Integer id);
	

}