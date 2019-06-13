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
		vistaArticulo.setTitle("Video Tienda");
		vistaArticulo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaArticulo.setLocationRelativeTo(null);
		vistaArticulo.setVisible(true);
		
		

	}


	public void actionPerformed(ActionEvent e) {
		if ("BUSCAR".equals(e.getActionCommand())) {
			
		}
	}

}
