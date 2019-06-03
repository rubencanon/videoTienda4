package com.softII.dominio;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

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

@Entity
public class Usuario extends Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "id_usuario")
	private String idUsuario;
	private String clave;

	@OneToOne
	@JoinColumn(name = "estado", foreignKey = @ForeignKey(name = "FK_USUARIO_ESTADO"))
	private EstadoUsuario estado;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "usuario_rol", foreignKey = @ForeignKey(name = "FK_USUARIO_ROL"), joinColumns = {
			@JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "FK_USUARIO_ROL")) }, inverseJoinColumns = {
					@JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = "FK_ROL_USUARIO")) })

	private Set<Rol> roles;

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public EstadoUsuario getEstado() {
		return estado;
	}

	public void setEstado(EstadoUsuario estado) {
		this.estado = estado;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public void gregarRol(Rol rol) {
		roles.add(rol);
	}

	public void removerRol(Rol rol) {
		roles.remove(rol);
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub

		roles = new HashSet<Rol>();
	}

	public Usuario buscarUsuario() {

		EntityManager em = JPAUtil.getEntityManager();

		String query = "SELECT e FROM Usuario e where e.idUsuario = :idUsuario";

		TypedQuery<Usuario> result = em.createQuery(query, Usuario.class);
		result.setParameter("idUsuario", this.getIdUsuario());

		List<Usuario> resultList = result.getResultList();

		Usuario usuario = null;

		if (!resultList.isEmpty()) {
			usuario = resultList.get(0);
		}

		return usuario;

	}

	public boolean autenticarUsuario(String idUsuario, String clave) {


		
		boolean valido = false;
		if ( idUsuario.equals(this.idUsuario)   && clave.equals(this.clave)) {
			valido = true;
		}

		return valido;

	}

}
