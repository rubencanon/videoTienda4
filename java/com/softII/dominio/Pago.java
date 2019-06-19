package com.softII.dominio;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

import com.softII.Util.JPAUtil;

@Entity
public class Pago implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "referencia_pago")
	private BigInteger referenciaPago;

	@Column(name = "tipo_pago")
	private String tipoPago;
	private Double valor;

	public BigInteger getReferenciaPago() {
		return referenciaPago;
	}

	public void setReferenciaPago(BigInteger referenciaPago) {
		this.referenciaPago = referenciaPago;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}



	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean registrarPago() {



		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Pago pago = new Pago();
		pago.setTipoPago(this.tipoPago);
		pago.setValor(this.valor);

		try {
			tx.begin();
			em.persist(pago);

			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			em.close();

		}

		return false;

	}





}
