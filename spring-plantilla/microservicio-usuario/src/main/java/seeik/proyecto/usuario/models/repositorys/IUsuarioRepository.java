package seeik.proyecto.usuario.models.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import seeik.proyecto.usuario.models.UsuarioModel;

public interface IUsuarioRepository extends JpaRepository<UsuarioModel, Long>{

	// Consultas propias SQL
	
}
