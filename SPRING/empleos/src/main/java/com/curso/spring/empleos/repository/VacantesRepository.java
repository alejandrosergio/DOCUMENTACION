package com.curso.spring.empleos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.empleos.models.Vacante;

public interface VacantesRepository extends JpaRepository<Vacante, Integer> {
	
	List<Vacante> findByDestacadoAndEstatusOrderByIDDesc(Integer destacado, String status);
	
}