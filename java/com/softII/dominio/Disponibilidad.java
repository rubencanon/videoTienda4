package com.softII.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

@Entity
public class Disponibilidad implements Serializable{
	@Id
	@Column(name = "id_disponibilidad")
	private Integer idDisponibilidad;
	private String descripcion;
	
	public Integer getIdDisponibilidad() {
		return idDisponibilidad;
	}
	public void setIdDisponibilidad(Integer idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Disponibilidad obtenerDisponible() {

		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<Disponibilidad> result = em.createQuery("SELECT c FROM Disponibilidad c where c.idDisponibilidad = 1", Disponibilidad.class);

		Disponibilidad resultList = result.getResultList().get(0);

		return resultList;

	}
	
	public Disponibilidad obtenerNoDisponible() {

		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<Disponibilidad> result = em.createQuery("SELECT c FROM Disponibilidad c where c.idDisponibilidad = 2", Disponibilidad.class);

		Disponibilidad resultList = result.getResultList().get(0);

		return resultList;

	}
}
