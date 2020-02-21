
package vista;

import conexion.conexionJDBC;
import controlador.compra_controlador;
import controlador.producto_controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import modelo.factura;

public class compra extends javax.swing.JInternalFrame {
    conexionJDBC cc = new conexionJDBC();
    Connection con = cc.getConnection();
    producto_controlador pro=new producto_controlador();
    compra_controlador comc=new compra_controlador();
    factura nuevafactura=new factura();
    
    PreparedStatement ps;
    ResultSet rs;
    SpinnerNumberModel nm=new SpinnerNumberModel();
    public compra() {
        initComponents();
        nm.setMinimum(0);
        panel_confirmar.setVisible(false);
        panel_factura.setVisible(false);         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        panel_confirmar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spinner_cant = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_id_compra = new javax.swing.JTextField();
        txt_nombre_compra = new javax.swing.JTextField();
        btn_el_cant = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_precio_compra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_conf_desc = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        panel_factura = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_nombrecom = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        btn_fin_compra = new javax.swing.JButton();
        btn_cancelar_compra = new javax.swing.JButton();
        txt_cedula = new javax.swing.JTextField();
        lbl_cond = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panel_tabla = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_comprar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        lbl_usuario = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("COMPRA DE PRODUCTOS");

        jButton2.setText("CERRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panel_confirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Cantidad:");

        spinner_cant.setModel(new javax.swing.SpinnerNumberModel());

        jLabel4.setText("ELIJA LA CANTIDAD A COMPRAR");

        jLabel5.setText("Codigo Referencial:");

        jLabel6.setText("Nombre del Producto:");

        txt_id_compra.setEditable(false);

        txt_nombre_compra.setEditable(false);

        btn_el_cant.setText("CONFIRMAR");
        btn_el_cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_el_cantActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio");

        txt_precio_compra.setEditable(false);

        jLabel8.setText("$");

        jLabel24.setText("Descripcion:");

        txt_conf_desc.setEditable(false);
        txt_conf_desc.setColumns(20);
        txt_conf_desc.setRows(5);
        jScrollPane2.setViewportView(txt_conf_desc);

        javax.swing.GroupLayout panel_confirmarLayout = new javax.swing.GroupLayout(panel_confirmar);
        panel_confirmar.setLayout(panel_confirmarLayout);
        panel_confirmarLayout.setHorizontalGroup(
            panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_confirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_confirmarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_el_cant)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_confirmarLayout.createSequentialGroup()
                        .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_confirmarLayout.createSequentialGroup()
                                .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nombre_compra)
                                    .addGroup(panel_confirmarLayout.createSequentialGroup()
                                        .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_id_compra, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                            .addComponent(txt_precio_compra))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panel_confirmarLayout.createSequentialGroup()
                                .addGap(0, 37, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(13, 13, 13)))
                        .addGap(39, 39, 39))))
            .addGroup(panel_confirmarLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(spinner_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_confirmarLayout.setVerticalGroup(
            panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_confirmarLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_id_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nombre_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_confirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinner_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_el_cant)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panel_factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("INGRESE SUS DATOS");

        jLabel10.setText("Cedula:");

        jLabel11.setText("Codigo Referencial:");

        jLabel13.setText("Nombre Completo:");

        jLabel14.setText("Telefono:");

        jLabel15.setText("Direccion:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Su Compra:");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel17.setText("Nombre:");

        jLabel18.setText("Cantidad:");

        jLabel20.setText("Precio:");

        jLabel19.setText("Total a Pagar:");

        btn_fin_compra.setText("COMPRAR");
        btn_fin_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fin_compraActionPerformed(evt);
            }
        });

        btn_cancelar_compra.setText("CANCELAR");
        btn_cancelar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_compraActionPerformed(evt);
            }
        });

        lbl_cond.setText("-");

        lbl_nombre.setText("-");

        lbl_cantidad.setText("-");

        lbl_precio.setText("-");

        lbl_total.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbl_total.setText("-");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("$");

        jLabel23.setText("$");

        javax.swing.GroupLayout panel_facturaLayout = new javax.swing.GroupLayout(panel_factura);
        panel_factura.setLayout(panel_facturaLayout);
        panel_facturaLayout.setHorizontalGroup(
            panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facturaLayout.createSequentialGroup()
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_facturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_nombrecom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_facturaLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_cedula))
                                    .addGroup(panel_facturaLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_facturaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_facturaLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_cond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel_facturaLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel_facturaLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panel_facturaLayout.createSequentialGroup()
                                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel16))
                                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_fin_compra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar_compra)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_facturaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(164, 164, 164))
        );
        panel_facturaLayout.setVerticalGroup(
            panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel16)
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(lbl_cond))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(lbl_nombre))
                                .addGap(11, 11, 11)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(lbl_cantidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(lbl_precio)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_facturaLayout.createSequentialGroup()
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombrecom, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_total)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_fin_compra)
                        .addComponent(btn_cancelar_compra)))
                .addContainerGap())
        );

        panel_tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Nombre del Producto:");

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_comprar.setText("COMPRAR");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("*Si no escribe ningun valor cargara toda la tabla*");

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio", "Descripcion", "Stock Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_datos);

        javax.swing.GroupLayout panel_tablaLayout = new javax.swing.GroupLayout(panel_tabla);
        panel_tabla.setLayout(panel_tablaLayout);
        panel_tablaLayout.setHorizontalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tablaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_comprar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_tablaLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_tablaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tablaLayout.setVerticalGroup(
            panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btn_comprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(panel_tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl_usuario.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(199, 199, 199)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jLabel1))
                    .addComponent(lbl_usuario))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        menu m=new menu();
        m.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        tablacomprar(txt_buscar.getText());
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        int fila = tbl_datos.getSelectedRow();
        panel_confirmar.setVisible(true);
        if(fila>=0){
            txt_id_compra.setText(tbl_datos.getValueAt(fila, 0).toString());
            txt_nombre_compra.setText(tbl_datos.getValueAt(fila, 1).toString());
            txt_precio_compra.setText(tbl_datos.getValueAt(fila, 2).toString());
            txt_conf_desc.setText(tbl_datos.getValueAt(fila, 3).toString());
            int spin= Integer.parseInt(tbl_datos.getValueAt(fila, 4).toString());  
            nm.setMaximum(spin);
            nm.setStepSize(1);
            spinner_cant.setModel(nm);
        }else{
            JOptionPane.showMessageDialog(this, "No selecciono ninguna fila");
        }
        
    }//GEN-LAST:event_btn_comprarActionPerformed

    private void btn_el_cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_el_cantActionPerformed
        int fila = tbl_datos.getSelectedRow();
        lbl_cond.setText(txt_id_compra.getText());
        lbl_nombre.setText(txt_nombre_compra.getText());
        lbl_precio.setText(txt_precio_compra.getText());
        int precio=Integer.parseInt(tbl_datos.getValueAt(fila, 2).toString());
        int c=(int) spinner_cant.getValue();
        int total=c*precio;
        String cant=String.valueOf(c);
        String tot=String.valueOf(total);
        lbl_cantidad.setText(cant); 
        lbl_total.setText(tot);
        
        panel_factura.setVisible(true);
        panel_confirmar.setVisible(true);
        panel_tabla.setVisible(true);
//        System.out.println(cant);
//        System.out.println(c+"....."+ precio);
//        System.out.println(total);
    }//GEN-LAST:event_btn_el_cantActionPerformed

    private void btn_cancelar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_compraActionPerformed
        panel_confirmar.setVisible(false);
        panel_factura.setVisible(false);
    }//GEN-LAST:event_btn_cancelar_compraActionPerformed

    private void btn_fin_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fin_compraActionPerformed
        String ced=txt_cedula.getText();
        String nom=txt_nombrecom.getText();
        String tel=txt_telefono.getText();
        String dir=txt_direccion.getText();
        if(ced.equalsIgnoreCase("") && nom.equalsIgnoreCase("") && tel.equalsIgnoreCase("") && dir.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos", "FALLIDO", JOptionPane.ERROR_MESSAGE);
        }else{
            int cedula=Integer.parseInt(txt_cedula.getText());
            int idprod=Integer.parseInt(lbl_cond.getText());
            int tele=Integer.parseInt(txt_telefono.getText());
            int precio=Integer.parseInt(lbl_precio.getText());
            int cant=Integer.parseInt(lbl_cantidad.getText());
            int total=Integer.parseInt(lbl_total.getText());
            nuevafactura.setID_PERSONA(cedula);
            nuevafactura.setID_PRODUCTO(idprod);
            nuevafactura.setNOMBRES(txt_nombrecom.getText());
            nuevafactura.setTELEFONO(tele);
            nuevafactura.setDIRECCION(txt_direccion.getText());
            nuevafactura.setNOMBRE_P(lbl_nombre.getText());
            nuevafactura.setPRECIO_P(precio);
            nuevafactura.setCANTIDAD_P(cant);
            nuevafactura.setTOTAL(total);
            comc.ingresarconfirmacion(nuevafactura);
        }
    }//GEN-LAST:event_btn_fin_compraActionPerformed

    public void tablacomprar(String valor){
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        
        String sql = "";
        if(valor.equals("")){
                sql="SELECT * FROM  proyecto.producto";
        }else{
            sql = "SELECT * FROM proyecto.producto WHERE NOMBRE_P='"+valor+"'";
        }
        Object [] fila = new Object [5];
        try {
        Statement st = con.createStatement();
        rs=st.executeQuery(sql);
        
        while(rs.next()){
            fila [0]= rs.getString(1) ;
            fila [1]= rs.getString(2) ;
            fila [2]= rs.getString(3);
            fila [3]= rs.getString(4); 
            fila [4]= rs.getString(5);
            modelo.addRow(fila);
        }
    } catch (SQLException ex) {
        Logger.getLogger(controlproducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar_compra;
    private javax.swing.JButton btn_comprar;
    private javax.swing.JButton btn_el_cant;
    private javax.swing.JButton btn_fin_compra;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JLabel lbl_cond;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_confirmar;
    private javax.swing.JPanel panel_factura;
    private javax.swing.JPanel panel_tabla;
    private javax.swing.JSpinner spinner_cant;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextArea txt_conf_desc;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_id_compra;
    private javax.swing.JTextField txt_nombre_compra;
    private javax.swing.JTextField txt_nombrecom;
    private javax.swing.JTextField txt_precio_compra;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
