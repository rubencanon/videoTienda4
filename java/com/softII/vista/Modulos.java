package com.softII.vista;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorModulos;

import javax.swing.JButton;
import javax.swing.JDialog;

public class Modulos extends JDialog {

	private JPanel contentPane;
	JButton btnVentaAlquiler;
	JButton btnGestionArticulos;
	JButton btnSalir;
	JButton btnGestinClientes;

	public JButton getBtnVentaAlquiler() {
		return btnVentaAlquiler;
	}

	public void setBtnVentaAlquiler(JButton btnVentaAlquiler) {
		this.btnVentaAlquiler = btnVentaAlquiler;
	}

	public JButton getBtnGestionArticulos() {
		return btnGestionArticulos;
	}

	public void setBtnGestionArticulos(JButton btnGestionArticulos) {
		this.btnGestionArticulos = btnGestionArticulos;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnGestinClientes() {
		return btnGestinClientes;
	}

	public void setBtnGestinClientes(JButton btnGestinClientes) {
		this.btnGestinClientes = btnGestinClientes;
	}

	/**
	 * Create the frame.
	 */
	public Modulos() {
		super((java.awt.Frame) null, true);
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnGestinClientes = new JButton("Gestión de Clientes");
		btnGestinClientes.setEnabled(false);
		btnGestinClientes.setActionCommand("CLIENTES");
		btnGestinClientes.disable();

		btnGestinClientes.setBounds(150, 31, 160, 30);
		contentPane.add(btnGestinClientes);

		btnGestionArticulos = new JButton("Gestión de Artículos");
		btnGestionArticulos.setEnabled(false);
		btnGestionArticulos.setActionCommand("ARTICULOS");
		btnGestionArticulos.disable();

		btnGestionArticulos.setBounds(150, 86, 160, 30);
		contentPane.add(btnGestionArticulos);

		btnVentaAlquiler = new JButton("Compra y Alquiler");
		btnVentaAlquiler.setActionCommand("COMPRAS");
		btnVentaAlquiler.disable();

		btnVentaAlquiler.setBounds(150, 143, 160, 30);
		contentPane.add(btnVentaAlquiler);

		btnSalir = new JButton("Salir");
		btnSalir.setActionCommand("SALIR");

		btnSalir.setBounds(186, 205, 89, 23);
		contentPane.add(btnSalir);
	}

	public void setControlador(ControladorModulos controlador) {
		btnSalir.addActionListener(controlador);
		btnVentaAlquiler.addActionListener(controlador);
		btnGestionArticulos.addActionListener(controlador);
		btnGestinClientes.addActionListener(controlador);
	}
}
