package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorArticuloCompra;

public class ArticulosCompra extends JDialog {

	private final JPanel contentPanel = new JPanel();

	private static final long serialVersionUID = 1L;
	private JTextField txtReferencia;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEstado;
	private JTextField txtFormato;
	private JTextField txtCategoria;
	private JTextField txtPrecio;
	private JTextField txtTipotransaccion;
	private JButton btnAgregar;
	private JButton btnBuscar;
	private JButton btnCancelar;

	public void mostrarMensaje(String mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, mensaje);

	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JTextField getTxtReferencia() {
		return txtReferencia;
	}

	public void setTxtReferencia(JTextField txtReferencia) {
		this.txtReferencia = txtReferencia;
	}

	public JTextField getTxtTitulo() {
		return txtTitulo;
	}

	public void setTxtTitulo(JTextField txtTitulo) {
		this.txtTitulo = txtTitulo;
	}

	public JTextField getTxtAutor() {
		return txtAutor;
	}

	public void setTxtAutor(JTextField txtAutor) {
		this.txtAutor = txtAutor;
	}

	public JTextField getTxtEstado() {
		return txtEstado;
	}

	public void setTxtEstado(JTextField txtEstado) {
		this.txtEstado = txtEstado;
	}

	public JTextField getTxtFormato() {
		return txtFormato;
	}

	public void setTxtFormato(JTextField txtFormato) {
		this.txtFormato = txtFormato;
	}

	public JTextField getTxtCategoria() {
		return txtCategoria;
	}

	public void setTxtCategoria(JTextField txtCategoria) {
		this.txtCategoria = txtCategoria;
	}

	public JTextField getTxtPrecio() {
		return txtPrecio;
	}

	public void setTxtPrecio(JTextField txtPrecio) {
		this.txtPrecio = txtPrecio;
	}

	public JTextField getTxtTipotransaccion() {
		return txtTipotransaccion;
	}

	public void setTxtTipotransaccion(JTextField txtTipotransaccion) {
		this.txtTipotransaccion = txtTipotransaccion;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ArticulosCompra dialog = new ArticulosCompra();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ArticulosCompra() {

		super((java.awt.Frame) null, true);
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 432);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		JLabel lblReferencia = new JLabel("Referencia");
		lblReferencia.setBounds(9, 13, 109, 14);
		contentPanel.add(lblReferencia);

		txtReferencia = new JTextField();
		txtReferencia.setText("a123");
		txtReferencia.setBounds(128, 10, 162, 20);
		contentPanel.add(txtReferencia);
		txtReferencia.setColumns(10);

		txtTitulo = new JTextField();
		txtTitulo.setEditable(false);
		txtTitulo.setBounds(128, 35, 162, 20);
		contentPanel.add(txtTitulo);
		txtTitulo.setColumns(10);

		txtAutor = new JTextField();
		txtAutor.setEditable(false);
		txtAutor.setBounds(128, 66, 162, 20);
		contentPanel.add(txtAutor);
		txtAutor.setColumns(10);

		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setBounds(128, 219, 162, 20);
		contentPanel.add(txtEstado);
		txtEstado.setColumns(10);

		txtFormato = new JTextField();
		txtFormato.setEditable(false);
		txtFormato.setBounds(128, 97, 162, 20);
		contentPanel.add(txtFormato);
		txtFormato.setColumns(10);

		txtCategoria = new JTextField();
		txtCategoria.setEditable(false);
		txtCategoria.setBounds(128, 128, 162, 20);
		contentPanel.add(txtCategoria);
		txtCategoria.setColumns(10);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(128, 161, 162, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);

		txtTipotransaccion = new JTextField();
		txtTipotransaccion.setEditable(false);
		txtTipotransaccion.setBounds(128, 192, 162, 20);
		contentPanel.add(txtTipotransaccion);
		txtTipotransaccion.setColumns(10);

		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(9, 38, 109, 14);
		contentPanel.add(lblTitulo);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(9, 69, 109, 14);
		contentPanel.add(lblAutor);

		JLabel lblFormato = new JLabel("Formato");
		lblFormato.setBounds(9, 100, 109, 14);
		contentPanel.add(lblFormato);

		JLabel lblCategoria = new JLabel("Categoría");
		lblCategoria.setBounds(9, 128, 109, 14);
		contentPanel.add(lblCategoria);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(9, 167, 109, 14);
		contentPanel.add(lblPrecio);

		JLabel lblTipoTransaccion = new JLabel("Tipo Transacción");
		lblTipoTransaccion.setBounds(9, 195, 109, 14);
		contentPanel.add(lblTipoTransaccion);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(9, 222, 80, 14);
		contentPanel.add(lblEstado);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setActionCommand("BUSCAR");

		btnBuscar.setBounds(322, 9, 102, 23);
		contentPanel.add(btnBuscar);

		btnAgregar = new JButton("Agregar");
		btnAgregar.setEnabled(false);
		btnAgregar.setActionCommand("AGREGAR");

		btnAgregar.setBounds(97, 281, 102, 23);
		contentPanel.add(btnAgregar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setActionCommand("CANCELAR");

		btnCancelar.setBounds(224, 281, 89, 23);
		contentPanel.add(btnCancelar);
	}

	public void setControlador(ControladorArticuloCompra controlador) {
		btnAgregar.addActionListener(controlador);
		btnBuscar.addActionListener(controlador);
		btnCancelar.addActionListener(controlador);

	}

}
