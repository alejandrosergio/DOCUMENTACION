package com.microservicio.commons.alumnos.models.entity;

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
@Table(name = "alumnos")
public class Alumno {
	
	
	// ATRIBUTOS
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", unique = true, nullable = false)
		private Long ID;
		
		private String nombre;
		private String apellido;
		private String email;
		
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
		
		public String getApellido() {
			return apellido;
		}
		
		public String getEmail() {
			return email;
		}
		
		public Date getCreateAt() {
			return createAt;
		}
		
		
		// SETTER'S

		public void setID(Long ID) {
			this.ID = ID;
		}
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}
		
		
	// MÉTODO toString

		@Override
		public String toString() {
			return "Alumno [ID=" + ID + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
					+ ", createAt=" + createAt + "]";
		}


	// MÉTODO CLASS OBJECT
		
		
		/*
		 * método que nos permite comparar si el objeto(alumno) se encuentra en la lista
		 * 
		 * 
		 */
		@Override
		public boolean equals(Object obj) {
			
			if ( this == obj ) {
				
				return true;  // -> return true -> son iguales -> lo encuentra lo elimina
			}
			
			if(!(obj instanceof Alumno)) { // -> si no es una instancia de alumno
				
				return false;  // -> return false -> son distintos
			}
			
			Alumno alumno = (Alumno) obj; // -> comparamos id mediante un cast
			
			
			return this.ID != null && this.ID.equals(alumno.getID()); // -> return true o false -> true elimina
		}
		
		
		
}
