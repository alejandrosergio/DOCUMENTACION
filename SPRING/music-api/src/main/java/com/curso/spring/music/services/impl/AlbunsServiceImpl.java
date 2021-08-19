package com.curso.spring.music.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.music.models.AlbumsModel;
import com.curso.spring.music.repositorys.AlbumsRepository;
import com.curso.spring.music.services.IAlbumService;

@Service
public class AlbunsServiceImpl implements IAlbumService {
	
	
	@Autowired
	private AlbumsRepository albumsRepository;
	

	// OBTENEMOS TODOS LOS REGISTROS DE ALBUNES EN LA BD
	@Override
	public List<AlbumsModel> buscarAlbunes() {
		return albumsRepository.findAll();
	}


	// GUARDAMOS UN ALBUN EN LA BD
	@Override
	public void guardarAlbum(AlbumsModel albumsModel) {
		albumsRepository.save(albumsModel);
	}


	// ELIMINAMOS UN ALBUN DE LA BD
	@Override
	public void eliminarAlbum(int idAlbum) {
		albumsRepository.deleteById(idAlbum);
	}


	@Override
	public void buscarId(int idMusic) {
		
		albumsRepository.findById(idMusic);
		
	}


	

	
}