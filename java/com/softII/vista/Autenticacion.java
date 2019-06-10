package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorAutenticacion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Autenticacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtClave;
	JButton btnAutenticarse;

	
	public void mostrarMensaje(String Mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, "Credenciales invalidas Intente de nuevo");

	}
	
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtClave() {
		return txtClave;
	}

	public void setTxtClave(JTextField txtClave) {
		this.txtClave = txtClave;
	}

	/**
	 * Launch the application.
	 */

	public Autenticacion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(56, 68, 46, 14);
		contentPane.add(lblUsuario);

		JLabel lblClave = new JLabel("Clave");
		lblClave.setBounds(56, 110, 46, 14);
		contentPane.add(lblClave);

		txtUsuario = new JTextField();
		txtUsuario.setText("RUBEN.CANON");
		txtUsuario.setBounds(153, 65, 124, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtClave = new JTextField();
		txtClave.setText("33288");
		txtClave.setBounds(153, 107, 124, 20);
		contentPane.add(txtClave);
		txtClave.setColumns(10);

		btnAutenticarse = new JButton("Autenticarse");

		btnAutenticarse.setBounds(142, 170, 157, 23);
		contentPane.add(btnAutenticarse);
	}
	
	public void setControlador(ControladorAutenticacion controlador) {
		btnAutenticarse.addActionListener(controlador);

	}
}
