/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import datos.BaseDatos;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import pojos.CategoriaProd;
import pojos.Producto;
import pojos.Proveedor;

/**
 *
 * @author Bryan
 */
public class ProductoFrame extends javax.swing.JDialog {

    /**
     * Creates new form ProductoFrame
     */
    DefaultComboBoxModel<CategoriaProd> modeloCategorias;
    DefaultComboBoxModel<Proveedor> modeloProveedor;
    BaseDatos base;
    boolean estaActualizando;
    String informacion = "";

    public ProductoFrame(java.awt.Frame parent, boolean modal, Producto producto, ImageIcon icon, String titulo, boolean actualizando) {
        super(parent, modal);
        modeloCategorias = new DefaultComboBoxModel<CategoriaProd>();
        modeloProveedor = new DefaultComboBoxModel<Proveedor>();
        base = new BaseDatos();
        cargarModeloCat();
        cargarModeloProv();
        initComponents();
        this.estaActualizando = actualizando;
        this.setTitle(titulo);
        if (producto != null) {
            cargarProducto(producto, icon);
        }

    }

    private void cargarProducto(Producto producto, ImageIcon icono) {
        lblImagenArticulo.setIcon(icono);
        String clave = producto.getIdProducto();
        String nombre = producto.getNomProducto();
        String descripcion = producto.getDescProducto();
        double stockRequerido = producto.getStockProducto();
        String unidad = producto.getUnidadProducto();
        double precioCompra = producto.getPrecioCompraProducto();
        double precioVenta = producto.getPrecioVentaProdcuto();

        campoClave.setText(clave);
        campoNombre.setText(nombre);
        campoDesc.setText(descripcion);
        campoStock.setText(stockRequerido + "");
        comboUnidades.setSelectedItem(unidad);
        campoPrecioCompra.setText(precioCompra+"");
        campoPrecioVenta.setText(precioVenta+"");

        campoClave.setEnabled(false);
    }

    private void cargarModeloCat() {
        ArrayList<CategoriaProd> listaCategorias;
        listaCategorias = base.obtenerCategorias();

        for (CategoriaProd categoria : listaCategorias) {
            modeloCategorias.addElement(categoria);
        }

    }

    private void cargarModeloProv() {
        ArrayList<Proveedor> listaProveedores;
        listaProveedores = base.obtenerProveedores();

        for (Proveedor proveedor : listaProveedores) {
            modeloProveedor.addElement(proveedor);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDesc = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboCategorias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboUnidades = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoPrecioCompra = new javax.swing.JTextField();
        campoPrecioVenta = new javax.swing.JTextField();
        btnGuardarProducto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblImagenArticulo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NUEVO PRODUCTO");

        jLabel1.setText("Clave:");

        campoDesc.setColumns(20);
        campoDesc.setRows(5);
        jScrollPane1.setViewportView(campoDesc);

        jLabel2.setText("Descripción:");

        jLabel3.setText("Stock requerido:");

        jLabel4.setText("Categoria:");

        comboCategorias.setModel(modeloCategorias);

        jButton1.setText("Nueva Categoria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Unidad de medida:");

        comboUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastilla", "Par de pastillas", "1/2 Blister", "Blister", "1/2 Caja", "Caja", "Frasco", "Unidad", "Tubo", "Gotero" }));

        jLabel6.setText("Precio de Compra:");

        jLabel7.setText("Precio de Venta:");

        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lblImagenArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagenArticuloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenArticulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel9.setText("Proveedor:");

        comboProveedores.setModel(modeloProveedor);

        jLabel8.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(campoClave, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(campoNombre))
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboUnidades, javax.swing.GroupLayout.Alignment.LEADING, 0, 133, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoStock, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campoPrecioCompra, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboCategorias, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoPrecioVenta)))))
                            .addComponent(jLabel9)
                            .addComponent(comboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(comboCategorias)
                    .addComponent(campoClave)
                    .addComponent(campoStock))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNombre)
                                    .addComponent(comboUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)))
                            .addComponent(campoPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File imgArticleFile;
    private void lblImagenArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenArticuloMousePressed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen jpg", "jpg");
        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            int anchoImagen = lblImagenArticulo.getWidth();
            int altoImagen = lblImagenArticulo.getHeight();

            imgArticleFile = chooser.getSelectedFile();
            ImageIcon icono = new ImageIcon(imgArticleFile.getAbsolutePath());
            Image imagen = icono.getImage();
            imagen.getScaledInstance(anchoImagen, altoImagen, Image.SCALE_DEFAULT);

            ImageIcon iconoRedimensionado = new ImageIcon(imagen);
            lblImagenArticulo.setIcon(iconoRedimensionado);
        }


    }//GEN-LAST:event_lblImagenArticuloMousePressed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        String codigo = campoClave.getText();
        String nombre = campoNombre.getText();
        String descripcion = campoDesc.getText();
        double stock = Double.parseDouble(campoStock.getText());
        double precioCompra = Double.parseDouble(campoPrecioCompra.getText());
        double precioVenta = Double.parseDouble(campoPrecioVenta.getText());
        String unidad = comboUnidades.getSelectedItem().toString();
        CategoriaProd categoria = (CategoriaProd) comboCategorias.getSelectedItem();
        Proveedor proveedor = (Proveedor) comboProveedores.getSelectedItem();
        

        if (estaActualizando) {
            if (imgArticleFile == null) {
                Producto producto = new Producto(codigo, nombre, descripcion, stock, null, unidad, precioCompra, precioVenta, 0.0, categoria.getIdCategoria(), proveedor.getIdProveedor());
                base.actualizarProducto(producto, false);
            } else {
                Producto producto = new Producto(codigo, nombre, descripcion, stock, imgArticleFile, unidad, precioCompra, precioVenta, 0.0, categoria.getIdCategoria(), proveedor.getIdProveedor());
                base.actualizarProducto(producto, true);
            }

            JOptionPane.showMessageDialog(this, "Se ha guardado el producto");
            this.dispose();
            informacion = "1";

            if (imgArticleFile == null) { 
                
            } else {

                Producto producto = new Producto(codigo, nombre, descripcion, stock, imgArticleFile, unidad, precioCompra, precioVenta, 0.0, categoria.getIdCategoria(), proveedor.getIdProveedor());

                base.insertarProducto(producto);
                JOptionPane.showMessageDialog(this, "Se ha guardado el producto");
                this.dispose();
            }

        } else {
            if(imgArticleFile == null){
                JOptionPane.showMessageDialog(this, "No ha ingresado una imagen");
            }else{
                Producto producto = new Producto(codigo, nombre, descripcion, stock, imgArticleFile, unidad, precioCompra, precioVenta, 0.0, categoria.getIdCategoria(), proveedor.getIdProveedor());

                base.insertarProducto(producto);
                JOptionPane.showMessageDialog(this, "Se ha guardado el producto");
                this.dispose(); 
                
            }
            
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    public String getInformacion(){
        return this.informacion;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CategoriaFrame categoria = new CategoriaFrame(null, true);
        categoria.setVisible(true);
        categoria.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        categoria.setLocation(600, 150);
        categoria.setAlwaysOnTop(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductoFrame dialog = new ProductoFrame(new javax.swing.JFrame(), true, null, null, "Titulo", false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextArea campoDesc;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPrecioCompra;
    private javax.swing.JTextField campoPrecioVenta;
    private javax.swing.JTextField campoStock;
    private javax.swing.JComboBox<CategoriaProd> comboCategorias;
    private javax.swing.JComboBox<Proveedor> comboProveedores;
    private javax.swing.JComboBox<String> comboUnidades;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenArticulo;
    // End of variables declaration//GEN-END:variables
}
