package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.softII.controlador.ControladorCompras;
import com.softII.controlador.ControladorModulos;
import com.softII.dominio.Articulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Compras extends JDialog {

	private JPanel contentPane;
	private JTextField txtDocumentoId;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JButton btnVincularCliente;
	private JTable listaArticulos;
	private Panel panelTabla;
	private JButton btnAgregarArticulo;
	private JLabel lblPagoTotalDel;
	private JTextField txtPagoTotal;
	private JButton btnPagar;
	private JButton btnCancelar;

	public void mostrarMensaje(String mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, mensaje);

	}

	
	
	public JButton getBtnVincularCliente() {
		return btnVincularCliente;
	}



	public void setBtnVincularCliente(JButton btnVincularCliente) {
		this.btnVincularCliente = btnVincularCliente;
	}



	public JButton getBtnAgregarArticulo() {
		return btnAgregarArticulo;
	}



	public void setBtnAgregarArticulo(JButton btnAgregarArticulo) {
		this.btnAgregarArticulo = btnAgregarArticulo;
	}



	public JButton getBtnPagar() {
		return btnPagar;
	}



	public void setBtnPagar(JButton btnPagar) {
		this.btnPagar = btnPagar;
	}



	public JButton getBtnCancelar() {
		return btnCancelar;
	}



	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}



	public JTextField getTxtPagoTotal() {
		return txtPagoTotal;
	}



	public void setTxtPagoTotal(JTextField txtPagoTotal) {
		this.txtPagoTotal = txtPagoTotal;
	}



	public JTable getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(JTable listaArticulos) {
		this.listaArticulos = listaArticulos;
	}

	public JTextField getTxtDocumentoId() {
		return txtDocumentoId;
	}

	public void setTxtDocumentoId(JTextField txtDocumentoId) {
		this.txtDocumentoId = txtDocumentoId;
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
		
		super((java.awt.Frame) null, true);
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 582, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNroDeIdentificacin = new JLabel("Nro de Identificación");
		lblNroDeIdentificacin.setBounds(10, 11, 134, 14);
		contentPane.add(lblNroDeIdentificacin);

		txtDocumentoId = new JTextField();
		txtDocumentoId.setEditable(false);
		txtDocumentoId.setBounds(175, 11, 141, 20);
		contentPane.add(txtDocumentoId);
		txtDocumentoId.setColumns(10);

		txtNombres = new JTextField();
		txtNombres.setEditable(false);
		txtNombres.setBounds(175, 42, 141, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);

		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(10, 42, 134, 14);
		contentPane.add(lblNombres);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 73, 100, 14);
		contentPane.add(lblApellidos);

		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setBounds(175, 73, 141, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);

		btnVincularCliente = new JButton("Vincular Cliente");
		btnVincularCliente.setActionCommand("VINCULAR");

		btnVincularCliente.setBounds(343, 7, 169, 23);
		contentPane.add(btnVincularCliente);

		btnAgregarArticulo = new JButton("Agregar Artículo");
		btnAgregarArticulo.setEnabled(false);
		btnAgregarArticulo.setActionCommand("AGREGAR_ARTICULO");

		btnAgregarArticulo.setBounds(10, 131, 182, 23);
		contentPane.add(btnAgregarArticulo);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 98, 537, 2);
		contentPane.add(separator);

		List<Articulo> listaArticulos2 = new ArrayList<Articulo>();

		DefaultTableModel model = new DefaultTableModel();
		listaArticulos = new JTable(model);
		listaArticulos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Se ha ejecutado un click");
			}
		});
		listaArticulos.setSurrendersFocusOnKeystroke(true);
		listaArticulos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listaArticulos.setCellSelectionEnabled(true);
		listaArticulos.setFont(new Font("Tahoma", Font.BOLD, 11));

		Object[] columnas = { "Referencia", "Titulo", "Formato", "Transacción", "Precio", "Accion" };

		for (Object object : columnas) {

			model.addColumn(object);

		}

		model.addRow(columnas);
		listaArticulos.getTableHeader().setFont(new Font("SansSerif", 1, 18));
		panelTabla = new Panel();
		panelTabla.setFont(new Font("Arial", Font.BOLD, 14));
		panelTabla.setBounds(10, 176, 516, 103);
		contentPane.add(panelTabla);
		panelTabla.setLayout(new BoxLayout(panelTabla, BoxLayout.X_AXIS));
		panelTabla.add(listaArticulos);

		lblPagoTotalDel = new JLabel("Total a Pagar:");
		lblPagoTotalDel.setBounds(10, 382, 114, 14);
		contentPane.add(lblPagoTotalDel);

		txtPagoTotal = new JTextField();
		txtPagoTotal.setEditable(false);
		txtPagoTotal.setBounds(147, 379, 86, 20);
		contentPane.add(txtPagoTotal);
		txtPagoTotal.setColumns(10);

		btnPagar = new JButton("Pagar");
		btnPagar.setEnabled(false);
		btnPagar.setActionCommand("PAGAR");

		btnPagar.setBounds(10, 421, 89, 23);
		contentPane.add(btnPagar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setActionCommand("CANCELAR");

		btnCancelar.setBounds(144, 421, 89, 23);
		contentPane.add(btnCancelar);

	}

	public void agregarFila(Articulo articulo) {
		Object[] filaArticulo = { articulo.getReferencia(), articulo.getTitulo(),
				articulo.getFormato().getNombreFormato(), articulo.getTipoTransaccion().getDescripcion(),
				articulo.getPrecio() };

		DefaultTableModel model = (DefaultTableModel) listaArticulos.getModel();

		model.addRow(filaArticulo);
	}

	public void setControlador(ControladorCompras controlador) {
		btnVincularCliente.addActionListener(controlador);
		btnAgregarArticulo.addActionListener(controlador);
		btnPagar.addActionListener(controlador);
		btnCancelar.addActionListener(controlador);
	}
}
