package com.curso.spring.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.empleos.models.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByUsername(String username);

}