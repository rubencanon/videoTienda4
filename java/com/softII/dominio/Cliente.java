package com.softII.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

@Entity
public class Cliente extends Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "estado", foreignKey = @ForeignKey(name = "FK_CLIENTE_ESTADO"))
	private EstadoValidez estado;

	@ManyToOne
	@JoinColumn(name = "id_afiliacion", foreignKey = @ForeignKey(name = "FK_CLIENTE_AFILIACION"))
	private Afiliacion afiliacion;

	public EstadoValidez getEstado() {
		return estado;
	}

	public void setEstado(EstadoValidez estado) {
		this.estado = estado;
	}

	public Afiliacion getAfiliacion() {
		return afiliacion;
	}

	public void setAfiliacion(Afiliacion afiliacion) {
		this.afiliacion = afiliacion;
	}

	//////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
	public Cliente buscarCliente() {
		EntityManager em = JPAUtil.getEntityManager();

		Cliente cliente = null;

		try {
			String query = "SELECT e FROM Cliente e where e.documentoId = :documentoId";
			TypedQuery<Cliente> result = em.createQuery(query, Cliente.class);
			result.setParameter("documentoId", this.getDocumentoId());
			List<Cliente> resultList = result.getResultList();

			if (!resultList.isEmpty()) {
				cliente = resultList.get(0);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			em.close();
		}

		return cliente;
	}

	public boolean registrarCliente() {
		
		System.out.println(this.getDocumentoId());
		

		EntityManager em = JPAUtil.getEntityManager();

		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(this);

			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			em.close();
		}		
	}
	
	public boolean actualizarCliente() {

		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.merge(this);
			tx.commit();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		} finally {
			em.close();
		}		
	}

}
