package com.curso.spring.empleos.services.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.empleos.models.Usuario;
import com.curso.spring.empleos.repository.UsuariosRepository;
import com.curso.spring.empleos.services.IUsuariosService;


@Service
public class UsuariosServiceJpa implements IUsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	public void guardar(Usuario usuario) {
		usuariosRepository.save(usuario);
	}

	public void eliminar(Integer idUsuario) {
		usuariosRepository.deleteById(idUsuario);
	}

	public List<Usuario> buscarTodos() {
		return usuariosRepository.findAll();
	}

	@Override
	public Usuario buscarPorUsername(String username) {
		return usuariosRepository.findByUsername(username);
	}


}