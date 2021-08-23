package com.microservicio.examenes.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "preguntas")
public class Pregunta {
	
	// ATRIBUTOS
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
		private Long ID;
		
		private String texto;
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "create-at")
		private Date createAt;
		
		@JsonIgnoreProperties(value = {"preguntas"})
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "examen_id")
		private Examen examen;
	
		
	
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
		
		public String getTexto() {
			return texto;
		}
		
		public Date getCreateAt() {
			return createAt;
		}
		
		public Examen getExamen() {
			return examen;
		}
	
		//SETTER'S
		
		public void setID(Long ID) {
			this.ID = ID;
		}	
	
		public void setTexto(String texto) {
			this.texto = texto;
		}
	
		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}
	
		public void setExamen(Examen examen) {
			this.examen = examen;
		}

		
	// MÉTODO ToString

		@Override
		public String toString() {
			return "Pregunta [ID=" + ID + ", texto=" + texto + ", createAt=" + createAt + ", examen=" + examen + "]";
		}
	
		
		
		
}