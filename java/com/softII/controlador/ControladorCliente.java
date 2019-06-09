package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

import com.softII.Util.Item;
import com.softII.dominio.Afiliacion;
import com.softII.dominio.Cliente;
import com.softII.dominio.EstadoValidez;
import com.softII.vista.GestionClientes;

public class ControladorCliente implements ActionListener {
	Cliente modeloCliente;
	GestionClientes vistaCliente;

	public ControladorCliente(Cliente modelo, GestionClientes vista) {
		this.modeloCliente = modelo;
		this.vistaCliente = vista;
	}

	public void iniciarVista() {
		vistaCliente.setTitle("Gestión de Clientes");
		vistaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vistaCliente.setLocationRelativeTo(null);
		llenarAfiliaciones();
		llenarEstados();
		vistaCliente.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Controlador ejecutado");

		modeloCliente.setApellido1(vistaCliente.getTxtApellidos());
		modeloCliente.setNombre1(vistaCliente.getTxtNombres());
		modeloCliente.setDocumentoId(vistaCliente.getTxtCedula());
		modeloCliente.setEmail(vistaCliente.getTxtEmail());
		modeloCliente.setTelefono(vistaCliente.getTxtTelefono());
		modeloCliente.setDireccion(vistaCliente.getTxtDireccion());
		modeloCliente.getAfiliacion().setIdAfiliacion(1);

		boolean resultado = modeloCliente.registrarCliente();

	}


	public void llenarAfiliaciones() {
		Afiliacion afiliacion = new Afiliacion();

		Vector model = new Vector();

		List<Afiliacion> afiliaciones = afiliacion.listarAfiliaciones();

		for (Afiliacion afiliacionN : afiliaciones) {
			model.addElement(new Item(afiliacionN.getIdAfiliacion(), afiliacionN.getNombreAfiliacion()));
		}

		vistaCliente.getCbAfiliacion().setModel(new DefaultComboBoxModel(model));

	}
	public void llenarEstados() {
		EstadoValidez estadoValidez = new EstadoValidez();

		Vector model = new Vector();

		List<EstadoValidez> estados = estadoValidez.listarEstados();

		for (EstadoValidez estado : estados) {
			model.addElement(new Item(estado.getIdEstadoUsuario(), estado.getDescripcion()));
		}

		vistaCliente.getCbEstado().setModel(new DefaultComboBoxModel(model));

	}
}
