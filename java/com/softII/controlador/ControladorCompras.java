package com.softII.controlador;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	public ControladorCompras(Compras compras, Pedido pedido) {
		super();
		this.vistaCompras = compras;
		this.modeloPedido = pedido;
	}

	public void iniciarVista() {
		vistaCompras.setTitle("Compras y Alquiler");
		vistaCompras.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		vistaCompras.setLocationRelativeTo(null);
		vistaCompras.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if ("VINCULAR".equals(e.getActionCommand())) {

			System.out.println("Vincular");

			VinculacionCliente vistaVinculacion = new VinculacionCliente(); // ejemplifico vista vinculacion y le paso
																			// por parametro el padre
			Cliente modeloCliente = new Cliente();

			ControladorVinculacion controlador = new ControladorVinculacion(vistaVinculacion, modeloCliente);

			vistaVinculacion.setControlador(controlador);

			controlador.iniciarVista();
			Cliente cliente = controlador.getCliente();

			modeloPedido.setCliente(cliente);

			vistaCompras.getTxtDocumentoId().setText(cliente.getDocumentoId());
			vistaCompras.getTxtNombres().setText(cliente.getNombres());
			vistaCompras.getTxtApellidos().setText(cliente.getApellidos());

		} else if ("AGREGAR_ARTICULO".equals(e.getActionCommand())) {

			System.out.println("BUSCAR_ARTICULO");

			Articulo modeloArticulo = new Articulo();

			ArticulosCompra vistaArticuloCompras = new ArticulosCompra();

			ControladorArticuloCompra controlador = new ControladorArticuloCompra(modeloArticulo, vistaArticuloCompras);

			vistaArticuloCompras.setControlador(controlador);

			controlador.iniciarVista();

			Articulo articulo = controlador.getModeloArticulo();

			Transaccion transaccion = new Transaccion();
			transaccion.setArticulo(articulo);
			transaccion.setFechaTransaccion(new Date());
			transaccion.setTipoTransaccion(articulo.getTipoTransaccion());
			transaccion.setValor(articulo.getPrecio());

			modeloPedido.getTransacciones().add(transaccion);

			vistaCompras.getTxtPagoTotal().setText(modeloPedido.calcularTotal().toString().toString());

			vistaCompras.agregarFila(articulo);
		} else if ("PAGAR".equals(e.getActionCommand())) {
			vistaCompras.mostrarMensaje(modeloPedido.calcularTotal().toString());

			Pago pago = new Pago();
			pago.setTipoPago("EFECTIVO");
			pago.setValor(modeloPedido.calcularTotal().doubleValue());

			modeloPedido.setPago(pago);
			modeloPedido.setFechaPedido(new Date());

			modeloPedido.insertarPedido();

		}

	}
}
