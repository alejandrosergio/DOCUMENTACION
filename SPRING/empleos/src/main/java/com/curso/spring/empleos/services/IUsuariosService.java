package com.curso.spring.empleos.services;

import java.util.List;

import com.curso.spring.empleos.models.Usuario;


public interface IUsuariosService {

	void guardar(Usuario usuario);
	

	void eliminar(Integer idUsuario);
	

	List<Usuario> buscarTodos();
	
	
	Usuario buscarPorUsername(String username);
}