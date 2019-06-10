package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Panel;

public class Compras extends JFrame {

	private JPanel contentPane;
	private JTextField txtDocumentoId;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JButton btnVincularCliente;
	private JTable listaArticulos;
	private Panel panelTabla;
	private JButton btnAgregarArticulo;
	
	

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 582, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNroDeIdentificacin = new JLabel("Nro de Identificación");
		lblNroDeIdentificacin.setBounds(10, 11, 114, 14);
		contentPane.add(lblNroDeIdentificacin);

		txtDocumentoId = new JTextField();
		txtDocumentoId.setEditable(false);
		txtDocumentoId.setBounds(144, 8, 141, 20);
		contentPane.add(txtDocumentoId);
		txtDocumentoId.setColumns(10);

		txtNombres = new JTextField();
		txtNombres.setEditable(false);
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
		txtApellidos.setEditable(false);
		txtApellidos.setBounds(144, 70, 141, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);

		btnVincularCliente = new JButton("Vincular Cliente");


		btnVincularCliente.setActionCommand("VINCULAR");

		btnVincularCliente.setBounds(304, 7, 153, 23);
		contentPane.add(btnVincularCliente);

		btnAgregarArticulo = new JButton("Agregar Artículo");
		btnAgregarArticulo.setActionCommand("AGREGAR_ARTICULO");

		btnAgregarArticulo.setBounds(10, 131, 134, 23);
		contentPane.add(btnAgregarArticulo);
		

		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 98, 537, 2);
		contentPane.add(separator);

		List<Articulo> listaArticulos2 = new ArrayList<Articulo>(); 



		
		DefaultTableModel model = new DefaultTableModel(); 
		listaArticulos = new JTable(model); 
		
		Object[] columnas = {"Referencia", "Titulo", "Formato", "Transacción", "Precio", "Accion"};		
		
	    String data[][]={ {"101","Amit","670000"},    
                {"102","Jai","780000"},    
                {"101","Sachin","700000"}}; 
		
	    
	    
	    
		for (Object object : columnas) {
		
			model.addColumn(object); 

		}
		
	    
		for (Articulo  articulo: listaArticulos2) {
			Object[] filaArticulo = new Object[5];
			  filaArticulo[0] = articulo.getTitulo();
			  filaArticulo[1] = articulo.getReferencia();
			  filaArticulo[2] = articulo.getFormato();
			  filaArticulo[3] = articulo.getTipoTransaccion().getDescripcion();
			  filaArticulo[4] = articulo.getPrecio();
			  filaArticulo[5] = new JButton();

			  model.addRow(filaArticulo);

		}

		
		
		
		
		
		model.addRow(columnas);
		Object[] columnas2 = {"Referencia", "Titulo", "Formato", "Transacción", "Precio"};		

		model.addRow(columnas2);

		
		
		panelTabla = new Panel();
		panelTabla.setBounds(10, 348, 516, 103);
		contentPane.add(panelTabla);
		panelTabla.add(listaArticulos, BorderLayout.CENTER);
		

	

		
		
	}
	
	public void agregarFila(Articulo articulo) {
		Object[] filaArticulo =  {articulo.getReferencia(), articulo.getTitulo(),articulo.getFormato().getNombreFormato(), articulo.getTipoTransaccion().getDescripcion(),articulo.getPrecio()  };
	
		  DefaultTableModel model = (DefaultTableModel) listaArticulos.getModel();
		  
		  model.addRow(filaArticulo);
	}

	public void setControlador(ControladorCompras controlador) {
		btnVincularCliente.addActionListener(controlador);
		btnAgregarArticulo.addActionListener(controlador);
	}
}
