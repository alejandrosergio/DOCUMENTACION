package com.microservicio.cursos.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.cursos.models.entity.Curso;

public interface ICursoRepository extends JpaRepository<Curso, Long> {

}