package com.microservicio.examenes.models.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "examenes")
public class Examen {
	
	// ATRIBUTOS
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
		private Long ID;
		
		private String nombre;
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name = "create-at")
		private Date createAt;
		
		@JsonIgnoreProperties(value = {"examen"}, allowSetters = true)
		@OneToMany(mappedBy = "examen", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
		private List<Pregunta> preguntas;
		
		
	
	// CONSTRUCTOR
		
		public Examen() {
			this.preguntas = new ArrayList<>(); // -> inicializamos alumno para no quedar null
		}
		
		
	// MÉTODOS PROPIOS
	
		/*
		 * Permite almacenar la fecha en tiempo real del sistema
		 *  
		 */
		@PrePersist
		public void prePersist() {
			this.createAt = new Date();
		}
		
		/*
		 * Permite agregar preguntas a la lista 1 a 1 en el controlador -> método asignarAlumnos
		 *  
		 */
		public void addPregunta(Pregunta pregunta) {
			this.preguntas.add(pregunta);
			pregunta.setExamen(this);
		}
		
		
		/*
		 * Permite remover alumnos a la lista 1 a 1
		 * 
		 * TODO: implemento en la entity alumno -> método equals -> eliminar
		 *  
		 */
		public void removePregunta(Pregunta pregunta) {
			this.preguntas.remove(pregunta);
			pregunta.setExamen(null);
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
		
		public List<Pregunta> getPreguntas() {
			return preguntas;
		}

		//SETTER'S
		
		public void setID(Long ID) {
			this.ID = ID;
		}	

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}

		public void setPreguntas(List<Pregunta> preguntas) {
			this.preguntas.clear();
			preguntas.forEach( this :: addPregunta);
		}


	// MÉTODO ToString
		
		@Override
		public String toString() {
			return "Examen [ID=" + ID + ", nombre=" + nombre + ", createAt=" + createAt + ", preguntas=" + preguntas
					+ "]";
		}
	
		
	
	// MÉTODO CLASS OBJECT
		
		
		/*
		 * método que nos permite comparar si el objeto(pregunta) se encuentra en la lista del examen
		 * 
		 * 
		 */
		@Override
		public boolean equals(Object obj) {
			
			if ( this == obj ) {
				
				return true;  // -> return true -> son iguales -> lo encuentra lo elimina
			}
			
			if(!(obj instanceof Pregunta)) { // -> si no es una instancia de alumno
				
				return false;  // -> return false -> son distintos
			}
			
			Pregunta pregunta = (Pregunta) obj; // -> comparamos id mediante un cast
			
			
			return this.ID != null && this.ID.equals(pregunta.getID()); // -> return true o false -> true elimina
		}
		
		
}