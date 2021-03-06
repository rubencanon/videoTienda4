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
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

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

		if ("AUTENTICAR".equals(e.getActionCommand())) {
			
			
			if ("".equals(vistaAutenticacion.getTxtUsuario().getText()) || "".equals(vistaAutenticacion.getPwdClave().getText())) {

				vistaAutenticacion.mostrarMensaje("Ingrese los datos requeridos");

				return;

			}


			String idUsuario = vistaAutenticacion.getTxtUsuario().getText();
			String clave = vistaAutenticacion.getPwdClave().getText();

			modeloUsuario.setDocumentoId(idUsuario);
			modeloUsuario = modeloUsuario.buscarUsuario();

			if (modeloUsuario != null) {
				boolean autenticado = modeloUsuario.autenticar(idUsuario, clave);

				if (autenticado == true) {

					Modulos vistaModulos = new Modulos();
					ControladorModulos controladorModulos = new ControladorModulos(vistaModulos, modeloUsuario);
					vistaModulos.setControlador(controladorModulos);

					List<Privilegio> privilegios = modeloUsuario.getRol().getPrivilegios();

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
					controladorModulos.iniciarVista();
					vistaAutenticacion.show();
				} else {
					vistaAutenticacion.mostrarMensaje("Credenciales Invalidas");
				}
			} else {
				vistaAutenticacion.mostrarMensaje("Credenciales Invalidas");

			}
		}else if ("SALIR".equals(e.getActionCommand())) {
			
			int respuesta = vistaAutenticacion.mostrarMensajeConfirmacion("Confirme que dese salir de la aplicación", "Confirmación de salida");
			
			if (respuesta == 0) {
				vistaAutenticacion.dispose();
	
			}
			
		}
		// panelPrincipal.setMensaje(mensaje);
	}

}
