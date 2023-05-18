package com.alumnos;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
@EntityListeners(AuditingEntityListener.class)
public class Alumnos {
	
	@GetMapping("/cosa")
	public String cosa() {
		return "Probando... 123";
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "nombres")
	private String nombres;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "username")
	private String username;

	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private Long telefono;
	
public Alumnos() {
	
}

public Alumnos(Long id, String nombres, String apellidos, String username, String direccion, Long telefono) {
	this.id = id;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.username = username;
	this.direccion = direccion;
	this.telefono = telefono;
}

// SIN GETTER NI SETTER POR AHORA

@Override
public String toString() {
	return "Pais [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", username=" + username + ",direccion=" + direccion +", telefono=" + telefono +",]";
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public Long getTelefono() {
	return telefono;
}

public void setTelefono(Long telefono) {
	this.telefono = telefono;
	}
}

