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

	public ControladorAutenticacion(Autenticacion autenticacion) {
		this.modeloUsuario = new Usuario();
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

						vistaModulos.getBtnGestinClientes().setEnabled(true);
					}

					if ("GESTIONAR ARTICULOS".equals(privilegio.getNombrePrivilegio())) {

						vistaModulos.getBtnGestionArticulos().setEnabled(true);
					}
					if ("GESTIONAR VENTAS Y ALQUILER".equals(privilegio.getNombrePrivilegio())) {

						vistaModulos.getBtnVentaAlquiler().setEnabled(true);
					}

				}
				vistaAutenticacion.hide();
				comtroladorModulos.iniciarVista();
				vistaAutenticacion.show();
			} else {
				vistaAutenticacion.mostrarMensaje("Credenciales Invalidas");
			}
		} else {
			vistaAutenticacion.mostrarMensaje("Credenciales Invalidas");

		}

		// panelPrincipal.setMensaje(mensaje);
	}

}
