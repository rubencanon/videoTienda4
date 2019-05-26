package com.softII.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstadoUsuario {
@Id
@Column(name="id_estado_usuario")
private Integer idEstadoUsuario;
private String descripcion;


public Integer getIdEstadoUsuario() {
	return idEstadoUsuario;
}
public void setIdEstadoUsuario(Integer idEstadoUsuario) {
	this.idEstadoUsuario = idEstadoUsuario;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


	
}
