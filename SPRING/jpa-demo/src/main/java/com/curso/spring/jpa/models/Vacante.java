package com.curso.spring.jpa.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Vacantes")
public class Vacante {

	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer   ID;
	
	
	private String    nombre;
	private String    descripcion;
	private Date      fecha;
	private Double    salario;
	private Integer   destacado;
	private String    imagen = "no-image.png";
	private String 	  estatus;
	private String    detalles;
	
	
	@OneToOne
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;
	
	
	
	// CONSTRUCTOR
	public Vacante() {}
	
	
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
