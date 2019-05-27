package com.softII.dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

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
	
	public List<Formato> listarFormatos() {

		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<Formato> result = em.createQuery("SELECT c FROM Formato c", Formato.class);

		List<Formato> resultList = result.getResultList();

		return resultList;

	}
	
	
}
