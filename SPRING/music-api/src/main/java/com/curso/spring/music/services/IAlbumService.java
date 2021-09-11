package com.curso.spring.music.services;

import java.util.List;

import com.curso.spring.music.models.AlbumsModel;


public interface IAlbumService {

	// DEBEMOS OBTENER LOS REGISTROS DE ALBUNES EN LA BD
	List<AlbumsModel> buscarAlbunes();
	
	
	// DEBEMOS GUARDAR UN ALBUN EN LA BD
	void guardarAlbum(AlbumsModel albumsModel);
	
	
	// DEBEMOS ELIMINAR UN ALBUN EN LA BD
	void eliminarAlbum(int idAlbum);
	
	
	void buscarId(int idMusic);
	
}
