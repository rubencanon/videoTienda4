package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import com.softII.dominio.Articulo;
import com.softII.vista.GestionArticulos;

public class ControladorGestionArticulos implements ActionListener {

	private GestionArticulos vistaArticulo;
	private Articulo modeloArticulo;

	public ControladorGestionArticulos(GestionArticulos vistaArticulo, Articulo modeloArticulo) {
		super();
		this.vistaArticulo = vistaArticulo;
		this.modeloArticulo = modeloArticulo;
	}

	public void iniciarVista() {
		vistaArticulo.setTitle("GESTIÓN DE ARTÍCULOS");
		vistaArticulo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaArticulo.setLocationRelativeTo(null);
		vistaArticulo.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if ("BUSCAR".equals(e.getActionCommand())) {

		} else if ("AGREGAR_ARTICULO".equals(e.getActionCommand())) {


			vistaArticulo.getTxtAutor().setEditable(true);
			vistaArticulo.getTxtCategoria().setEditable(true);
			vistaArticulo.getTxtEstado().setEditable(true);
			vistaArticulo.getTxtFormato().setEditable(true);
			vistaArticulo.getTxtPrecio().setEditable(true);
			vistaArticulo.getTxtTipotransaccion().setEditable(true);
			vistaArticulo.getTxtTitulo().setEditable(true);

		} else if ("GUARDAR_DATOS".equals(e.getActionCommand())) {
			
//			modeloArticulo.setAutor(vistaArticulo.getTxtAutor().getText());
//			//modeloArticulo.setEstado(vistaArticulo.getTxtEstado().getText());
//			//modeloArticulo.setFormato(vistaArticulo.getTxtFormato());
//			modeloArticulo.setPrecio(new Long(vistaArticulo.getTxtPrecio().getText()));
//			modeloArticulo.setReferencia(vistaArticulo.getTxtReferencia().getText());
//			modeloArticulo.setTipoTransaccion(tipoTransaccion);
//			modeloArticulo.setTitulo(titulo);
		}
			

	}

}
