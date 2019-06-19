package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.softII.dominio.Articulo;
import com.softII.dominio.Cliente;
import com.softII.dominio.Pedido;
import com.softII.dominio.Usuario;
import com.softII.vista.Compras;
import com.softII.vista.GestionArticulos;
import com.softII.vista.GestionClientes;
import com.softII.vista.Modulos;

public class ControladorModulos implements ActionListener {
	private Modulos modulos;

	private Usuario usuario;

	public ControladorModulos(Modulos modulos, Usuario usuario) {
		super();
		this.modulos = modulos;
		this.usuario = usuario;
	}

	public void iniciarVista() {
		modulos.setTitle("Video Tienda");
		modulos.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		modulos.setLocationRelativeTo(null);
		modulos.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if ("ARTICULOS".equals(e.getActionCommand())) {

			////// REVISAR JULIAN

			GestionArticulos vistaGestArticulos = new GestionArticulos();
			ControladorGestionArticulos controlador = new ControladorGestionArticulos(vistaGestArticulos);

			vistaGestArticulos.setControlador(controlador);
			modulos.hide();
			controlador.iniciarVista();
			modulos.show();

		} else if ("COMPRAS".equals(e.getActionCommand())) {

			Compras vistaCompras = new Compras();

			ControladorCompras controlador = new ControladorCompras(vistaCompras);
			Pedido modeloPedido = controlador.getModeloPedido();
			modeloPedido.setEmpleado(usuario);

			vistaCompras.setControlador(controlador);
			modulos.hide();
			controlador.iniciarVista();
			modulos.show();

		} else if ("CLIENTES".equals(e.getActionCommand())) {
			System.out.println("CLIENTES");
			////// REVISAR JULIAN

			GestionClientes vistaGestCliente = new GestionClientes();

			ControladorCliente controlador = new ControladorCliente(vistaGestCliente);

			vistaGestCliente.setControlador(controlador);
			modulos.hide();
			controlador.iniciarVista();
			modulos.show();

		} else if ("SALIR".equals(e.getActionCommand())) {
			System.out.println("SALIR");
			// modulos.setVisible(false);
			modulos.dispose();

		}

	}

}
