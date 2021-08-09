package com.curso.spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.spring.jpa.models.Categoria;

public interface CategoriasRepository extends CrudRepository<Categoria, Integer> {

}