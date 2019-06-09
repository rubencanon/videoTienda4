package com.softII.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

import javax.persistence.JoinTable;

@Entity
public class Rol implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_rol")
	private Integer idRol;
	@Column(name = "nombre_rol")
	private String nombreRol;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "rol_privilegio", foreignKey = @ForeignKey(name = "FK_ROL_PRIVILEGIO"), joinColumns = {
			@JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = "FK_ROL_PRIVILEGIO")) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Privilegio", foreignKey = @ForeignKey(name = "FK_PRIVILEGIO_ROL")) })

	private Set<Privilegio> privilegios;

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public Set<Privilegio> getPrivilegios() {
		return privilegios;
	}

	public void setPrivilegios(Set<Privilegio> privilegios) {
		this.privilegios = privilegios;
	}

	public Rol() {
		super();
		privilegios = new HashSet<Privilegio>();
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	
	public List<Rol>  listarRoles() {
		
		EntityManager em = JPAUtil.getEntityManager();
		
			  TypedQuery<Rol> result = em.createQuery("SELECT r FROM Rol r", Rol.class);
		
			 List<Rol> roles = result.getResultList();
		
		return roles;
		
		
		
		
	}
}
