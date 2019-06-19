package com.softII.controlador;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.softII.dominio.Articulo;
import com.softII.dominio.Cliente;
import com.softII.dominio.Pago;
import com.softII.dominio.Pedido;
import com.softII.dominio.Transaccion;
import com.softII.dominio.Usuario;
import com.softII.vista.ArticulosCompra;
import com.softII.vista.Compras;
import com.softII.vista.Modulos;
import com.softII.vista.VinculacionCliente;

public class ControladorCompras implements ActionListener {

	private Compras vistaCompras;
	private Pedido modeloPedido;

	public ControladorCompras(Compras compras) {
		super();
		this.vistaCompras = compras;
		this.modeloPedido = new Pedido();
	}

	public Compras getVistaCompras() {
		return vistaCompras;
	}

	public void setVistaCompras(Compras vistaCompras) {
		this.vistaCompras = vistaCompras;
	}

	public Pedido getModeloPedido() {
		return modeloPedido;
	}

	public void setModeloPedido(Pedido modeloPedido) {
		this.modeloPedido = modeloPedido;
	}

	public void iniciarVista() {
		vistaCompras.setTitle("Compras y Alquiler");
		vistaCompras.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaCompras.setLocationRelativeTo(null);
		vistaCompras.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if ("VINCULAR".equals(e.getActionCommand())) {

			VinculacionCliente vistaVinculacion = new VinculacionCliente();

			ControladorVinculacion controlador = new ControladorVinculacion(vistaVinculacion);

			vistaVinculacion.setControlador(controlador);

			controlador.iniciarVista();

			Cliente modeloCliente = controlador.getModeloCliente();

			if (modeloCliente != null) {
				modeloPedido.setCliente(modeloCliente);

				vistaCompras.getTxtDocumentoId().setText(modeloCliente.getDocumentoId());
				vistaCompras.getTxtNombres().setText(modeloCliente.getNombres());
				vistaCompras.getTxtApellidos().setText(modeloCliente.getApellidos());

				vistaCompras.getBtnAgregarArticulo().setEnabled(true);
			}

		} else if ("AGREGAR_ARTICULO".equals(e.getActionCommand())) {

			ArticulosCompra vistaArticuloCompras = new ArticulosCompra();

			ControladorArticuloCompra controlador = new ControladorArticuloCompra(vistaArticuloCompras);

			vistaArticuloCompras.setControlador(controlador);

			controlador.iniciarVista();
			
			Articulo modeloArticulo = controlador.getModeloArticulo();
			if (modeloArticulo != null) {
				

				Transaccion transaccion = new Transaccion();
				transaccion.setArticulo(modeloArticulo);
				transaccion.setFechaTransaccion(new Date());
				transaccion.setTipoTransaccion(modeloArticulo.getTipoTransaccion());
				transaccion.setValor(modeloArticulo.getPrecio());

				modeloPedido.getTransacciones().add(transaccion);

				vistaCompras.getTxtPagoTotal().setText(modeloPedido.calcularTotal().toString());

				vistaCompras.agregarFila(modeloArticulo);

				vistaCompras.getBtnPagar().setEnabled(true);

			}

		} else if ("PAGAR".equals(e.getActionCommand())) {
			// vistaCompras.mostrarMensaje(modeloPedido.calcularTotal().toString());

			String mensaje = "Desea proceder con el pago de :" + modeloPedido.calcularTotal().doubleValue() + "Pesos";

			int resultado = vistaCompras.mostrarMensajeConfirmacion(mensaje, "Confirmar Pago");

			if (resultado == 0) {
				Pago pago = new Pago();

				pago.setTipoPago("EFECTIVO");
				pago.setValor(modeloPedido.calcularTotal());

				modeloPedido.setPago(pago);
				modeloPedido.setFechaPedido(new Date());
				boolean transaccionOK = modeloPedido.insertarPedido();
				if (transaccionOK) {
					vistaCompras.mostrarMensaje("El pago fue registrado correctamente");

				} else {
					vistaCompras.mostrarMensaje("Se ´rodujo un error al registrar el pago");

				}

				vistaCompras.dispose();

			}

		} else if ("CANCELAR".equals(e.getActionCommand())) {
			vistaCompras.dispose();

		}

	}
}
