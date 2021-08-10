package com.curso.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.jpa.models.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
