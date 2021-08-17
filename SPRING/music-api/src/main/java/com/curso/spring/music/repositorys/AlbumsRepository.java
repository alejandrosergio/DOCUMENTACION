package com.curso.spring.music.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.music.models.AlbumsModel;

public interface AlbumsRepository extends JpaRepository<AlbumsModel, Integer> {

	 
	
}