package com.microservicio.cursos.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cursos")
public class Curso {

	// ATRIBUTOS
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
		private Long ID;
	
		private String nombre;
		
		@Column(name = "create_at")
		@Temporal(TemporalType.TIMESTAMP)
		private Date createAt;
		
		
	// MÉTODOS PROPIOS
		
		
		/*
		 * Permite almacenar la fecha en tiempo real del sistema
		 *  
		 */
		@PrePersist
		public void prePersist() {
			this.createAt = new Date();
		}
		
		
		
	// MÉTODOS ACCESORES
		
		
		// GUETTER'S

		public Long getID() {
			return ID;
		}

		public String getNombre() {
			return nombre;
		}
		
		public Date getCreateAt() {
			return createAt;
		}
		
		
		// SETTER'S
		
		public void setID(Long iD) {
			ID = iD;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}

		
	
	// MÉTODO toString
		
		@Override
		public String toString() {
			return "Curso [ID=" + ID + ", nombre=" + nombre + ", createAt=" + createAt + "]";
		}
	
}
