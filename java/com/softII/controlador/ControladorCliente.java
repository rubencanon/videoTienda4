package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;

import com.softII.Util.Item;
import com.softII.dominio.Afiliacion;
import com.softII.dominio.Cliente;
import com.softII.dominio.EstadoValidez;
import com.softII.dominio.Persona;
import com.softII.vista.GestionClientes;
import com.softII.vista.Modulos;

public class ControladorCliente implements ActionListener {

	Cliente modeloCliente;
	GestionClientes vistaCliente;

	public ControladorCliente(GestionClientes vistaClientes) {
		this.modeloCliente = new Cliente();
		this.vistaCliente = vistaClientes;
	}

	public void iniciarVista() {

		llenarAfiliaciones();
		llenarEstados();
		
		vistaCliente.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaCliente.setLocationRelativeTo(null);
		vistaCliente.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador ejecutado");
		String comando = e.getActionCommand();

		Cliente cliente;

		if ("Buscar".contentEquals(comando)) {

			System.out.println("Buscar Cliente");

			modeloCliente.setDocumentoId(vistaCliente.getCedulaText().getText());

			cliente = modeloCliente.buscar();

			if (cliente != null) {
				inactivarJText();
				cargarDatos(cliente);
				vistaCliente.getEditar().setEnabled(true);
			} else {
				vistaCliente.mostrarMensajeDialogo("No existe un Cliente con esta identificación");
				limpiarJText();
			}

		} else if ("Agregar".contentEquals(comando)) {

			System.out.println("Insertar Cliente");
			limpiarJText();
			activarJText();
			vistaCliente.getGuardar().setActionCommand("Guardar");
			vistaCliente.getGuardar().setEnabled(true);

		} else if ("Editar".contentEquals(comando)) {

			System.out.println("Editar Cliente");
			activarJText();
			vistaCliente.getGuardar().setActionCommand("EditarReal");
			vistaCliente.getEditar().setEnabled(false);

		} else if ("EditarReal".contentEquals(comando)) {

			System.out.println("Editar Cliente Real");
			if (vistaCliente.mostrarMensajeConfirmacion("Realmente desea modificar el Cliente?",
					"Confirmar Operacion") == 0) {
				if (validarItems() == true) {

					EstadoValidez estadoValidez = new EstadoValidez();
					estadoValidez.setIdEstadoUsuario(vistaCliente.getEstadoBox().getSelectedIndex() + 1);

					Afiliacion afiliacion = new Afiliacion();
					afiliacion.setIdAfiliacion(vistaCliente.getAfiliacionBox().getSelectedIndex() + 1);

					cliente = new Cliente();
					cliente.setAfiliacion(afiliacion);
					cliente.setEstado(estadoValidez);
					cliente.setApellidos(vistaCliente.getApellidosText().getText());
					cliente.setDireccion(vistaCliente.getDireccionText().getText());
					cliente.setDocumentoId(vistaCliente.getCedulaText().getText());
					cliente.setEmail(vistaCliente.getEmailText().getText());
					cliente.setNombres(vistaCliente.getNombresText().getText());
					cliente.setTelefono(vistaCliente.getTelefonoText().getText());

					cliente.setAfiliacion(afiliacion);
					cliente.setEstado(estadoValidez);

					if (cliente.actualizar() == true) {

						vistaCliente.mostrarMensajeDialogo("El cliente ha sido modificado con exito");
						inactivarJText();
						vistaCliente.getAgregar().setEnabled(true);
						vistaCliente.getEditar().setEnabled(true);
						vistaCliente.getBuscar().setEnabled(true);
					} else {

						vistaCliente.mostrarMensajeDialogo("No se logró modificar el cliente");
					}
				} else {
					vistaCliente.mostrarMensajeDialogo("Ingrese todos los datos del Cliente");
				}
			}
		} else if ("Guardar".contentEquals(comando)) {

			System.out.println("Guardar Cliente");
			if (vistaCliente.mostrarMensajeConfirmacion("Realmente desea crear el Cliente?",
					"Confirmar Operacion") == 0) {
				if (validarItems() == true) {

					EstadoValidez estadoValidez = new EstadoValidez();
					estadoValidez.setIdEstadoUsuario(vistaCliente.getEstadoBox().getSelectedIndex() + 1);

					Afiliacion afiliacion = new Afiliacion();
					afiliacion.setIdAfiliacion(vistaCliente.getAfiliacionBox().getSelectedIndex() + 1);

					cliente = new Cliente();
					cliente.setAfiliacion(afiliacion);
					cliente.setEstado(estadoValidez);
					cliente.setApellidos(vistaCliente.getApellidosText().getText());
					cliente.setDireccion(vistaCliente.getDireccionText().getText());
					cliente.setDocumentoId(vistaCliente.getCedulaText().getText());
					cliente.setEmail(vistaCliente.getEmailText().getText());
					cliente.setNombres(vistaCliente.getNombresText().getText());
					cliente.setTelefono(vistaCliente.getTelefonoText().getText());

					cliente.setAfiliacion(afiliacion);
					cliente.setEstado(estadoValidez);

					System.out.println("[" + cliente.getNombres() + " " + cliente.getApellidos() + "]");

					if (cliente.insertar() == true) {

						vistaCliente.mostrarMensajeDialogo("El cliente ha sido guarda con exito");
						inactivarJText();
						vistaCliente.getAgregar().setEnabled(true);
						vistaCliente.getEditar().setEnabled(true);
						vistaCliente.getBuscar().setEnabled(true);
					} else {

						vistaCliente.mostrarMensajeDialogo("No se logró guardar el cliente");
					}
				} else {
					vistaCliente.mostrarMensajeDialogo("Ingrese todos los datos del Cliente");
				}
			}

		} else if ("Cancelar".contentEquals(comando)) {

			System.out.println("Cancelar");
			if (vistaCliente.mostrarMensajeConfirmacion("Realmente desea cancelar la operacion?",
					"Cancelar Operacion") == 0) {
				vistaCliente.setVisible(false);
			}

		}

	}

	public void cargarDatos(Cliente cliente) {

		vistaCliente.getNombresText().setText(cliente.getNombres());
		vistaCliente.getApellidosText().setText(cliente.getApellidos());
		vistaCliente.getCedulaText().setText(cliente.getDocumentoId());
		vistaCliente.getEmailText().setText(cliente.getEmail());
		vistaCliente.getTelefonoText().setText(cliente.getTelefono());
		vistaCliente.getDireccionText().setText(cliente.getDireccion());
	}

	public void activarJText() {

		vistaCliente.getCedulaText().setEnabled(true);
		vistaCliente.getNombresText().setEnabled(true);
		vistaCliente.getApellidosText().setEnabled(true);
		vistaCliente.getEmailText().setEnabled(true);
		vistaCliente.getDireccionText().setEnabled(true);
		vistaCliente.getTelefonoText().setEnabled(true);
		vistaCliente.getEstadoBox().setEnabled(true);
		vistaCliente.getAfiliacionBox().setEnabled(true);
		vistaCliente.getGuardar().setEnabled(true);
	}

	public void limpiarJText() {

		vistaCliente.getCedulaText().setText("");
		vistaCliente.getNombresText().setText("");
		vistaCliente.getApellidosText().setText("");
		vistaCliente.getEmailText().setText("");
		vistaCliente.getDireccionText().setText("");
		vistaCliente.getTelefonoText().setText("");
	}

	public void inactivarJText() {

		vistaCliente.getCedulaText().setEnabled(true);
		vistaCliente.getNombresText().setEnabled(false);
		vistaCliente.getApellidosText().setEnabled(false);
		vistaCliente.getEmailText().setEnabled(false);
		vistaCliente.getDireccionText().setEnabled(false);
		vistaCliente.getTelefonoText().setEnabled(false);
		vistaCliente.getEstadoBox().setEnabled(false);
		vistaCliente.getAfiliacionBox().setEnabled(false);
		vistaCliente.getGuardar().setEnabled(false);
	}

	public boolean validarItems() {

		if (vistaCliente.getNombresText().getText().equals("") || vistaCliente.getApellidosText().getText().equals("")
				|| vistaCliente.getEmailText().getText().equals("")
				|| vistaCliente.getDireccionText().getText().equals("")
				|| vistaCliente.getTelefonoText().getText().equals("")
				|| vistaCliente.getCedulaText().getText().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	public void llenarAfiliaciones() {

		Afiliacion afiliacion = new Afiliacion();
		List<Afiliacion> afiliaciones = afiliacion.listarAfiliaciones();

		Vector model = new Vector();

		for (Afiliacion afiliacionN : afiliaciones) {
			model.addElement(new Item(afiliacionN.getIdAfiliacion(), afiliacionN.getNombreAfiliacion()));
		}

		vistaCliente.getAfiliacionBox().setModel(new DefaultComboBoxModel(model));

	}

	public void llenarEstados() {

		EstadoValidez estadoValidez = new EstadoValidez();
		List<EstadoValidez> estados = estadoValidez.obtenerEstados();

		Vector model = new Vector();

		for (EstadoValidez estado : estados) {
			model.addElement(new Item(estado.getIdEstadoUsuario(), estado.getDescripcion()));
		}

		vistaCliente.getEstadoBox().setModel(new DefaultComboBoxModel(model));

	}
}
