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
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Autenticacion extends JDialog {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JButton btnAutenticarse;
	private JButton btnSalir;
	private JPasswordField pwdClave;

	public void mostrarMensaje(String mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, mensaje);

	}
    public int mostrarMensajeConfirmacion(String mensaje, String titulo) {
		return JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
	} 
    
    
    
	public JPasswordField getPwdClave() {
		return pwdClave;
	}
	public void setPwdClave(JPasswordField pwdClave) {
		this.pwdClave = pwdClave;
	}
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}


	/**
	 * Launch the application.
	 */

	public Autenticacion() {
		super((java.awt.Frame) null, true);
		setTitle("Autenticación");
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
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
		txtUsuario.setText("81754742");
		txtUsuario.setBounds(153, 65, 124, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		btnAutenticarse = new JButton("Autenticarse");
		btnAutenticarse.setActionCommand("AUTENTICAR");

		btnAutenticarse.disable();

		btnAutenticarse.setBounds(34, 171, 157, 23);
		contentPane.add(btnAutenticarse);

		btnSalir = new JButton("Salir");
		btnSalir.setActionCommand("SALIR");

		btnSalir.setBounds(233, 171, 130, 23);
		contentPane.add(btnSalir);
		
		pwdClave = new JPasswordField();
		pwdClave.setBounds(153, 107, 124, 20);
		contentPane.add(pwdClave);
	}

	public void setControlador(ControladorAutenticacion controlador) {
		btnAutenticarse.addActionListener(controlador);
		btnSalir.addActionListener(controlador);
		
	}
}
