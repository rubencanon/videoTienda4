package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorArticuloCompra;
import com.softII.controlador.ControladorGestionArticulos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.border.BevelBorder;

public class GestionArticulos extends JDialog {

	private JPanel contentPane;

	private static final long serialVersionUID = 1L;
	private JTextField txtReferencia;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEstado;
	private JTextField txtFormato;
	private JTextField txtCategoria;
	private JTextField txtPrecio;
	private JTextField txtTipotransaccion;
	private JButton btnBuscar;
	private JButton btnGuardarDatos;
	private JButton btnAgregarArticulo;
	private JButton btnEditarArticulo;

	
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

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	public JButton getBtnGuardarDatos() {
		return btnGuardarDatos;
	}

	public void setBtnGuardarDatos(JButton btnGuardarDatos) {
		this.btnGuardarDatos = btnGuardarDatos;
	}

	public JButton getBtnAgregarArticulo() {
		return btnAgregarArticulo;
	}

	public void setBtnAgregarArticulo(JButton btnAgregarArticulo) {
		this.btnAgregarArticulo = btnAgregarArticulo;
	}

	public JButton getBtnEditarArticulo() {
		return btnEditarArticulo;
	}

	public void setBtnEditarArticulo(JButton btnEditarArticulo) {
		this.btnEditarArticulo = btnEditarArticulo;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionArticulos frame = new GestionArticulos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void mostrarMensaje(String mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, mensaje);

	}
	public GestionArticulos() {
		super((java.awt.Frame) null, true);
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 782, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtReferencia = new JTextField();
		txtReferencia.setBounds(128, 10, 162, 20);
		contentPane.add(txtReferencia);
		txtReferencia.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setActionCommand("BUSCAR");

		btnBuscar.setBounds(322, 9, 102, 23);
		contentPane.add(btnBuscar);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(503, 0, 235, 405);
		contentPane.add(panel);
		panel.setLayout(null);

		btnAgregarArticulo = new JButton("Agregar Artículo");
		btnAgregarArticulo.setActionCommand("AGREGAR_ARTICULO");

		btnAgregarArticulo.setBounds(74, 30, 131, 23);
		panel.add(btnAgregarArticulo);

		btnEditarArticulo = new JButton("Editar Articulo");
		btnEditarArticulo.setActionCommand("EDITAR");
		btnEditarArticulo.setBounds(74, 84, 131, 23);
		panel.add(btnEditarArticulo);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setActionCommand("CANCELAR");

		btnCancelar.setBounds(74, 339, 107, 23);
		panel.add(btnCancelar);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 0, 461, 405);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblReferencia = new JLabel("Referencia");
		lblReferencia.setBounds(10, 11, 111, 14);
		panel_1.add(lblReferencia);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(70, 312, 80, 14);
		panel_1.add(lblEstado);

		txtEstado = new JTextField();
		txtEstado.setEditable(false);
		txtEstado.setBounds(189, 309, 162, 20);
		panel_1.add(txtEstado);
		txtEstado.setColumns(10);

		JLabel lblTipoTransaccion = new JLabel("Tipo Transacción");
		lblTipoTransaccion.setBounds(70, 284, 109, 14);
		panel_1.add(lblTipoTransaccion);

		txtTipotransaccion = new JTextField();
		txtTipotransaccion.setEditable(false);
		txtTipotransaccion.setBounds(189, 281, 162, 20);
		panel_1.add(txtTipotransaccion);
		txtTipotransaccion.setColumns(10);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(189, 250, 162, 20);
		panel_1.add(txtPrecio);
		txtPrecio.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(70, 256, 80, 14);
		panel_1.add(lblPrecio);

		JLabel lblCategoria = new JLabel("Categoría");
		lblCategoria.setBounds(70, 219, 80, 14);
		panel_1.add(lblCategoria);

		txtCategoria = new JTextField();
		txtCategoria.setEditable(false);
		txtCategoria.setBounds(189, 219, 162, 20);
		panel_1.add(txtCategoria);
		txtCategoria.setColumns(10);

		txtFormato = new JTextField();
		txtFormato.setEditable(false);
		txtFormato.setBounds(189, 188, 162, 20);
		panel_1.add(txtFormato);
		txtFormato.setColumns(10);

		JLabel lblFormato = new JLabel("Formato");
		lblFormato.setBounds(70, 191, 80, 14);
		panel_1.add(lblFormato);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(70, 160, 80, 14);
		panel_1.add(lblAutor);

		txtAutor = new JTextField();
		txtAutor.setEditable(false);
		txtAutor.setBounds(189, 157, 162, 20);
		panel_1.add(txtAutor);
		txtAutor.setColumns(10);

		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(70, 129, 80, 14);
		panel_1.add(lblTitulo);

		txtTitulo = new JTextField();
		txtTitulo.setEditable(false);
		txtTitulo.setBounds(189, 126, 162, 20);
		panel_1.add(txtTitulo);
		txtTitulo.setColumns(10);

		btnGuardarDatos = new JButton("Guardar Datos");
		btnGuardarDatos.setActionCommand("GUARDAR_DATOS");
		btnGuardarDatos.setBounds(189, 355, 162, 23);
		panel_1.add(btnGuardarDatos);
	}

	public void setControlador(ControladorGestionArticulos controlador) {

		btnBuscar.addActionListener(controlador);
		btnGuardarDatos.addActionListener(controlador);
		btnAgregarArticulo.addActionListener(controlador);
		btnEditarArticulo.addActionListener(controlador);
	}
}
