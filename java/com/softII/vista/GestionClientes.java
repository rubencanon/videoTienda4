package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorCliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class GestionClientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtEmail;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JButton btnBuscar;
	private JButton btnAgregarCliente;
	private JComboBox cbEstado;
	JComboBox cbAfiliacion;
	
	public void mostrarMensaje(String mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, mensaje);

	}
	
	public JComboBox getCbAfiliacion() {
		return cbAfiliacion;
	}

	public void setCbAfiliacion(JComboBox cbAfiliacion) {
		this.cbAfiliacion = cbAfiliacion;
	}

	public JComboBox getCbEstado() {
		return cbEstado;
	}

	public void setCbEstado(JComboBox cbEstado) {
		this.cbEstado = cbEstado;
	}

	/**
	 * Launch the application.
	 */

	public String getTxtCedula() {
		return txtCedula.toString();
	}

	public void setTxtCedula(String txtCedula) {
		this.txtCedula.setText(txtCedula);
	}

	public String getTxtNombres() {
		return txtNombres.toString();
	}

	public void setTxtNombres(String txtNombres) {
		this.txtNombres.setText(txtNombres);
	}

	public String getTxtApellidos() {
		return txtApellidos.toString();
	}

	public void setTxtApellidos(String txtApellidos) {
		this.txtApellidos.setText(txtApellidos);
	}

	public String getTxtEmail() {
		return txtEmail.toString();
	}

	public void setTxtEmail(String txtEmail) {
		this.txtEmail.setText(txtEmail);
	}

	public String getTxtDireccion() {
		return txtDireccion.toString();
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

	public String getTxtTelefono() {
		return txtTelefono.toString();
	}

	public void setTxtTelefono(String txtTelefono) {
		this.txtTelefono.setText(txtTelefono);
	}

	/**
	 * Create the frame.
	 */
	public GestionClientes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 659, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNCedula = new JLabel("N Cedula");
		lblNCedula.setBounds(21, 26, 76, 14);
		contentPane.add(lblNCedula);

		txtCedula = new JTextField();
		txtCedula.setBounds(162, 26, 210, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);

		txtNombres = new JTextField();
		txtNombres.setBounds(162, 57, 210, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(162, 88, 210, 20);
		contentPane.add(txtApellidos);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(162, 119, 210, 20);
		contentPane.add(txtEmail);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(162, 150, 210, 20);
		contentPane.add(txtDireccion);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(162, 181, 210, 20);
		contentPane.add(txtTelefono);

		cbEstado = new JComboBox();

		cbEstado.setBounds(162, 216, 210, 20);
		contentPane.add(cbEstado);

		cbAfiliacion = new JComboBox();
		cbAfiliacion.setBounds(162, 247, 210, 20);
		contentPane.add(cbAfiliacion);

		JLabel lblNombres = new JLabel("Nombre(s)");
		lblNombres.setBounds(21, 57, 76, 14);
		contentPane.add(lblNombres);

		JLabel lblApellidos = new JLabel("Apellido(s)");
		lblApellidos.setBounds(21, 88, 76, 14);
		contentPane.add(lblApellidos);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(21, 119, 76, 14);
		contentPane.add(lblEmail);

		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setBounds(21, 150, 76, 14);
		contentPane.add(lblDireccin);

		JLabel lblTelfono = new JLabel("Teléfono");
		lblTelfono.setBounds(21, 181, 76, 14);
		contentPane.add(lblTelfono);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(21, 216, 76, 20);
		contentPane.add(lblEstado);

		JLabel lblAfiliacin = new JLabel("Afiliación");
		lblAfiliacin.setBounds(21, 247, 76, 14);
		contentPane.add(lblAfiliacin);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(404, 25, 89, 23);
		contentPane.add(btnBuscar);

		btnAgregarCliente = new JButton("Agregar Cliente");
		btnAgregarCliente.setBounds(521, 25, 112, 23);
		contentPane.add(btnAgregarCliente);
	}

	public void setControlador(ControladorCliente controlador) {
		btnAgregarCliente.addActionListener(controlador);

	}
}
