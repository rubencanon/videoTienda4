package com.softII.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JList;

import com.softII.Util.Item;
import com.softII.dominio.Afiliacion;
import com.softII.dominio.Articulo;
import com.softII.dominio.Categoria;
import com.softII.dominio.Cliente;
import com.softII.dominio.Disponibilidad;
import com.softII.dominio.EstadoArticulo;
import com.softII.dominio.EstadoValidez;
import com.softII.dominio.Formato;
import com.softII.dominio.TipoTransaccion;
import com.softII.vista.GestionArticulos;
import com.softII.vista.Modulos;

public class ControladorGestionArticulos implements ActionListener {

	private GestionArticulos vistaArticulo;
	private Articulo modeloArticulo;

	public ControladorGestionArticulos(GestionArticulos vistaArticulo) {
		super();
		this.vistaArticulo = vistaArticulo;
		this.modeloArticulo = new Articulo();
	}

	public void iniciarVista() {
		llenarFormatos();
		llenarCategorias();
		llenarTransacciones();
		llenarEstados();
		vistaArticulo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		vistaArticulo.setLocationRelativeTo(null);
		vistaArticulo.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		String comando = e.getActionCommand();

		Articulo articulo;

		if ("Buscar".contentEquals(comando)) {

			modeloArticulo.setReferencia(vistaArticulo.getReferenciaText().getText());

			modeloArticulo = modeloArticulo.buscar();

			if (modeloArticulo != null) {
				inactivarJText();
				cargarDatos(modeloArticulo);
				vistaArticulo.getEditar().setEnabled(true);
			} else {
				vistaArticulo.mostrarMensajeDialogo("No existe un Articulo con esta identificación");
			}

		} else if ("Agregar".contentEquals(comando)) {

			limpiarListas();
			limpiarJText();
			activarJText();
			vistaArticulo.getGuardarBoton().setActionCommand("Guardar");
			vistaArticulo.getGuardarBoton().setEnabled(true);

		} else if ("Editar".contentEquals(comando)) {

			activarJText();
			vistaArticulo.getGuardarBoton().setActionCommand("EditarReal");
			vistaArticulo.getEditar().setEnabled(false);
			vistaArticulo.getGuardarBoton().setEnabled(true);

		} else if ("EditarReal".contentEquals(comando)) {

			if (validarItems() == true) {

				List<Categoria> categorias = vistaArticulo.getListCategoria();

				EstadoArticulo estadoArticulo = new EstadoArticulo();
				estadoArticulo.setIdEstado(vistaArticulo.getEstadoBox().getSelectedIndex() + 1);

				Formato formato = new Formato();
				String val = (vistaArticulo.getFormatoBox().getSelectedIndex() + 1) + "";
				formato.setIdFormato(Long.parseLong(val));

				TipoTransaccion tipoTransaccion = new TipoTransaccion();
				tipoTransaccion.setIdTipoTransaccion(vistaArticulo.getTransaccionBox().getSelectedIndex() + 1);

				modeloArticulo.setAutor(vistaArticulo.getAutorText().getText());
				modeloArticulo.setPrecio(Long.valueOf(vistaArticulo.getPrecioText().getText()));
				modeloArticulo.setReferencia(vistaArticulo.getReferenciaText().getText());
				modeloArticulo.setTitulo(vistaArticulo.getTituloText().getText());
				modeloArticulo.setCategorias(categorias);
				modeloArticulo.setEstado(estadoArticulo);
				modeloArticulo.setFormato(formato);
				modeloArticulo.setTipoTransaccion(tipoTransaccion);
				modeloArticulo.setDisponibilidad(new Disponibilidad().obtenerDisponible());

				if (modeloArticulo.actualizar() == true) {

					vistaArticulo.mostrarMensajeDialogo("El Articulo ha sido modificado con exito");
					inactivarJText();
					vistaArticulo.getAgregar().setEnabled(true);
					vistaArticulo.getEditar().setEnabled(true);
					vistaArticulo.getBuscar().setEnabled(true);
				} else {

					vistaArticulo.mostrarMensajeDialogo("No se logró modificar el Articulo");
				}
			} else {
				vistaArticulo.mostrarMensajeDialogo("Ingrese todos los datos del Articulo");
			}

		} else if ("Guardar".contentEquals(comando)) {

			if (validarItems() == true) {

				List<Categoria> categorias = vistaArticulo.getListCategoria();

				EstadoArticulo estadoArticulo = new EstadoArticulo();
				estadoArticulo.setIdEstado(vistaArticulo.getEstadoBox().getSelectedIndex() + 1);

				Formato formato = new Formato();
				String val = (vistaArticulo.getFormatoBox().getSelectedIndex() + 1) + "";
				formato.setIdFormato(Long.parseLong(val));

				TipoTransaccion tipoTransaccion = new TipoTransaccion();
				tipoTransaccion.setIdTipoTransaccion(vistaArticulo.getTransaccionBox().getSelectedIndex() + 1);

				modeloArticulo.setAutor(vistaArticulo.getAutorText().getText());
				modeloArticulo.setPrecio(Long.valueOf(vistaArticulo.getPrecioText().getText()));
				modeloArticulo.setReferencia(vistaArticulo.getReferenciaText().getText());
				modeloArticulo.setTitulo(vistaArticulo.getTituloText().getText());
				modeloArticulo.setCategorias(categorias);
				modeloArticulo.setEstado(estadoArticulo);
				modeloArticulo.setFormato(formato);
				modeloArticulo.setTipoTransaccion(tipoTransaccion);
				modeloArticulo.setDisponibilidad(new Disponibilidad().obtenerDisponible());

				if (modeloArticulo.actualizar() == true) {

					vistaArticulo.mostrarMensajeDialogo("El Articulo ha sido creado con exito");
					inactivarJText();
					vistaArticulo.getAgregar().setEnabled(true);
					vistaArticulo.getEditar().setEnabled(true);
					vistaArticulo.getBuscar().setEnabled(true);
				} else {

					vistaArticulo.mostrarMensajeDialogo("No se logró crear el Articulo");
				}
			} else {
				vistaArticulo.mostrarMensajeDialogo("Ingrese todos los datos del Articulo");
			}

		} else if ("Cancelar".contentEquals(comando)) {

			vistaArticulo.setVisible(false);

		} else if ("AgregarCat".contentEquals(comando)) {

			System.out.println("Agregar Categoria");

			Categoria categoria = new Categoria();
			categoria.setIdCategoria(vistaArticulo.getCategoriaox().getSelectedIndex() + 1);
			categoria = categoria.buscar();

			try {
				vistaArticulo.getListCategoria().add(categoria);
				vistaArticulo.getModeloLista().addElement(categoria.getNombreCategoria());
			} catch (Exception e2) {
				// TODO: handle exception
			}

			/*
			 * Vector model = new Vector();
			 * 
			 * model.addElement(new Item(categoria.getIdCategoria(),
			 * categoria.getNombreCategoria()));
			 * vistaArticulo.getCategoriaList().setModel(new DefaultComboBoxModel(model));
			 */

		} else if ("EliminarCat".contentEquals(comando)) {

			int index = vistaArticulo.getCategoriaList().getSelectedIndex();

			try {
				vistaArticulo.getModeloLista().removeElementAt(index);
				vistaArticulo.getListCategoria().remove(index);
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	public void cargarDatos(Articulo articulo) {

		vistaArticulo.getReferenciaText().setText(articulo.getReferencia());
		vistaArticulo.getTituloText().setText(articulo.getTitulo());
		vistaArticulo.getAutorText().setText(articulo.getAutor());
		vistaArticulo.getPrecioText().setText(articulo.getPrecio() + "");

		limpiarListas();

		List<Categoria> categorias = articulo.getCategorias();

		for (Categoria categoriasN : categorias) {
			vistaArticulo.getListCategoria().add(categoriasN);
			vistaArticulo.getModeloLista().addElement(categoriasN.getNombreCategoria());
		}

	}

	public void activarJText() {
		vistaArticulo.getTituloText().setEnabled(true);
		vistaArticulo.getAutorText().setEnabled(true);
		vistaArticulo.getFormatoBox().setEnabled(true);
		vistaArticulo.getCategoriaox().setEnabled(true);
		vistaArticulo.getAgregarCat().setEnabled(true);
		vistaArticulo.getEliminarCat().setEnabled(true);
		vistaArticulo.getPrecioText().setEnabled(true);
		vistaArticulo.getTransaccionBox().setEnabled(true);
		vistaArticulo.getEstadoBox().setEnabled(true);
		vistaArticulo.getDisponibleBox().setEnabled(true);
		vistaArticulo.getCategoriaList().setEnabled(true);
	}

	public void inactivarJText() {
		vistaArticulo.getTituloText().setEnabled(false);
		vistaArticulo.getAutorText().setEnabled(false);
		vistaArticulo.getFormatoBox().setEnabled(false);
		vistaArticulo.getCategoriaox().setEnabled(false);
		vistaArticulo.getAgregarCat().setEnabled(false);
		vistaArticulo.getEliminarCat().setEnabled(false);
		vistaArticulo.getPrecioText().setEnabled(false);
		vistaArticulo.getTransaccionBox().setEnabled(false);
		vistaArticulo.getEstadoBox().setEnabled(false);
		vistaArticulo.getDisponibleBox().setEnabled(false);
		vistaArticulo.getGuardarBoton().setEnabled(false);
		vistaArticulo.getCategoriaList().setEnabled(false);
	}

	public void limpiarJText() {

		vistaArticulo.getReferenciaText().setText("");
		vistaArticulo.getTituloText().setText("");
		vistaArticulo.getAutorText().setText("");

		vistaArticulo.getPrecioText().setText("");
	}

	public boolean validarItems() {

		if (vistaArticulo.getReferenciaText().getText().equals("") || vistaArticulo.getTituloText().getText().equals("")
				|| vistaArticulo.getAutorText().getText().equals("")
				|| vistaArticulo.getPrecioText().getText().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	private void llenarEstados() {

		EstadoArticulo estadoArticulo = new EstadoArticulo();
		List<EstadoArticulo> estadosArticulo = estadoArticulo.obtenerEstadosArticulo();

		Vector model = new Vector();

		for (EstadoArticulo estadosArticuloN : estadosArticulo) {
			model.addElement(new Item(estadosArticuloN.getIdEstado(), estadosArticuloN.getDescripcion()));
		}
		vistaArticulo.getEstadoBox().setModel(new DefaultComboBoxModel(model));
	}

	private void llenarTransacciones() {

		TipoTransaccion tipoTransaccion = new TipoTransaccion();
		List<TipoTransaccion> tipoTransacciones = tipoTransaccion.obtenerTiposTransaccion();

		Vector model = new Vector();

		for (TipoTransaccion tipoTransaccionN : tipoTransacciones) {
			model.addElement(new Item(tipoTransaccionN.getIdTipoTransaccion(), tipoTransaccionN.getDescripcion()));
		}
		vistaArticulo.getTransaccionBox().setModel(new DefaultComboBoxModel(model));
	}

	private void llenarCategorias() {

		Categoria categoria = new Categoria();
		List<Categoria> categorias = categoria.obtenerCategorias();

		Vector model = new Vector();

		for (Categoria categoriaN : categorias) {
			model.addElement(new Item(categoriaN.getIdCategoria(), categoriaN.getNombreCategoria()));
		}
		vistaArticulo.getCategoriaox().setModel(new DefaultComboBoxModel(model));
	}

	private void llenarFormatos() {
		Formato formato = new Formato();
		List<Formato> formatos = formato.obtenerFormatos();

		Vector model = new Vector();

		for (Formato formatoN : formatos) {
			model.addElement(new Item(Math.toIntExact(formatoN.getIdFormato()), formatoN.getNombreFormato()));
		}
		vistaArticulo.getFormatoBox().setModel(new DefaultComboBoxModel(model));
	}

	public void limpiarListas() {

		vistaArticulo.getListCategoria().clear();

		vistaArticulo.getModeloLista().clear();

	}

}
