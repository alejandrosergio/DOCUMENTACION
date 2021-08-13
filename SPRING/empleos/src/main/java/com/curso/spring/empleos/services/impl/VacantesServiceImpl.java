package com.curso.spring.empleos.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.curso.spring.empleos.models.Vacante;
import com.curso.spring.empleos.services.IVacantesService;


@Service
public class VacantesServiceImpl implements IVacantesService {
	
	
	// Creamos una lista donde almacenaremos las vacantes de tipo Vacante -> modelo
	private List<Vacante> lista = null;
	
	
	// ya veremos
	public VacantesServiceImpl() {
		
		// TODO: Obtener vacantes de la base de datos
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Darle formato a nuestras fechas
		
		lista = new LinkedList<Vacante>(); // Lista de vacantes de tipo Vacante -> lista enlazada
		
		try {
			
			// OFERTA TRABAJO 1
			Vacante vacante1 = new Vacante();
			
			vacante1.setID(1);
			vacante1.setNombre("Ingeniero Civil");
			vacante1.setDescripcion("Solicitamos ing. civil para diseñar puente peatonal.");
			vacante1.setFecha( sdf.parse("10-02-2021") );
			vacante1.setSalario(18500.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("logo1.png");
			vacante1.setEstatus("Creada");
			
			// OFERTA TRABAJO 2
			Vacante vacante2 = new Vacante();
			
			vacante2.setID(2);
			vacante2.setNombre("Contador publico");
			vacante2.setDescripcion("Empresa importante solicita contador con 5 años de experiencia titulado.");
			vacante2.setFecha( sdf.parse("11-03-2021") );
			vacante2.setSalario(12000.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("logo2.png");
			vacante2.setEstatus("Aprobada");
			
			// OFERTA TRABAJO 3
			Vacante vacante3 = new Vacante();
			
			vacante3.setID(3);
			vacante3.setNombre("Ingeniero electrico");
			vacante3.setDescripcion("Empresa importante solicita ingeniero mecánico para mantenimiento de la instalación eléctrica.");
			vacante3.setFecha( sdf.parse("12-04-2021") );
			vacante3.setSalario(10500.0);
			vacante3.setDestacado(0);
			vacante3.setEstatus("Creada");
			
			// OFERTA TRABAJO 1
			Vacante vacante4 = new Vacante();
			
			vacante4.setID(4);
			vacante4.setNombre("Diseñador grafico");
			vacante4.setDescripcion("Solicitamos Diseñador Gráfico titulado para el diseño y publicidad de la empresa.");
			vacante4.setFecha( sdf.parse("13-05-2021") );
			vacante4.setSalario(7500.0);
			vacante4.setDestacado(1);
			vacante4.setImagen("logo4.png");
			vacante4.setEstatus("Aprobada");
			
			
			// AGREGAMOS LAS VACANTES A LA LISTA
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			
		}	 catch (ParseException e) {
			
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	
	// Retornamos las vacantes para ser obtenidad mediante inyeción de bin
	@Override
	public List<Vacante> obtenerVacantes() {	
		return lista;
	}

	

	// retornamos la vacante buscada por id que se encuenntre en la lista
	@Override
	public Vacante buscarPorId(Integer idVacante) {
		
		for ( Vacante v: lista) {
			
			if ( v.getID() == idVacante ) {
				
				return v;
			}
			
		}
		
		return null;
	}


	// Agregamos las vacantes a la lista
	@Override
	public void guardar(Vacante vacante) {
		lista.add(vacante);	
	}


	@Override
	public List<Vacante> buscarDestacadas() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void eliminar(Integer idVacante) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Vacante> buscarByExample(Example<Vacante> example) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Page<Vacante> buscarTodas(org.springframework.data.domain.Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
