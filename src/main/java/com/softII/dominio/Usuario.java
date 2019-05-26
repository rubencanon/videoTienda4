package com.softII.dominio;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class Usuario {
	@Id
	@Column(name = "id_usuario")
	private String idUsuario;
	private String clave;

	@OneToOne
	@JoinColumn(name = "estado", foreignKey = @ForeignKey(name = "FK_USUARIO_ESTADO"))
	private EstadoUsuario estado;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "usuario_rol", foreignKey = @ForeignKey(name = "FK_USUARIO_ROL"), joinColumns = {
			@JoinColumn(name = "documento_id", foreignKey = @ForeignKey(name = "FK_USUARIO_ROL")) }, inverseJoinColumns = {
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

}
