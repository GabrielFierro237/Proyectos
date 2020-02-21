
package vista;

import conexion.conexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class control_facturas extends javax.swing.JInternalFrame {
    PreparedStatement ps;
    ResultSet rs;
    conexionJDBC cc = new conexionJDBC();
    Connection con = cc.getConnection();
    public control_facturas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Factura", "Cedula", "ID Producto", "Nombre del cliente", "Telefono", "Direccion", "Nombre Producto", "Precio ", "Cantidad Vendida", "Total Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_datos);

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Ventas Realizadas");

        btn_volver.setText("CERRAR");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del cliente:");

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("*Si no escribe ningun valor cargara toda la tabla*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(324, 324, 324)
                        .addComponent(btn_volver)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpiar)
                        .addGap(427, 427, 427))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(1, 1, 1)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_limpiar))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        mostrar(txt_buscar.getText());
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tbl_datos.getSelectedRow();
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        String cod="";
        cod=tbl_datos.getValueAt(fila, 0).toString();
        try {
            ps=con.prepareStatement("DELETE FROM `proyecto`.`factura` WHERE `ID_FACTURA`="+cod);
            int elim = ps.executeUpdate();
            if(elim>0){
                JOptionPane.showMessageDialog(null, "Dato eliminado");
                modelo.removeRow(fila);
            }else{
                JOptionPane.showMessageDialog(null, "no selecciono ninguna fila");
            }
        } catch (SQLException ex) {
            Logger.getLogger(controlproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    public void mostrar(String valor){
        DefaultTableModel modelo=(DefaultTableModel) tbl_datos.getModel();
        
        String sql = "";
        if(valor.equals("")){
                sql="SELECT * FROM  proyecto.factura";
        }else{
            sql = "SELECT * FROM proyecto.factura WHERE NOMBRES='"+valor+"'";
        }
        Object [] fila = new Object [10];
        try {
        Statement st = con.createStatement();
        rs=st.executeQuery(sql);
        
        while(rs.next()){
            fila [0]= rs.getString(1) ;
            fila [1]= rs.getString(2) ;
            fila [2]= rs.getString(3);
            fila [3]= rs.getString(4); 
            fila [4]= rs.getString(5);
            fila [5]= rs.getString(6);
            fila [6]= rs.getString(7);
            fila [7]= rs.getString(8);
            fila [8]= rs.getString(9);
            fila [9]= rs.getString(10);
            modelo.addRow(fila);
        }
    } catch (SQLException ex) {
        Logger.getLogger(controlproducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
