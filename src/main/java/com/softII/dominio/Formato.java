package com.softII.dominio;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Formato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_formato")
	private Long idFormato;
	@Column(name="nombre_formato")
	private String nombreFormato;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "formato_categoria", foreignKey = @ForeignKey(name = "FK_FORMATO_CATEGORIA"), joinColumns = {
			@JoinColumn(name = "id_formato", foreignKey = @ForeignKey(name = "FK_FORMATO_CATEGORIA")) }, inverseJoinColumns = {
					@JoinColumn(name = "id_categoria", foreignKey = @ForeignKey(name = "FK_CATEGORIA_FORMATO")) })
	private Set<Categoria> categorias;
	
	
	
	public Set<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Long getIdFormato() {
		return idFormato;
	}
	public void setIdFormato(Long idFormato) {
		this.idFormato = idFormato;
	}
	public String getNombreFormato() {
		return nombreFormato;
	}
	public void setNombreFormato(String nombreFormato) {
		this.nombreFormato = nombreFormato;
	}
	
	
	
}
