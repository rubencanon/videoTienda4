package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.softII.dominio.Pedido;
import com.softII.dominio.Usuario;
import com.softII.vista.Compras;
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
			System.out.println("ARTICULOS");

		} else if ("COMPRAS".equals(e.getActionCommand())) {
			System.out.println("COMPRAS");

			Compras vistaCompras = new Compras();

			Pedido pedido = new Pedido();
			pedido.setEmpleado(usuario);
			ControladorCompras controlador = new ControladorCompras(vistaCompras, pedido);
			vistaCompras.setControlador(controlador);
			modulos.hide();
			controlador.iniciarVista();

		} else if ("CLIENTES".equals(e.getActionCommand())) {
			System.out.println("CLIENTES");

		} else if ("SALIR".equals(e.getActionCommand())) {
			System.out.println("SALIR");
			// modulos.setVisible(false);
			modulos.dispose();
		}

	}

}
