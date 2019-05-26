package com.softII.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	@Column(name = "documento_id")
	private String documentoId;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String email;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(String documentoId) {
		this.documentoId = documentoId;
	}

	public String getNombre1() {
		return nombres;
	}

	public void setNombre1(String nombre1) {
		this.nombres = nombre1;
	}

	public String getApellido1() {
		return apellidos;
	}

	public void setApellido1(String apellido1) {
		this.apellidos = apellido1;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
