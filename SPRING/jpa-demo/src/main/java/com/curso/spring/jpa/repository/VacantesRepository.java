package com.curso.spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.jpa.models.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer> {
	
	

}
