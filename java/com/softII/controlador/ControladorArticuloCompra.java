package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import com.softII.dominio.Articulo;
import com.softII.vista.ArticulosCompra;

public class ControladorArticuloCompra implements ActionListener {

	private Articulo modeloArticulo;
	private ArticulosCompra vistaArticulo;

	public ControladorArticuloCompra(ArticulosCompra vistaArticulo) {
		super();
		this.modeloArticulo = new Articulo();
		this.vistaArticulo = vistaArticulo;
	}

	public void iniciarVista() {
		vistaArticulo.setTitle("Agregar Artículo");

		vistaArticulo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaArticulo.setLocationRelativeTo(null);
		vistaArticulo.setVisible(true);

	}

	public Articulo getModeloArticulo() {
		return modeloArticulo;
	}

	public void setModeloArticulo(Articulo modeloArticulo) {
		this.modeloArticulo = modeloArticulo;
	}

	public ArticulosCompra getVistaArticulo() {
		return vistaArticulo;
	}

	public void setVistaArticulo(ArticulosCompra vistaArticulo) {
		this.vistaArticulo = vistaArticulo;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if ("BUSCAR".equals(e.getActionCommand())) {

			if ("".equals(vistaArticulo.getTxtReferencia().getText())) {

				vistaArticulo.mostrarMensaje("Ingrese los datos requeridos");

				return;

			}

			modeloArticulo.setReferencia(vistaArticulo.getTxtReferencia().getText());
			modeloArticulo = modeloArticulo.buscar();

			if (modeloArticulo != null) {
				vistaArticulo.getTxtReferencia().setText(modeloArticulo.getReferencia());
				vistaArticulo.getTxtTitulo().setText(modeloArticulo.getTitulo());
				vistaArticulo.getTxtAutor().setText(modeloArticulo.getAutor());
				vistaArticulo.getTxtCategoria().setText(modeloArticulo.getCategorias().get(0).getNombreCategoria());
				vistaArticulo.getTxtEstado().setText(modeloArticulo.getEstado().getDescripcion());
				vistaArticulo.getTxtFormato().setText(modeloArticulo.getFormato().getNombreFormato());
				vistaArticulo.getTxtPrecio().setText(modeloArticulo.getPrecio().toString());

				vistaArticulo.getTxtTipotransaccion().setText(modeloArticulo.getTipoTransaccion().getDescripcion());
				vistaArticulo.getBtnAgregar().setEnabled(true);
			} else {
				vistaArticulo.mostrarMensaje("No existe un articulo con esta referencia");
			}

		} else if ("AGREGAR".equals(e.getActionCommand())) {

			vistaArticulo.dispose();
		} else if ("CANCELAR".equals(e.getActionCommand())) {

			vistaArticulo.dispose();
		}

	}

}
