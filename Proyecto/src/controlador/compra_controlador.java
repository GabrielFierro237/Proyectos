
package controlador;

import conexion.conexionJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.factura;

public class compra_controlador {
    PreparedStatement ps;
    ResultSet rs;
    conexionJDBC Stringconexion = new conexionJDBC();
    
    public void ingresarconfirmacion(factura nuevafactura){
        String sqlinsert="INSERT INTO `proyecto`.`factura`(`ID_PERSONA`,`ID_PRODUCTO`,`NOMBRES`,`TELEFONO`,`DIRECCION`,`NOMBRE_P`,`PRECIO_P`,`CANTIDAD_P`,`TOTAL`) VALUES (?,?,?,?,?,?,?,?,?);";
        try {
            ps=Stringconexion.getConnection().prepareStatement(sqlinsert);
            ps.setInt(1, nuevafactura.getID_PERSONA());
            ps.setInt(2, nuevafactura.getID_PRODUCTO());
            ps.setString(3, nuevafactura.getNOMBRES());
            ps.setInt(4, nuevafactura.getTELEFONO());
            ps.setString(5, nuevafactura.getDIRECCION());
            ps.setString(6, nuevafactura.getNOMBRE_P());
            ps.setInt(7, nuevafactura.getPRECIO_P());
            ps.setInt(8, nuevafactura.getCANTIDAD_P());
            ps.setInt(9, nuevafactura.getTOTAL());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Compra Realizada con Exito!");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane.showMessageDialog(null, "Error al realizar la compra");
        }
    }
    
}
