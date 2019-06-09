package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.softII.dominio.Pedido;
import com.softII.vista.Compras;
import com.softII.vista.Modulos;

public class ControladorModulos implements ActionListener {
	private Modulos modulos;

	public ControladorModulos(Modulos modulos) {
		super();
		this.modulos = modulos;
	}

	public void iniciarVista() {
		modulos.setTitle("Video Tienda");
		modulos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		modulos.setLocationRelativeTo(null);
		modulos.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub


		if ("ARTICULOS".equals(e.getActionCommand())) {
			System.out.println("ARTICULOS");

		} else if ("COMPRAS".equals(e.getActionCommand())) {
			System.out.println("COMPRAS");
			
			Compras compras = new Compras();
			
			Pedido pedido = new Pedido();
			ControladorCompras controlador = new ControladorCompras(compras, pedido);
			
			controlador.iniciarVista();
			

		} else if ("CLIENTES".equals(e.getActionCommand())) {
			System.out.println("CLIENTES");

		} else if ("SALIR".equals(e.getActionCommand())) {
			System.out.println("SALIR");
			//modulos.setVisible(false);
			modulos.dispose();
		}

	}

}
