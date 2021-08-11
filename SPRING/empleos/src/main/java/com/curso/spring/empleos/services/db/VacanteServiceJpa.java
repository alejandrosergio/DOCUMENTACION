package com.curso.spring.empleos.services.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.curso.spring.empleos.models.Vacante;
import com.curso.spring.empleos.repository.VacantesRepository;
import com.curso.spring.empleos.services.IVacantesService;


@Service
@Primary
public class VacanteServiceJpa implements IVacantesService {

	// INYECCION DE CATEGORIA-REPOSITORY
	@Autowired
	private VacantesRepository vacantesRepository; // Inyectamos para tener acceso a sus métodos CRUD y más
	
	
	// GUARDAR UNA VACANTE
	@Override
	public void guardar(Vacante vacante) {
		
		vacantesRepository.save( vacante );

	}
	
	// LISTAR TODAS LAS VACANTES
	@Override
	public List<Vacante> obtenerVacantes() {
	
		return vacantesRepository.findAll();
	}

	
	// OBTENER UNA VACANTE POR ID
	@Override
	public Vacante buscarPorId(Integer idVacante) {
		
		Optional<Vacante> optional = vacantesRepository.findById( idVacante );
		
		if ( optional.isPresent() ) {
			
			return optional.get();
		}
		
		return null;
	}
	
	
	// OBTENER UNA LISTA DE LAS VACANTES DESTACADAS
	@Override
	public List<Vacante> buscarDestacadas() {
		
		return vacantesRepository.findByDestacadoAndEstatusOrderByIDDesc(1, "Aprobada");
	}

	
	
	// ELIMINAR UNA VACANTE POR SU ID
	@Override
	public void eliminar(Integer idVacante) {
		
		vacantesRepository.deleteById( idVacante );
		
	}


}
