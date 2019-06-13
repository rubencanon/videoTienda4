package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;
import java.util.Iterator;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.softII.dominio.Privilegio;
import com.softII.dominio.Usuario;
import com.softII.vista.Autenticacion;
import com.softII.vista.Modulos;

public class ControladorAutenticacion implements ActionListener {

	Usuario modeloUsuario;
	Autenticacion vistaAutenticacion;

	public ControladorAutenticacion(Usuario usuario, Autenticacion autenticacion) {
		this.modeloUsuario = usuario;
		this.vistaAutenticacion = autenticacion;

	}

	public void iniciarVista() {

		vistaAutenticacion.setTitle("Tienda El Buen Lector");
		vistaAutenticacion.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaAutenticacion.setLocationRelativeTo(null);
		vistaAutenticacion.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Controlador ejecutado");
		System.out.println(e.getActionCommand());

		String idUsuario = vistaAutenticacion.getTxtUsuario().getText();
		String clave = vistaAutenticacion.getTxtClave().getText();

		System.out.println(idUsuario);

		modeloUsuario = new Usuario();
		modeloUsuario.setDocumentoId(idUsuario);
		modeloUsuario = modeloUsuario.buscarUsuario();

		if (modeloUsuario != null) {
			boolean autenticado = modeloUsuario.autenticarUsuario(idUsuario, clave);

			if (autenticado == true) {

				List<Privilegio> privilegios = modeloUsuario.getRol().getPrivilegios();

				// autenticacion.setVisible(false);
				Modulos vistaModulos = new Modulos();
				ControladorModulos comtroladorModulos = new ControladorModulos(vistaModulos, modeloUsuario);
				vistaModulos.setControlador(comtroladorModulos);

				for (Privilegio privilegio : privilegios) {
					if ("GESTIONAR CLIENTES".equals(privilegio.getNombrePrivilegio())) {

						vistaModulos.getBtnGestinClientes().enable();
					}

					if ("GESTIONAR ARTICULOS2".equals(privilegio.getNombrePrivilegio())) {

						vistaModulos.getBtnGestionArticulos().enable();
					}
					if ("GESTIONAR VENTAS Y ALQUILER2".equals(privilegio.getNombrePrivilegio())) {

						vistaModulos.getBtnVentaAlquiler().enable();
					}

				}
				vistaAutenticacion.hide();
				comtroladorModulos.iniciarVista();

			} else {
				vistaAutenticacion.mostrarMensaje("Credenciales Invalidas");
			}
		} else {
			vistaAutenticacion.mostrarMensaje("Credenciales Invalidas");

		}

		if (e.getActionCommand().equals("autenticarse")) {
			// TODO Auto-generated method stub

			System.exit(0);

		}

		// panelPrincipal.setMensaje(mensaje);
	}

}
