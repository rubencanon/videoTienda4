package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import com.softII.dominio.Articulo;
import com.softII.vista.ArticulosCompra;

public class ControladorArticuloCompra implements ActionListener {

	private Articulo modeloArticulo;
	private ArticulosCompra vistaArticulo;

	public ControladorArticuloCompra(Articulo modeloArticulo, ArticulosCompra vistaArticulo) {
		super();
		this.modeloArticulo = modeloArticulo;
		this.vistaArticulo = vistaArticulo;
	}

	public void iniciarVista() {
		vistaArticulo.setTitle("Video Tienda");
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
		System.out.println(e.getActionCommand());

		if ("BUSCAR".equals(e.getActionCommand())) {

			modeloArticulo.setReferencia(vistaArticulo.getTxtReferencia().getText());
			modeloArticulo = modeloArticulo.buscarArticulo();

			vistaArticulo.getTxtReferencia().setText(modeloArticulo.getReferencia());
			vistaArticulo.getTxtTitulo().setText(modeloArticulo.getTitulo());
			vistaArticulo.getTxtAutor().setText(modeloArticulo.getAutor());
			// vistaArticulo.getTxtCategoria().setText(articulo.getCategorias().get);
			vistaArticulo.getTxtEstado().setText(modeloArticulo.getEstado().getDescripcion());
			vistaArticulo.getTxtFormato().setText(modeloArticulo.getFormato().getNombreFormato());
			vistaArticulo.getTxtPrecio().setText(modeloArticulo.getPrecio().toString());

			vistaArticulo.getTxtTipotransaccion().setText(modeloArticulo.getTipoTransaccion().getDescripcion());

			System.out.println(modeloArticulo.getAutor());

		} else if ("AGREGAR".equals(e.getActionCommand())) {

			vistaArticulo.dispose();
		}

	}

}
