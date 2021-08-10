package com.curso.spring.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "perfiles")
public class Perfil {
	
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	private String  perfil;
	
	
	// CONSTRUCTOR
	
	public Perfil() {}
	
	
	// SETTER'S
	
	public void setID(Integer iD) {
		ID = iD;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	// GUETTER'S
	
	public Integer getID() {
		return ID;
	}

	public String getPerfil() {
		return perfil;
	}

	
	
	// MÉTODO ToString

	@Override
	public String toString() {
		return "Perfil [ID=" + ID + ", perfil=" + perfil + "]";
	}

	
	

	
	
	
	

}
