package com.curso.spring.empleos.services.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.curso.spring.empleos.models.Categoria;
import com.curso.spring.empleos.services.ICategoriaService;

@Service
//@Primary
public class CategoriaServiceImpl implements ICategoriaService {

	// Creamos una lista donde almacenaremos las categorias de tipo Vacante -> modelo
	private List<Categoria> lista = null;
	
	
	// Guardar una nueva categoria en la lista
	@Override
	public void guardar(Categoria categoria) {
		lista.add(categoria);
	}

	// Obtener categorias
	@Override
	public List<Categoria> obtenerCategorias() {
		return lista;
	}

	
	// Buscar categorias por ID
	@Override
	public Categoria buscarPorID(Integer idCategoria) {
		
		for ( Categoria c: lista) {
			
			if ( c.getID() == idCategoria ) {
				
				return c;
			}
			
		}
		
		return null;
	}
	

	// Ya veremos
	public  CategoriaServiceImpl() {

		
		lista = new LinkedList<Categoria>();

		Categoria categoria = new Categoria();
		Categoria categoria1 = new Categoria();
		Categoria categoria2 = new Categoria();
		Categoria categoria3 = new Categoria();
		
		categoria.setID(1);
		categoria.setNombre("Programción");
		categoria.setDescripcion("Desarrollo de software y paginas web");
		
		categoria1.setID(2);
		categoria1.setNombre("Programción 1");
		categoria1.setDescripcion("Desarrollo de software y paginas web");
		
		categoria2.setID(3);
		categoria2.setNombre("Programción 2");
		categoria2.setDescripcion("Desarrollo de software y paginas web");
		
		categoria3.setID(4);
		categoria3.setNombre("Programción 3");
		categoria3.setDescripcion("Desarrollo de software y paginas web");

		lista.add(categoria);
		lista.add(categoria1);
		lista.add(categoria2);
		lista.add(categoria3);
	
		
	}

	@Override
	public void eliminar(Integer idVacante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
