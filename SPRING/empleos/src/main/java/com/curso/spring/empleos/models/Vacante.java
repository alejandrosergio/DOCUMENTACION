package com.curso.spring.empleos.models;

import java.util.Date;

public class Vacante {

	private Integer ID;
	private String  nombre;
	private String  descripcion;
	private Date    fecha;
	private Double  salario;
	private Integer destacado;
	private String  imagen= "no-imagen.png";
	
	
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
	
	public void setDestacado(Integer destacado) {
		this.destacado = destacado;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
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

	public Integer getDestacado() {
		return destacado;
	}

	public String getImagen() {
		return imagen;
	}
	
	

	@Override
	public String toString() {
		return "Vacante [ID=" + ID + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + ", destacado=" + destacado + ", imagen=" + imagen + "]";
	}


}
