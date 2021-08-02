package com.curso.spring.empleos.models;

import java.util.Date;

public class Vacante {

	private Integer ID;
	private String  nombre;
	private String  descripcion;
	private Date    fecha;
	private Double  salario;
	
	// SETTER'S
	
	public void setId(Integer ID) {
		this.ID = ID;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	// GUETER'S
	
	public Integer getId() {
		return ID;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Vacante [ID=" + ID + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + "]";
	}
	

}
