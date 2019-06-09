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
public class Afiliacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_aficliacion")
	private Integer idAfiliacion;

	private String nombreAfiliacion;
	private Integer descuento;

	public Integer getIdAfiliacion() {
		return idAfiliacion;
	}

	public void setIdAfiliacion(Integer idAfiliacion) {
		this.idAfiliacion = idAfiliacion;
	}

	public String getNombreAfiliacion() {
		return nombreAfiliacion;
	}

	public void setNombreAfiliacion(String nombreAfiliacion) {
		this.nombreAfiliacion = nombreAfiliacion;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public List<Afiliacion> listarAfiliaciones() {

		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<Afiliacion> result = em.createQuery("SELECT c FROM Afiliacion c", Afiliacion.class);

		List<Afiliacion> resultList = result.getResultList();

		return resultList;

	}
}
