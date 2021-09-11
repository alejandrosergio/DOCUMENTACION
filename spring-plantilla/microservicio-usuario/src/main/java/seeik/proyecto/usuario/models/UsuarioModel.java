package seeik.proyecto.usuario.models;

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
@Table(name = "tbl_usuarios")
public class UsuarioModel {

	// ATRIBUTOS
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "usu_id", unique = true, nullable = false)
		private Long ID;
		
		@Column(name = "usu_nombre", nullable = false, length = 50)
		private String nombre;
		
		@Column(name = "usu_apellido", nullable = false, length = 50)
		private String apellido;
		
		@Column(name = "usu_email", nullable = false)
		private String email;
		
		@Column(name = "usu_create_at")
		@Temporal(TemporalType.TIMESTAMP)
		private Date createAt;
		
		
	// MÉTODOS PROPIOS
		
		//Permite almacenar la fecha en tiempo real del sistema
		@PrePersist
		public void prePersist() {
			this.createAt = new Date();
		}


		
		
	// METODOS ACCESORES
		
		
		// SETTERS
		
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


		
		// GUETTERS
		
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
		
		
	
	// METODO ToString
	
		@Override
		public String toString() {
			return "UsuarioModel [ID=" + ID + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
					+ ", createAt=" + createAt + "]";
		}
		

}
