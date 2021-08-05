package com.curso.spring.empleos.models;

public class Categoria {
	
	// ATRIBUTOS
	
	private Integer ID;
	private String  nombre;
	private String  descripcion;
	
	
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
