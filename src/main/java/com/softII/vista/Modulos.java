package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorCliente;
import com.softII.controlador.ControladorModulos;

import javax.swing.JButton;

public class Modulos extends JFrame {

	private JPanel contentPane;
	JButton btnCompraAlquiler;
	JButton btnGestionArticulos;
	JButton btnSalir;
	JButton btnGestinClientes;

	/**
	 * Create the frame.
	 */
	public Modulos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnGestinClientes = new JButton("Gestión de Clientes");
		btnGestinClientes.setActionCommand("CLIENTES");

		btnGestinClientes.setBounds(150, 31, 160, 30);
		contentPane.add(btnGestinClientes);

		btnGestionArticulos = new JButton("Gestión de Artículos");
		btnGestionArticulos.setActionCommand("ARTICULOS");

		btnGestionArticulos.setBounds(150, 86, 160, 30);
		contentPane.add(btnGestionArticulos);

		btnCompraAlquiler = new JButton("Compra y Alquiler");
		btnCompraAlquiler.setActionCommand("COMPRAS");

		btnCompraAlquiler.setBounds(150, 143, 160, 30);
		contentPane.add(btnCompraAlquiler);

		btnSalir = new JButton("Salir");
		btnSalir.setActionCommand("SALIR");

		btnSalir.setBounds(186, 205, 89, 23);
		contentPane.add(btnSalir);
	}

	public void setControlador(ControladorModulos controlador) {
		btnSalir.addActionListener(controlador);
		btnCompraAlquiler.addActionListener(controlador);
		btnGestionArticulos.addActionListener(controlador);
		btnGestinClientes.addActionListener(controlador);
	}
}
