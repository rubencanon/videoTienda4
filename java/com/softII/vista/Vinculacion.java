package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorCompras;
import com.softII.controlador.ControladorVinculacion;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vinculacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtDocumentoid;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtEstado;
	private JButton btnCancelar;
	private JButton btnVincular;
	private JButton btnBuscar;
	
	
	

	public JTextField getTxtDocumentoid() {
		return txtDocumentoid;
	}

	public void setTxtDocumentoid(JTextField txtDocumentoid) {
		this.txtDocumentoid = txtDocumentoid;
	}

	public JTextField getTxtNombres() {
		return txtNombres;
	}

	public void setTxtNombres(JTextField txtNombres) {
		this.txtNombres = txtNombres;
	}

	public JTextField getTxtApellidos() {
		return txtApellidos;
	}

	public void setTxtApellidos(JTextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}

	public JTextField getTxtEstado() {
		return txtEstado;
	}

	public void setTxtEstado(JTextField txtEstado) {
		this.txtEstado = txtEstado;
	}

	public Vinculacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNmeroDeCeddula = new JLabel("No. Céddula");
		lblNmeroDeCeddula.setBounds(10, 24, 92, 14);
		contentPane.add(lblNmeroDeCeddula);

		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 67, 46, 14);
		contentPane.add(lblNombres);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 108, 46, 14);
		contentPane.add(lblApellidos);

		txtDocumentoid = new JTextField();
		txtDocumentoid.setBounds(99, 21, 120, 20);
		contentPane.add(txtDocumentoid);
		txtDocumentoid.setColumns(10);

		txtNombres = new JTextField();
		txtNombres.setEditable(false);
		txtNombres.setBounds(99, 64, 120, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);

		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setBounds(99, 105, 120, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);

		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setBounds(99, 147, 120, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 150, 46, 14);
		contentPane.add(lblEstado);

		btnBuscar = new JButton("Buscar");

		btnBuscar.setActionCommand("BUSCAR");

		btnBuscar.setBounds(259, 20, 89, 23);
		contentPane.add(btnBuscar);

		btnVincular = new JButton("Vincular");
		btnVincular.setActionCommand("VINCULAR");

		btnVincular.setBounds(96, 203, 89, 23);
		contentPane.add(btnVincular);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setActionCommand("CANCELAR");

		btnCancelar.setBounds(213, 203, 89, 23);
		contentPane.add(btnCancelar);
	}

	public void setControlador(ControladorVinculacion controlador) {
		btnVincular.addActionListener(controlador);
		btnCancelar.addActionListener(controlador);
		btnBuscar.addActionListener(controlador);

	}

}
