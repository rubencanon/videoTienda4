package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorArticuloCompra;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.border.BevelBorder;

public class GestionArticulos extends JFrame {

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
	private JButton btnAgregarCliente;
	private JButton btnEditarCliente;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		btnAgregarCliente = new JButton("Agregar Cliente");
		btnAgregarCliente.setBounds(74, 30, 107, 23);
		panel.add(btnAgregarCliente);

		btnEditarCliente = new JButton("Editar Cliente");
		btnEditarCliente.setActionCommand("EDITAR");
		btnEditarCliente.setBounds(74, 84, 107, 23);
		panel.add(btnEditarCliente);

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
		txtEstado.setBounds(189, 309, 162, 20);
		panel_1.add(txtEstado);
		txtEstado.setEditable(false);
		txtEstado.setColumns(10);

		JLabel lblTipoTransaccion = new JLabel("Tipo Transacción");
		lblTipoTransaccion.setBounds(70, 284, 109, 14);
		panel_1.add(lblTipoTransaccion);

		txtTipotransaccion = new JTextField();
		txtTipotransaccion.setBounds(189, 281, 162, 20);
		panel_1.add(txtTipotransaccion);
		txtTipotransaccion.setEditable(false);
		txtTipotransaccion.setColumns(10);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(189, 250, 162, 20);
		panel_1.add(txtPrecio);
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(70, 256, 80, 14);
		panel_1.add(lblPrecio);

		JLabel lblCategoria = new JLabel("Categoría");
		lblCategoria.setBounds(70, 219, 80, 14);
		panel_1.add(lblCategoria);

		txtCategoria = new JTextField();
		txtCategoria.setBounds(189, 219, 162, 20);
		panel_1.add(txtCategoria);
		txtCategoria.setEditable(false);
		txtCategoria.setColumns(10);

		txtFormato = new JTextField();
		txtFormato.setBounds(189, 188, 162, 20);
		panel_1.add(txtFormato);
		txtFormato.setEditable(false);
		txtFormato.setColumns(10);

		JLabel lblFormato = new JLabel("Formato");
		lblFormato.setBounds(70, 191, 80, 14);
		panel_1.add(lblFormato);

		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(70, 160, 80, 14);
		panel_1.add(lblAutor);

		txtAutor = new JTextField();
		txtAutor.setBounds(189, 157, 162, 20);
		panel_1.add(txtAutor);
		txtAutor.setEditable(false);
		txtAutor.setColumns(10);

		JLabel lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(70, 129, 80, 14);
		panel_1.add(lblTitulo);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(189, 126, 162, 20);
		panel_1.add(txtTitulo);
		txtTitulo.setEditable(false);
		txtTitulo.setColumns(10);

		btnGuardarDatos = new JButton("Guardar Datos");
		btnGuardarDatos.setActionCommand("GUARDAR");
		btnGuardarDatos.setBounds(189, 355, 162, 23);
		panel_1.add(btnGuardarDatos);
	}

	public void setControlador(ControladorArticuloCompra controlador) {

		btnBuscar.addActionListener(controlador);
		btnGuardarDatos.addActionListener(controlador);
		btnAgregarCliente.addActionListener(controlador);
		btnEditarCliente.addActionListener(controlador);
	}
}
