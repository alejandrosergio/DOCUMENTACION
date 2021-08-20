package com.microservicio.cursos.models.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.microservicio.commons.alumnos.models.entity.Alumno;



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
		
		@OneToMany(fetch = FetchType.LAZY) // -> carga perezosa
		private List<Alumno> alumnos;
		
		
		
	// CONSTRUCTOR
		
		public Curso() {
			this.alumnos = new ArrayList<>(); // -> inicializamos alumno para no quedar null
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
		 * Permite agregar alumnos a la lista 1 a 1 en el controlador -> método asignarAlumnos
		 *  
		 */
		public void addAlumno(Alumno alumno) {
			this.alumnos.add(alumno);
		}
		
		
		/*
		 * Permite remover alumnos a la lista 1 a 1
		 * 
		 * TODO: implemento en la entity alumno -> método equals -> eliminar
		 *  
		 */
		public void removeAlumno(Alumno alumno) {
			this.alumnos.remove(alumno);
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
		
		public List<Alumno> getAlumnos() {
			return alumnos;
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

		public void setAlumnos(List<Alumno> alumnos) {
			this.alumnos = alumnos;
		}


		
	// MÉTODO toString
		
		@Override
		public String toString() {
			return "Curso [ID=" + ID + ", nombre=" + nombre + ", createAt=" + createAt + ", alumnos=" + alumnos + "]";
		}
		
	
		
		
	
}
