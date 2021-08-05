package com.curso.spring.empleos.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.empleos.models.Categoria;

@Service
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
	public Categoria bucarPorID(Integer idCategoria) {
		
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
		
		categoria.setiD(1);
		categoria.setNombre("Programción");
		categoria.setDescripcion("Desarrollo de software y paginas web");
		
		categoria1.setiD(2);
		categoria1.setNombre("Programción 1");
		categoria1.setDescripcion("Desarrollo de software y paginas web");
		
		categoria2.setiD(3);
		categoria2.setNombre("Programción 2");
		categoria2.setDescripcion("Desarrollo de software y paginas web");
		
		categoria3.setiD(4);
		categoria3.setNombre("Programción 3");
		categoria3.setDescripcion("Desarrollo de software y paginas web");

		lista.add(categoria);
		lista.add(categoria1);
		lista.add(categoria2);
		lista.add(categoria3);
	
	
		
	}

}
