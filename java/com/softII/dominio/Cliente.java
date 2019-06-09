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
	@JoinColumn(name="id_afiliacion", foreignKey = @ForeignKey(name = "FK_CLIENTE_AFILIACION"))
	private Afiliacion afiliacion;
/*
	@OneToOne
	@JoinColumn(name = "documentoId", foreignKey = @ForeignKey(name = "FK_CLIENTE_PERSONA"))
	private Persona persona;


	
	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}
*/	

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
	
	String query = "SELECT e FROM Persona e where e.documentoId = :documentoId";
	TypedQuery<Persona> result = em.createQuery(query, Persona.class);
	result.setParameter("documentoId", this.getDocumentoId());
	List<Persona> resultList = result.getResultList();

	if (!resultList.isEmpty()) {
		Persona persona = resultList.get(0);
		
		query = "SELECT e FROM Cliente e where e.documentoId = :documentoId";

		TypedQuery<Cliente> result2 = em.createQuery(query, Cliente.class);
		result2.setParameter("documentoId", persona.getDocumentoId());

		List<Cliente> resultList2 = result2.getResultList();
		
		
		if (!resultList2.isEmpty()) {
			cliente = resultList2.get(0);
		}
		
	}
	
	


	return cliente;
}

	
	
	public boolean registrarCliente() {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		
		try {
			tx.begin();
			em.persist(this);

			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			em.close();

		}
		return false;
	}
	

}
