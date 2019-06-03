package com.softII.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

import com.softII.Util.JPAUtil;

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
