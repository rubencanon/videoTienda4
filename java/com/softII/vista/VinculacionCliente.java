package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorVinculacion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VinculacionCliente extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDocumentoid;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtEstado;
	private JTextField txtEmail;
	private JTextField txtDireccion;
	private JButton btnBuscar;
	private JButton btnCancelar;
	private JButton btnVincular;
	private JLabel lblAfiliacion;
	private JTextField txtAfiliacion;
	private JFrame ventanaPadre;

	public static void main(String[] args) {
		try {
			
		
			VinculacionCliente dialog = new VinculacionCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void mostrarMensaje(String mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, mensaje);

	}
	
	public JFrame getVentanaPadre() {
		return ventanaPadre;
	}



	public void setVentanaPadre(JFrame ventanaPadre) {
		this.ventanaPadre = ventanaPadre;
	}



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



	public JTextField getTxtEmail() {
		return txtEmail;
	}



	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}



	public JTextField getTxtDireccion() {
		return txtDireccion;
	}



	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}



	public JButton getBtnBuscar() {
		return btnBuscar;
	}



	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}



	public JButton getBtnCancelar() {
		return btnCancelar;
	}



	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}



	public JButton getBtnVincular() {
		return btnVincular;
	}



	public void setBtnVincular(JButton btnVincular) {
		this.btnVincular = btnVincular;
	}



	public JTextField getTxtAfiliacion() {
		return txtAfiliacion;
	}



	public void setTxtAfiliacion(JTextField txtAfiliacion) {
		this.txtAfiliacion = txtAfiliacion;
	}



	public JPanel getContentPanel() {
		return contentPanel;
	}



	/**
	 * Create the dialog.
	 */
	public VinculacionCliente() {
		
		super((java.awt.Frame) null, true);
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		
		setBounds(100, 100, 561, 381);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNroCedula = new JLabel("Documento de Identidad");
		lblNroCedula.setBounds(22, 10, 166, 17);
		contentPanel.add(lblNroCedula);

		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(94, 83, 94, 14);
		contentPanel.add(lblNombres);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(94, 108, 94, 14);
		contentPanel.add(lblApellidos);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(94, 149, 94, 14);
		contentPanel.add(lblEstado);

		JLabel lbEmail = new JLabel("email");
		lbEmail.setBounds(94, 264, 94, 14);
		contentPanel.add(lbEmail);

		txtDocumentoid = new JTextField();
		txtDocumentoid.setText("11425007");
		txtDocumentoid.setBounds(198, 8, 143, 20);
		contentPanel.add(txtDocumentoid);
		txtDocumentoid.setColumns(10);

		txtNombres = new JTextField();
		txtNombres.setEditable(false);
		txtNombres.setBounds(198, 77, 143, 20);
		contentPanel.add(txtNombres);
		txtNombres.setColumns(10);

		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setBounds(198, 108, 143, 20);
		contentPanel.add(txtApellidos);
		txtApellidos.setColumns(10);

		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setBounds(198, 146, 143, 20);
		contentPanel.add(txtEstado);
		txtEstado.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setBounds(198, 261, 143, 20);
		contentPanel.add(txtEmail);
		txtEmail.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setBounds(198, 225, 143, 20);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);

		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setBounds(94, 228, 94, 14);
		contentPanel.add(lblDireccion);

		btnBuscar = new JButton("Buscar Cliente");

		btnBuscar.setBounds(366, 7, 143, 23);
		btnBuscar.setActionCommand("BUSCAR");

		contentPanel.add(btnBuscar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(252, 308, 89, 23);
		btnCancelar.setActionCommand("CANCELAR");

		contentPanel.add(btnCancelar);

		btnVincular = new JButton("Vincular");
		btnVincular.setEnabled(false);
		btnVincular.setBounds(94, 308, 89, 23);
		btnVincular.setActionCommand("VINCULAR");

		contentPanel.add(btnVincular);
		
		lblAfiliacion = new JLabel("Afiliación");
		lblAfiliacion.setBounds(94, 189, 94, 14);
		contentPanel.add(lblAfiliacion);
		
		txtAfiliacion = new JTextField();
		txtAfiliacion.setEditable(false);
		txtAfiliacion.setBounds(198, 186, 143, 20);
		contentPanel.add(txtAfiliacion);
		txtAfiliacion.setColumns(10);

	}

	public void setControlador(ControladorVinculacion controlador) {
		btnVincular.addActionListener(controlador);
		btnCancelar.addActionListener(controlador);
		btnBuscar.addActionListener(controlador);

	}
}
