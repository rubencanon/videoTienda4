package com.softII.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.softII.Util.JPAUtil;

@Entity
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id_pedido")
	private Long idPedido;

	@ManyToOne
	@JoinColumn(name = "id_cliente", foreignKey = @ForeignKey(name = "FK_CLIENTE"))

	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "id_empleado", foreignKey = @ForeignKey(name = "FK_PEDIDO_EMPLEADO"))

	private Usuario empleado;

	@OneToMany
	@JoinColumn(name = "id_pedido", foreignKey = @ForeignKey(name = "FK_PEDIDO_TRANSACCION"))
	private List<Transaccion> transacciones;

	@OneToOne
	@JoinColumn(name = "referencia_pago", foreignKey = @ForeignKey(name = "FK_PEDIDO_PAGO"))

	private Pago pago;

	private Date fechaPedido;

	public Pedido() {
		super();
		// TODO Auto-generated constructor stubt
		this.transacciones = new ArrayList<Transaccion>();

	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public Usuario getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Usuario empleado) {
		this.empleado = empleado;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Long calcularTotal() {

		Long total = new Long(0);
		for (Transaccion transaccion : transacciones) {
			total += transaccion.getValor();
		}
		return total;
	}

	public boolean insertarPedido() {

		boolean transaccionOK = false;
		EntityManager em = JPAUtil.getEntityManager();

		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();
			em.persist(this);

			tx.commit();

			transaccionOK = true;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			em.close();
		}
		return transaccionOK;

	}

}
