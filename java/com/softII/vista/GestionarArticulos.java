package com.softII.vista;

import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.softII.controlador.ControladorArticuloCompra;
import com.softII.controlador.ControladorCliente;
import com.softII.controlador.ControladorGestionArticulos;

/**
 *
 * @author JuRiAnU
 */
public class GestionarArticulos extends javax.swing.JFrame {

    /**
     * Creates new form agregarArticulo
     */
	
    // Variables declaration - do not modify                     
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregarCat;
    private javax.swing.JTextField autorText;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JList categoriaList;
    private javax.swing.JComboBox categoriaox;
    private javax.swing.JTextArea descripcionArea;
    private javax.swing.JComboBox disponibleBox;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminarCat;
    private javax.swing.JComboBox estadoBox;
    private javax.swing.JComboBox formatoBox;
    private javax.swing.JButton guardarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField precioText;
    private javax.swing.JTextField referenciaText;
    private javax.swing.JTextField tituloText;
    private javax.swing.JComboBox transaccionBox;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">   
    
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tituloText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionArea = new javax.swing.JTextArea();
        referenciaText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        autorText = new javax.swing.JTextField();
        precioText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        formatoBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        categoriaox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoriaList = new javax.swing.JList();
        agregarCat = new javax.swing.JButton();
        eliminarCat = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        transaccionBox = new javax.swing.JComboBox();
        guardarBoton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        estadoBox = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        disponibleBox = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Artículo");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buscar.setText("Buscar Artículo");

        jLabel1.setText("Título");

        jLabel4.setText("Descripción");

        tituloText.setEnabled(false);

        jLabel5.setText("Precio");

        jLabel6.setText("Categoria");

        descripcionArea.setColumns(20);
        descripcionArea.setRows(5);
        descripcionArea.setEnabled(false);
        descripcionArea.setFocusable(false);
        descripcionArea.setOpaque(false);
        jScrollPane2.setViewportView(descripcionArea);

        jLabel7.setText("Autor");

        autorText.setEnabled(false);

        precioText.setEnabled(false);

        jLabel9.setText("pesos COL");

        //formatoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CD", "Pelicula", "Libro" }));
        formatoBox.setEnabled(false);

        jLabel2.setText("Referencia");

        //categoriaox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rock", "Vallenato", "Bolero" }));
        categoriaox.setEnabled(false);

        jLabel3.setText("Formato");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorías Asociadas"));
        jPanel2.setFocusable(false);
        jPanel2.setName(""); // NOI18N

        /*categoriaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Musical", "Drama", "Suspenso", "Acción" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });*/
        categoriaList.setEnabled(false);
        jScrollPane1.setViewportView(categoriaList);

        agregarCat.setText("Agregar");
        agregarCat.setEnabled(false);

        eliminarCat.setText("Eliminar");
        eliminarCat.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarCat)
                    .addComponent(eliminarCat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {agregarCat, eliminarCat});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(agregarCat)
                .addGap(16, 16, 16)
                .addComponent(eliminarCat))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {agregarCat, eliminarCat});

        jLabel10.setText("Transacción");

        //transaccionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alquilar", "Vender" }));
        transaccionBox.setEnabled(false);

        guardarBoton.setText("Guardar");
        guardarBoton.setEnabled(false);

        jLabel11.setText("Estado");

        //estadoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bueno", "Regular", "Ligero Deterioro", "Muy Deteriorado" }));
        estadoBox.setEnabled(false);

        jLabel12.setText("Disponibilidad");

        disponibleBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Disponible", "Prestado", "Vendido", "Dado de Baja" }));
        disponibleBox.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transaccionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(referenciaText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buscar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(formatoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(categoriaox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(autorText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tituloText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel9))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(disponibleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardarBoton)
                            .addGap(15, 15, 15)))
                    .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(formatoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(categoriaox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transaccionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disponibleBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(guardarBoton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {autorText, referenciaText, tituloText});

        jPanel2.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones del Menú"));

        cancelar.setText("Cancelar");

        agregar.setText("Agregar Artículo");

        editar.setText("Editar Artículo");
        editar.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editar)
                    .addComponent(agregar))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {agregar, cancelar, editar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }// </editor-fold>                        
       
    public GestionarArticulos() throws HeadlessException {
    	
		super();
	}

	public JButton getAgregar() {
        return agregar;
    }

    public void setAgregar(JButton agregar) {
        this.agregar = agregar;
    }

    public JButton getAgregarCat() {
        return agregarCat;
    }

    public void setAgregarCat(JButton agregarCat) {
        this.agregarCat = agregarCat;
    }

    public JTextField getAutorText() {
        return autorText;
    }

    public void setAutorText(JTextField autorText) {
        this.autorText = autorText;
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

    public JList getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(JList categoriaList) {
        this.categoriaList = categoriaList;
    }

    public JComboBox getCategoriaox() {
        return categoriaox;
    }

    public void setCategoriaox(JComboBox categoriaox) {
        this.categoriaox = categoriaox;
    }

    public JTextArea getDescripcionArea() {
        return descripcionArea;
    }

    public void setDescripcionArea(JTextArea descripcionArea) {
        this.descripcionArea = descripcionArea;
    }

    public JComboBox getDisponibleBox() {
        return disponibleBox;
    }

    public void setDisponibleBox(JComboBox disponibleBox) {
        this.disponibleBox = disponibleBox;
    }

    public JButton getEditar() {
        return editar;
    }

    public void setEditar(JButton editar) {
        this.editar = editar;
    }

    public JButton getEliminarCat() {
        return eliminarCat;
    }

    public void setEliminarCat(JButton eliminarCat) {
        this.eliminarCat = eliminarCat;
    }

    public JComboBox getEstadoBox() {
        return estadoBox;
    }

    public void setEstadoBox(JComboBox estadoBox) {
        this.estadoBox = estadoBox;
    }

    public JComboBox getFormatoBox() {
        return formatoBox;
    }

    public void setFormatoBox(JComboBox formatoBox) {
        this.formatoBox = formatoBox;
    }

    public JButton getGuardarBoton() {
        return guardarBoton;
    }

    public void setGuardarBoton(JButton guardarBoton) {
        this.guardarBoton = guardarBoton;
    }

    public JTextField getPrecioText() {
        return precioText;
    }

    public void setPrecioText(JTextField precioText) {
        this.precioText = precioText;
    }

    public JTextField getReferenciaText() {
        return referenciaText;
    }

    public void setReferenciaText(JTextField referenciaText) {
        this.referenciaText = referenciaText;
    }

    public JTextField getTituloText() {
        return tituloText;
    }

    public void setTituloText(JTextField tituloText) {
        this.tituloText = tituloText;
    }

    public JComboBox getTransaccionBox() {
        return transaccionBox;
    }

    public void setTransaccionBox(JComboBox transaccionBox) {
        this.transaccionBox = transaccionBox;
    }
    
    public void setControlador(ControladorGestionArticulos controlador) {
		initComponents();

    	buscar.setActionCommand("Buscar");
    	buscar.addActionListener(controlador);
    	
    	agregar.setActionCommand("Agregar");
    	agregar.addActionListener(controlador);
    	
    	editar.setActionCommand("Editar");
    	editar.addActionListener(controlador);
    	
    	guardarBoton.setActionCommand("Guardar");
    	guardarBoton.addActionListener(controlador);
    	
    	cancelar.setActionCommand("Cancelar");
    	cancelar.addActionListener(controlador);
    	
    	agregarCat.setActionCommand("AgregarCat");
    	agregarCat.addActionListener(controlador);
    	
    	eliminarCat.setActionCommand("EliminarCat");
    	eliminarCat.addActionListener(controlador);
	}
    
    public void mostrarMensajeDialogo(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}    
    
    public int mostrarMensajeConfirmacion(String mensaje, String titulo) {
		return JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
	} 
    
    public void iniciarVista() {
    	initComponents();    	
    }
}