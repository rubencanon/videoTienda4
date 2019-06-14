package com.softII.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Transaccion implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_transaccion")
	private Long idTransaccion;

	@ManyToOne
	@JoinColumn(name = "tipo_transaccion", foreignKey = @ForeignKey(name="FK_TRAN_TIPO_TRAN"))
	private TipoTransaccion tipoTransaccion;

	@ManyToOne
	@JoinColumn(name = "articulo_id", foreignKey = @ForeignKey(name="FK_TRANSACCION_ARTICULO"))
	
	private Articulo articulo;


	private Long valor;
	
	private Date fechaTransaccion;

	public Long getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(Long idTransaccion) {
		this.idTransaccion = idTransaccion;
	}



	public TipoTransaccion getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}


	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	
	

}
