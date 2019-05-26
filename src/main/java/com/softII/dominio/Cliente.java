package com.softII.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

@Entity
public class Cliente extends Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@ManyToOne
	@JoinColumn(name="id_afiliacion", foreignKey = @ForeignKey(name = "FK_CLIENTE_AFILIACION"))
	private Afiliacion afiliacion;

	@OneToOne
	@JoinColumn(name = "documentoId", foreignKey = @ForeignKey(name = "FK_CLIENTE_PERSONA"))
	private Persona persona;

	
	
	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
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
	
	
	public Cliente buscarClientePorId(String documentoId) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager em = emf.createEntityManager();
		try {
/*
			TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.documentoId = :documentoId",
					Cliente.class);
			query.setParameter("documentoId", documentoId);

			List<Cliente> results = query.getResultList();

			if (!results.isEmpty()) {
				return results.get(0);
			}
*/
		} catch (Exception e) {
			System.out.print("Error" + e);

		} finally {
			em.close();
		}

		return null;

	}

}
