package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import com.softII.dominio.Cliente;
import com.softII.dominio.Pedido;
import com.softII.vista.Compras;
import com.softII.vista.Vinculacion;

public class ControladorVinculacion implements ActionListener {

	Vinculacion vinculacion;
	Cliente cliente;

	public ControladorVinculacion(Vinculacion vinculacion, Cliente cliente) {
		super();
		this.vinculacion = vinculacion;
		this.cliente = cliente;
	}

	public void iniciarVista() {
		vinculacion.setTitle("Video Tienda");
		vinculacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vinculacion.setLocationRelativeTo(null);
		vinculacion.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());

		if ("BUSCAR".equals(e.getActionCommand())) {

			System.out.println(e.getActionCommand());

			cliente.setDocumentoId(vinculacion.getTxtDocumentoid().getText());

			cliente = cliente.buscarCliente();

		}

	}

}
