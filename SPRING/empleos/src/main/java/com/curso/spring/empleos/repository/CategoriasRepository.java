package com.curso.spring.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.empleos.models.Categoria;


public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}