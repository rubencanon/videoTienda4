package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.softII.dominio.Cliente;
import com.softII.dominio.Pedido;
import com.softII.vista.Compras;
import com.softII.vista.Modulos;
import com.softII.vista.Vinculacion;

public class ControladorCompras implements ActionListener {

	private Compras compras;
	private Pedido pedido;

	public ControladorCompras(Compras compras, Pedido pedido) {
		super();
		this.compras = compras;
		this.pedido = pedido;
	}

	public void iniciarVista() {
		compras.setTitle("Compras y Alquiler");
		compras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		compras.setLocationRelativeTo(null);
		compras.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if ("VINCULAR".equals(e.getActionCommand())) {

			System.out.println("Vincular");
			Vinculacion vinculacion = new Vinculacion();

			Cliente cliente = new Cliente();
			ControladorVinculacion controlador = new ControladorVinculacion(vinculacion, cliente);

			vinculacion.setControlador(controlador);
			controlador.iniciarVista();

		}

	}

}
