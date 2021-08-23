package com.microservicio.examenes.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.examenes.models.entity.Examen;

public interface IExamenRepository extends JpaRepository<Examen, Long> {

}