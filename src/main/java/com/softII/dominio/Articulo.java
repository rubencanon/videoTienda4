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
import javax.persistence.ManyToOne;

@Entity
public class Articulo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String referencia;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "articulo_categoria", foreignKey = @ForeignKey(name = "FK_ARTICULO_CATEGORIA"), joinColumns = {
			@JoinColumn(name = "referencia", foreignKey = @ForeignKey(name = "FK_ARTICULO_CATEGORIA")) }, inverseJoinColumns = {
					@JoinColumn(name = "id_categoria", foreignKey = @ForeignKey(name = "FK_CATEGORIA_ARTICULO")) })
	private Set<Categoria> categorias;

	private String titulo;
	private String autor;

	@ManyToOne
	@JoinColumn(name = "id_tipo_transaccion", foreignKey = @ForeignKey(name = "FK_TIPO_TRAN"))
	private TipoTransaccion tipoTransaccion;

	private Long precio;

	@ManyToOne
	@JoinColumn(name = "id_formato", foreignKey = @ForeignKey(name = "FK_FORMATO"))
	private Formato formato;

	@ManyToOne
	@JoinColumn(name = "id_estado", foreignKey = @ForeignKey(name = "FK_ARTICULO_ESTADO"))
	private EstadoArticulo estado;

	
	
	public TipoTransaccion getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	public Long getPrecio() {
		return precio;
	}

	public EstadoArticulo getEstado() {
		return estado;
	}

	public void setEstado(EstadoArticulo estado) {
		this.estado = estado;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}


	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}