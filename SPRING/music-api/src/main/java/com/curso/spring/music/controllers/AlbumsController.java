package com.curso.spring.music.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.music.models.AlbumsModel;
import com.curso.spring.music.services.IAlbumService;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	
	@Autowired
	private IAlbumService albumService;
	
	
	
	// RETORNAMOS TODOS LOS REGISTROS DE ALBUNES EN LA BD
	@GetMapping("/albums")
	public List<AlbumsModel> obtenerAlbunes() {
		
		return  albumService.buscarAlbunes();
		
	}
	
	
	// GUARDAMOS UN ALBUN EN LA BD
	@PostMapping("/albums")
	public AlbumsModel guardarAlbum(@RequestBody AlbumsModel albumsModel) {
		
		albumService.guardarAlbum(albumsModel);
		
		return albumsModel;
		
	}
	
	
	// ACTUALIZAMOS UN ALBUN EN LA BD
	@PutMapping("/albums")
	public AlbumsModel actualizarAlbum(@RequestBody AlbumsModel albumsModel) {
		
		albumService.guardarAlbum(albumsModel);
		
		return albumsModel;
		
	}
	
	
	// ELIMINAMOS UN ALBUN DE LA BD
	@DeleteMapping("/albums/{id}")
	public String eliminarAlbum(@PathVariable("id") int idAlbum) {
		
		albumService.eliminarAlbum(idAlbum);
		
		return "Registro eliminado con exito...";
	}
	
	
}