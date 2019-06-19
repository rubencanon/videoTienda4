package com.softII.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

@Entity
@Table(name="estado_articulo")
public class EstadoArticulo implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_estado")
	private Integer idEstado;
	private String descripcion;

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<EstadoArticulo> obtenerEstadosArticulo() {

		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<EstadoArticulo> result = em.createQuery("SELECT c FROM EstadoArticulo c", EstadoArticulo.class);

		List<EstadoArticulo> resultList = result.getResultList();

		return resultList;

	}
}
