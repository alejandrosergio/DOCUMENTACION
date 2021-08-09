package com.curso.spring.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categorias")
public class Categoria {
	
	
	// ATRIBUTOS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	private String  nombre;
	private String  descripcion;
	
	
	// CONSTRUCTOR
	
	public Categoria() {}
	
	
	// SETTER'S
	
	public void setiD(Integer ID) {
		this.ID = ID;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	// GUETTER'S
	
	public Integer getID() {
		return ID;
	}
	

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}


	// MÉTODO toString
	
	@Override
	public String toString() {
		return "Categoria [ID=" + ID + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	
	

}
