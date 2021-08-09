package com.curso.spring.jpa.models;

import java.util.Date;

public class Vacante {

	
	// ATRIBUTOS
	
	private Integer   ID;
	private String    nombre;
	private String    descripcion;
	private Date      fecha;
	private Double    salario;
	private Integer   destacado;
	private String    imagen = "no-image.png";
	private String 	  estatus;
	private String    detalles;
	private Categoria categoria;
	
	
	// SETTER'S
	
	public void setID(Integer iD) {
		ID = iD;
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
	
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	
	// GUETER'S
	
	public Integer getID() {
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

	public String getEstatus() {
		return estatus;
	}
	
	public String getDetalles() {
		return detalles;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	
	
	// MÉTODO toString
	
	@Override
	public String toString() {
		return "Vacante [ID=" + ID + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + ", destacado=" + destacado + ", imagen=" + imagen + ", estatus=" + estatus
				+ ", detalles=" + detalles + ", categoria=" + categoria + "]";
	}
	

}
