package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;

import javax.swing.JFrame;

import com.softII.dominio.Usuario;
import com.softII.vista.Autenticacion;
import com.softII.vista.Modulos;

public class ControladorAutenticacion implements ActionListener {

	Usuario usuario;
	Autenticacion autenticacion;

	public ControladorAutenticacion(Usuario usuario, Autenticacion autenticacion) {
		this.usuario = usuario;
		this.autenticacion = autenticacion;

	}

	public void iniciarVista() {

		autenticacion.setTitle("Tienda El Buen Lector");
		autenticacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		autenticacion.setLocationRelativeTo(null);

		autenticacion.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Controlador ejecutado");
		System.out.println(e.getActionCommand());

		String idUsuario = autenticacion.getTxtUsuario().getText();
		String clave = autenticacion.getTxtClave().getText();

		System.out.println(idUsuario);

		usuario = new Usuario();
		usuario.setIdUsuario(idUsuario);
		usuario = usuario.buscarUsuario();

		if (usuario != null) {
			boolean autenticado = usuario.autenticarUsuario(idUsuario, clave);

			if (autenticado == true) {

				//autenticacion.setVisible(false);
				Modulos modulos = new Modulos();
				ControladorModulos comtroladorModulos = new ControladorModulos(modulos);
				modulos.setControlador(comtroladorModulos);
				
				comtroladorModulos.iniciarVista();

				


			} else {
				autenticacion.mostrarMensaje("Credenciales Invalidas");
			}
		} else {
			autenticacion.mostrarMensaje("Credenciales Invalidas");

		}

		
		
		
		
		if (e.getActionCommand().equals("autenticarse")) {
			// TODO Auto-generated method stub
			
			
			System.exit(0);

		}

		// panelPrincipal.setMensaje(mensaje);
	}

}
