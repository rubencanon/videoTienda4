package com.softII.dominio;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

@Entity
@Table(name="estado_validez")
public class EstadoValidez {
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

public List<EstadoValidez> listarEstados() {

	EntityManager em = JPAUtil.getEntityManager();

	TypedQuery<EstadoValidez> result = em.createQuery("SELECT c FROM EstadoValidez c", EstadoValidez.class);

	List<EstadoValidez> resultList = result.getResultList();

	return resultList;

}
	
}
