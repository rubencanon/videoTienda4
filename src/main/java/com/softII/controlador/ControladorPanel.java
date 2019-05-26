package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.softII.dominio.Usuario;
import com.softII.vista.PanelPrincipal;

public class ControladorPanel implements ActionListener {

	Usuario modelo;
	PanelPrincipal panel;

	public ControladorPanel(Usuario modelo, PanelPrincipal panelPrincipal) {
		this.modelo = modelo;
		this.panel = panelPrincipal;

	}

	public void iniciarVista() {
		panel.setTitle("Tienda El Buen Lector");
		// panel.pack();
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLocationRelativeTo(null);
		panel.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Controlador ejecutado");
		System.out.println(e.getActionCommand());

		if (e.getActionCommand().equals("autenticarse")) {
			// TODO Auto-generated method stub

		}

		// panelPrincipal.setMensaje(mensaje);
	}

}
