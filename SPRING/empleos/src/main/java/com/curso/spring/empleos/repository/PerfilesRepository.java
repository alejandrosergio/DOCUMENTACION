package com.curso.spring.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.empleos.models.Perfil;

public interface PerfilesRepository extends JpaRepository<Perfil, Integer> {

}