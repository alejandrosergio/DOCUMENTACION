package com.curso.spring.music.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Albums")
public class AlbumsModel {

	
	// ATRIBUTOS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer ID;
	
	private String  titulo;
	private Date    lanzado;
	private Double  precio;
	private String  genero;
	
	
	// MÉTODOS ACCESORES
	
		// GUETTER'S
	
		public Integer getID() {
			return ID;
		}
		
		public String getTitulo() {
			return titulo;
		}
		
		public Date getLanzado() {
			return lanzado;
		}
		
		public Double getPrecio() {
			return precio;
		}
		
		public String getGenero() {
			return genero;
		}
		
		
		// SETTER'S
	
		public void setID(Integer ID) {
			this.ID = ID;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
	
		public void setLanzado(Date lanzado) {
			this.lanzado = lanzado;
		}
	
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
	
		public void setGenero(String genero) {
			this.genero = genero;
		}

		
		// MÉTODO ToString
		
		@Override
		public String toString() {
			return "AlbumsModel [ID=" + ID + ", titulo=" + titulo + ", lanzado=" + lanzado + ", precio=" + precio
					+ ", genero=" + genero + "]";
		}
		
		
	
	
	
	
	
}
