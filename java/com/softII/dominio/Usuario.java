package com.softII.dominio;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;

@Entity
public class Usuario extends Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String clave;

	@OneToOne
	@JoinColumn(name = "estado", foreignKey = @ForeignKey(name = "FK_USUARIO_ESTADO"))
	private EstadoValidez estado;

	@ManyToOne
	@JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = "FK_USUARIO_ROL"))
	private Rol rol;

	/*
	 * @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "usuario_rol", foreignKey = @ForeignKey(name =
	 * "FK_USUARIO_ROL"), joinColumns = {
	 * 
	 * @JoinColumn(name = "documento_id", foreignKey = @ForeignKey(name =
	 * "FK_USUARIO_ROL")) }, inverseJoinColumns = {
	 * 
	 * @JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name =
	 * "FK_ROL_USUARIO")) })
	 * 
	 * private Set<Rol> roles;
	 */

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public EstadoValidez getEstado() {
		return estado;
	}

	public void setEstado(EstadoValidez estado) {
		this.estado = estado;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Usuario buscarUsuario() {

		EntityManager em = JPAUtil.getEntityManager();

		String query = "SELECT e FROM Usuario e where e.documentoId = :documentoId";
		Usuario usuario = null;
		try {
			// TODO: handle finally clause

			TypedQuery<Usuario> result = em.createQuery(query, Usuario.class);
			result.setParameter("documentoId", this.getDocumentoId());

			List<Usuario> resultList = result.getResultList();

			if (!resultList.isEmpty()) {
				usuario = resultList.get(0);
			}

		} catch (Exception e) {
			System.out.println("ERROR AL CONSULTAR BASE DE DATOS");
		}

		return usuario;

	}

	public boolean autenticarUsuario(String idUsuario, String clave) {

		boolean valido = false;
		if (idUsuario.equals(this.getDocumentoId()) && clave.equals(this.clave)) {
			valido = true;
		}

		return valido;

	}

}
