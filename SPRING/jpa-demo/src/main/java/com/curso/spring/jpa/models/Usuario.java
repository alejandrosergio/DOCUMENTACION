package com.curso.spring.jpa.models;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Usuarios")
public class Usuario {
	
	// ATRIBUTOS
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  ID;
	
	private String   nombre;
	private String   email;
	private String   username;
	private String   password;
	private Integer  estatus;
	private Date     fechaRegistro;
	
	
	// RELACIÓN MUCHOS A MUCHOS - JPA
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			    name = "UsuarioPerfil",
			    joinColumns = @JoinColumn( name="idUsuario"),
			    inverseJoinColumns = @JoinColumn( name="idPerfil")
			  )
	private List<Perfil> perfiles;
	
	
	// MÉTODOS PROPIOS
	
	public void agregarPerfiles( Perfil tempPerfil) {
		
		if ( perfiles == null) {
			
			perfiles = new LinkedList<Perfil>();
		}
		
		perfiles.add( tempPerfil );
	}
	
	
	// CONSTRUCTOR
	
	public Usuario() {}


	// SETTER'S
	
	public void setID(Integer iD) {
		ID = iD;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	public void setPerfiles(List<Perfil> perfiles) {
		this.perfiles = perfiles;
	}
	
	
	// GUETTER'S
	
	public Integer getID() {
		return ID;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Integer getEstatus() {
		return estatus;
	}
	
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	public List<Perfil> getPerfiles() {
		return perfiles;
	}

	
	
	// MÉTODO toString

	@Override
	public String toString() {
		return "Usuario [ID=" + ID + ", nombre=" + nombre + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", estatus=" + estatus + ", fechaRegistro=" + fechaRegistro + ", perfiles="
				+ perfiles + "]";
	}

	







	


	
	

	
	
}
