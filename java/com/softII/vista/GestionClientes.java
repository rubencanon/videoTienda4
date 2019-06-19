package com.softII.vista;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.softII.controlador.ControladorCliente;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;

/**
 *
 * @author JuRiAnU
 */
public class GestionClientes extends JDialog {

	/**
	 * Creates new form agregarCliente1
	 */

	private javax.swing.JComboBox afiliacionBox;
	private javax.swing.JButton agregar;
	private javax.swing.JTextField apellidosText;
	private javax.swing.JButton buscar;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JButton cancelar;
	private javax.swing.JTextField cedulaText;
	private javax.swing.JTextField direccionText;
	private javax.swing.JButton editar;
	private javax.swing.JTextField emailText;
	private javax.swing.JComboBox estadoBox;
	private javax.swing.JButton guardar;
	private javax.swing.JLabel lblAfiliacion;
	private javax.swing.JLabel lblEstado;
	private javax.swing.JLabel lblCedula;
	private javax.swing.JLabel lblNombres;
	private javax.swing.JLabel lblApellidos;
	private javax.swing.JLabel lblDireccion;
	private javax.swing.JLabel lblTelefono;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JTextField nombresText;
	private javax.swing.JTextField telefonoText;

	
	
	
	public GestionClientes() throws HeadlessException {
		super();
		setResizable(false);
		setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
		buttonGroup1 = new javax.swing.ButtonGroup();
		jPanel1 = new javax.swing.JPanel();
		lblAfiliacion = new javax.swing.JLabel();
		lblCedula = new javax.swing.JLabel();
		lblNombres = new javax.swing.JLabel();
		lblApellidos = new javax.swing.JLabel();
		lblDireccion = new javax.swing.JLabel();
		lblTelefono = new javax.swing.JLabel();
		lblEmail = new javax.swing.JLabel();
		cedulaText = new javax.swing.JTextField();
		apellidosText = new javax.swing.JTextField();
		buscar = new javax.swing.JButton();
		afiliacionBox = new javax.swing.JComboBox();
		guardar = new javax.swing.JButton();
		lblEstado = new javax.swing.JLabel();
		estadoBox = new javax.swing.JComboBox();
		nombresText = new javax.swing.JTextField();
		emailText = new javax.swing.JTextField();
		direccionText = new javax.swing.JTextField();
		telefonoText = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		cancelar = new javax.swing.JButton();
		agregar = new javax.swing.JButton();
		editar = new javax.swing.JButton();

		setTitle("Buscar Cliente(s)");

		jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jPanel1.setMaximumSize(new java.awt.Dimension(480, 250));
		jPanel1.setPreferredSize(new java.awt.Dimension(480, 250));

		lblAfiliacion.setText("Afiliación");

		lblCedula.setText("No. Cédula");

		lblNombres.setText("Nombre(s)");

		lblApellidos.setText("Apellido(s)");

		lblDireccion.setText("Dirección");

		lblTelefono.setText("Teléfono");

		lblEmail.setText("Email");

		cedulaText.setMaximumSize(new java.awt.Dimension(6, 20));

		apellidosText.setEnabled(false);

		buscar.setText("Buscar Cliente");

		// afiliacionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		// "Ninguna", "6 Meses", "1 Año" }));
		afiliacionBox.setEnabled(false);

		guardar.setText("Guardar Datos");
		guardar.setEnabled(false);

		lblEstado.setText("Estado");

		// estadoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
		// "Activo", "Inactivo" }));
		estadoBox.setEnabled(false);

		nombresText.setEnabled(false);

		emailText.setEnabled(false);
		emailText.setMaximumSize(new java.awt.Dimension(6, 20));

		direccionText.setEnabled(false);

		telefonoText.setEnabled(false);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAfiliacion)
								.addComponent(lblEstado))
							.addGap(29)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(estadoBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addComponent(afiliacionBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(guardar))))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTelefono)
								.addComponent(lblDireccion)
								.addComponent(lblEmail)
								.addComponent(lblApellidos)
								.addComponent(lblNombres)
								.addComponent(lblCedula))
							.addGap(18)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addComponent(cedulaText, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(buscar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(direccionText, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
								.addComponent(telefonoText, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
								.addComponent(nombresText)
								.addComponent(apellidosText)
								.addComponent(emailText, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))
							.addGap(2)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(5)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cedulaText, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCedula)
						.addComponent(buscar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nombresText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombres))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(apellidosText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellidos))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(emailText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(direccionText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDireccion))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(telefonoText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTelefono))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(estadoBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEstado))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(afiliacionBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(guardar)
						.addComponent(lblAfiliacion))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {apellidosText, afiliacionBox, estadoBox, nombresText, emailText, direccionText, telefonoText});
		jPanel1.setLayout(jPanel1Layout);

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones del Menú"));
		jPanel3.setPreferredSize(new java.awt.Dimension(200, 250));

		cancelar.setText("Cancelar");

		agregar.setText("Agregar Cliente");

		editar.setText("Editar Cliente");
		editar.setEnabled(false);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cancelar).addComponent(agregar).addComponent(editar,
										javax.swing.GroupLayout.PREFERRED_SIZE, 107,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(0, 11, Short.MAX_VALUE)));

		jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { agregar, cancelar, editar });

		jPanel3Layout
				.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout.createSequentialGroup().addGap(6, 6, 6).addComponent(agregar)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(editar)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cancelar)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 492, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addContainerGap())
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jPanel1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
						.addComponent(jPanel3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(layout);

		pack();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	


	public JComboBox getAfiliacionBox() {
		return afiliacionBox;
	}

	public void setAfiliacionBox(JComboBox afiliacionBox) {
		this.afiliacionBox = afiliacionBox;
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JTextField getApellidosText() {
		return apellidosText;
	}

	public void setApellidosText(JTextField apellidosText) {
		this.apellidosText = apellidosText;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

	public JTextField getCedulaText() {
		return cedulaText;
	}

	public void setCedulaText(JTextField cedulaText) {
		this.cedulaText = cedulaText;
	}

	public JTextField getDireccionText() {
		return direccionText;
	}

	public void setDireccionText(JTextField direccionText) {
		this.direccionText = direccionText;
	}

	public JButton getEditar() {
		return editar;
	}

	public void setEditar(JButton editar) {
		this.editar = editar;
	}

	public JTextField getEmailText() {
		return emailText;
	}

	public void setEmailText(JTextField emailText) {
		this.emailText = emailText;
	}

	public JComboBox getEstadoBox() {
		return estadoBox;
	}

	public void setEstadoBox(JComboBox estadoBox) {
		this.estadoBox = estadoBox;
	}

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

	public JTextField getNombresText() {
		return nombresText;
	}

	public void setNombresText(JTextField nombresText) {
		this.nombresText = nombresText;
	}

	public JTextField getTelefonoText() {
		return telefonoText;
	}

	public void setTelefonoText(JTextField telefonoText) {
		this.telefonoText = telefonoText;
	}

	public void setControlador(ControladorCliente controlador) {
		buscar.setActionCommand("Buscar");
		buscar.addActionListener(controlador);

		agregar.setActionCommand("Agregar");
		agregar.addActionListener(controlador);

		editar.setActionCommand("Editar");
		editar.addActionListener(controlador);

		guardar.setActionCommand("Guardar");
		guardar.addActionListener(controlador);

		cancelar.setActionCommand("Cancelar");
		cancelar.addActionListener(controlador);
	}

	public void mostrarMensajeDialogo(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}

	public int mostrarMensajeConfirmacion(String mensaje, String titulo) {
		return JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
	}

}
