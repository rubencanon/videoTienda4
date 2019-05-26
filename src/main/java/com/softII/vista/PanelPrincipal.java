package com.softII.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.softII.controlador.ControladorPanel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PanelPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtClave;
	private JLabel lblMensaje;
	private JButton btnAutenticarse;
	private JButton btnAutenticarse_1;
	// ControladorPanelPrincipal controlador = new ControladorPanelPrincipal(logica,
	// panelPrincipal);

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public JTextField getTxtClave() {
		return txtClave;
	}

	public void setTxtClave(JTextField txtClave) {
		this.txtClave = txtClave;
	}

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PanelPrincipal frame = new PanelPrincipal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */

	public void mostrarMensaje(String Mensaje) {
		this.setVisible(true);
		JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.");

	}

	public PanelPrincipal() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		btnAutenticarse = new JButton("Autenticarse");

		btnAutenticarse.setActionCommand("autenticarse");
//		btnAutenticarse.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//			}
//		});
		//btnAutenticarse.setBounds(151, 217, 130, 23);
		panel.add(btnAutenticarse);

		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		//txtUsuario.setBounds(166, 32, 86, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtClave = new JTextField();
		txtClave.setText("Clave");
		//txtClave.setBounds(166, 68, 86, 20);
		panel.add(txtClave);
		txtClave.setColumns(10);

		JLabel lblClave = new JLabel("Clave");
		//lblClave.setBounds(93, 71, 46, 14);
		panel.add(lblClave);

		JLabel lblUsuario = new JLabel("Usuario");
		//lblUsuario.setBounds(93, 35, 46, 14);
		panel.add(lblUsuario);

		lblMensaje = new JLabel("mensaje");
		//lblMensaje.setBounds(194, 142, 46, 14);
		panel.add(lblMensaje);
		
		btnAutenticarse_1 = new JButton("autenticarse");
		btnAutenticarse_1.setBounds(156, 100, 89, 23);
		panel.add(btnAutenticarse_1);

	}

	public void setControlador(ControladorPanel controlador) {
		btnAutenticarse_1.addActionListener(controlador);

	}

}
