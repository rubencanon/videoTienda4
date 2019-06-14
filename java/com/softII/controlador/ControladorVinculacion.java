package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.softII.dominio.Cliente;
import com.softII.vista.VinculacionCliente;

public class ControladorVinculacion implements ActionListener {

	VinculacionCliente vistaVinculacion;
	Cliente modeloCliente;

	public ControladorVinculacion(VinculacionCliente vistaVinculacion, Cliente modeloCliente) {
		super();
		this.vistaVinculacion = vistaVinculacion;
		this.modeloCliente = modeloCliente;
	}

	public VinculacionCliente getVinculacion() {
		return vistaVinculacion;
	}

	public void setVinculacion(VinculacionCliente vinculacion) {
		this.vistaVinculacion = vinculacion;
	}

	public Cliente getCliente() {
		return modeloCliente;
	}

	public void setCliente(Cliente cliente) {
		this.modeloCliente = cliente;
	}

	public void iniciarVista() {
		vistaVinculacion.setTitle("Video Tienda");
		vistaVinculacion.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaVinculacion.setLocationRelativeTo(null);
		vistaVinculacion.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());

		if ("BUSCAR".equals(e.getActionCommand())) {

			System.out.println(e.getActionCommand());

			modeloCliente.setDocumentoId(vistaVinculacion.getTxtDocumentoid().getText());

			modeloCliente = modeloCliente.buscarCliente();
			System.out.println("....");
			if (modeloCliente != null) {
				vistaVinculacion.getTxtNombres().setText(modeloCliente.getNombres());
				vistaVinculacion.getTxtApellidos().setText(modeloCliente.getApellidos());
				vistaVinculacion.getTxtEstado().setText(modeloCliente.getEstado().getDescripcion());
				vistaVinculacion.getTxtEmail().setText(modeloCliente.getEmail());
				vistaVinculacion.getTxtDireccion().setText(modeloCliente.getDireccion());
				vistaVinculacion.getTxtAfiliacion().setText(modeloCliente.getAfiliacion().getNombreAfiliacion());
				
				vistaVinculacion.getBtnVincular().setEnabled(true);;

			} else {
				vistaVinculacion.mostrarMensaje("El cliente ingresado no esta registrado en el sistema");
			}

		} else if ("VINCULAR".equals(e.getActionCommand())) {

			vistaVinculacion.dispose();

		} else if ("CANCELAR".equals(e.getActionCommand())) {
			vistaVinculacion.dispose();
		}

	}

}
