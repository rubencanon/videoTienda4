package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.softII.controlador.ControladorCompras;
import com.softII.controlador.ControladorModulos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Compras extends JFrame {

	private JPanel contentPane;
	private JTextField txtDocumentoId;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTable table;
	JButton btnVincularCliente;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compras frame = new Compras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Compras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNroDeIdentificacin = new JLabel("Nro de Identificación");
		lblNroDeIdentificacin.setBounds(10, 11, 114, 14);
		contentPane.add(lblNroDeIdentificacin);

		txtDocumentoId = new JTextField();
		txtDocumentoId.setBounds(144, 8, 141, 20);
		contentPane.add(txtDocumentoId);
		txtDocumentoId.setColumns(10);

		txtNombres = new JTextField();
		txtNombres.setText("documento");
		txtNombres.setBounds(144, 39, 141, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);

		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 42, 46, 14);
		contentPane.add(lblNombres);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 73, 46, 14);
		contentPane.add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setText("apellidos");
		txtApellidos.setBounds(144, 70, 141, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);

		btnVincularCliente = new JButton("Vincular Cliente");
	

		btnVincularCliente.setActionCommand("VINCULAR");

		btnVincularCliente.setBounds(304, 7, 153, 23);
		contentPane.add(btnVincularCliente);
		DefaultTableModel model = new DefaultTableModel();

		table = new JTable(model);
		model.addColumn("Col1");
		model.addColumn("Col2");
		model.addRow(new Object[] { "v1", "v2" });
		/*
		 * table = new JTable(model); table.setBounds(58, 221, 253, -75);
		 * 
		 * 
		 * contentPane.add(table);
		 */

	}

	public void setControlador(ControladorCompras controlador) {
		btnVincularCliente.addActionListener(controlador);
	}
}
