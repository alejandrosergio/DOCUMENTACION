package com.curso.spring.empleos.services.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.curso.spring.empleos.models.Categoria;
import com.curso.spring.empleos.repository.CategoriasRepository;
import com.curso.spring.empleos.services.ICategoriaService;


@Service
@Primary
public class CategoriaServiceJpa implements ICategoriaService { // Lo implementamos a obligar a usar esos métodos
	
	
	// INYECCION DE CATEGORIA-REPOSITORY
	@Autowired
	private CategoriasRepository categoriasRepository; // Inyectamos para tener acceso a sus métodos CRUD y más
	
	
	
	
	// GUARDAR UNA CATEGORIA
	@Override
	public void guardar(Categoria categoria) {
		
		categoriasRepository.save(categoria);

	}
	

	// LISTAR TODAS LAS CATEGORIAS
	@Override
	public List<Categoria> obtenerCategorias() {
			
		return categoriasRepository.findAll();
	}

	
	
	// OBTENER UNA CATEGORIA POR ID
	@Override
	public Categoria bucarPorID(Integer idCategoria) {
		
		Optional<Categoria> optional =	categoriasRepository.findById(idCategoria);
		
		if ( optional.isPresent() ) {
			
			return optional.get();
		}
		
		return null;
	}

}
