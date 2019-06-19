package com.softII.dominio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;


@Entity
public class Privilegio implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="id_Privilegio")
	private Integer idPrivilegio;
	@Column(name="nombre_privilegio")
	private String nombrePrivilegio;



	public Integer getIdPrivilegio() {
		return idPrivilegio;
	}


	public void setIdPrivilegio(Integer idPrivilegio) {
		this.idPrivilegio = idPrivilegio;
	}


	public Privilegio() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNombrePrivilegio() {
		return nombrePrivilegio;
	}

	public void setNombrePrivilegio(String nombrePrivilegio) {
		this.nombrePrivilegio = nombrePrivilegio;
	}
	


}
