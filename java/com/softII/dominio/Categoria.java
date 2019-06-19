package com.softII.dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.TypedQuery;

import com.softII.Util.JPAUtil;

@Entity
public class Categoria implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_categoria")
	private Integer idCategoria;
	@Column(name = "nombre_categoria")
	private String nombreCategoria;

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public List<Categoria> listarCategorias() {

		EntityManager em = JPAUtil.getEntityManager();

		TypedQuery<Categoria> result = em.createQuery("SELECT c FROM Categoria c", Categoria.class);

		List<Categoria> resultList = result.getResultList();

		return resultList;

	}
	
	public Categoria buscarCategoria() {
		EntityManager em = JPAUtil.getEntityManager();

		Categoria categoria = null;

		try {
			String query = "SELECT e FROM Categoria e where e.idCategoria = :idCategoria";
			TypedQuery<Categoria> result = em.createQuery(query, Categoria.class);
			result.setParameter("idCategoria", this.getIdCategoria());
			List<Categoria> resultList = result.getResultList();

			if (!resultList.isEmpty()) {
				categoria = resultList.get(0);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			em.close();
		}

		return categoria;
	}
}
