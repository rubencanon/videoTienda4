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
@Table(name="Tipo_Transaccion")
public class TipoTransaccion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_tipo_transaccion")
	private Integer idTipoTransaccion;
	private String descripcion;

	public Integer getIdTipoTransaccion() {
		return idTipoTransaccion;
	}

	public void setIdTipoTransaccion(Integer idTipoTransaccion) {
		this.idTipoTransaccion = idTipoTransaccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TipoTransaccion> obtenerTiposTransaccion() {

		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<TipoTransaccion> result = em.createQuery("SELECT c FROM TipoTransaccion c", TipoTransaccion.class);

		List<TipoTransaccion> resultList = result.getResultList();

		return resultList;

	}

}
