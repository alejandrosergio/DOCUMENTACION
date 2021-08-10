package com.curso.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.jpa.models.Categoria;

// CrudRepository
//public interface CategoriasRepository extends CrudRepository<Categoria, Integer>

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}