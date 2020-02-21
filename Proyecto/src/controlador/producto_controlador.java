
package controlador;

import conexion.conexionJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.producto;

public class producto_controlador {
    PreparedStatement ps;
    ResultSet rs;
    conexionJDBC Stringconexion = new conexionJDBC();
    
    public void insertarProductos(producto nuevoproducto){
        String sqlinsert="INSERT INTO `proyecto`.`producto` (`ID_PRODUCTO`,`NOMBRE_P`,`PRECIO_P`,`DESCRIPCION_P`,`CANTIDAD_P`) values (?,?,?,?,?)";
        try {
            ps=Stringconexion.getConnection().prepareStatement(sqlinsert);
            ps.setInt(1, nuevoproducto.getID_PRODUCTO());
            ps.setString(2, nuevoproducto.getNOMBRE_P());
            ps.setInt(3, nuevoproducto.getPRECIO_P());  
            ps.setString(4, nuevoproducto.getDESCRIPCION_P());
            ps.setInt(5, nuevoproducto.getCANTIDAD_P());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane.showMessageDialog(null, "Error al ingresar datos");
        }
        
    }
//    public void eliminarProductos(String eliminarproducto){
//        String sqldelete="DELETE FROM `baseproyecto`.`producto` WHERE `ID_PRODUCTO`=?";
//        try {
//            ps=Stringconexion.getConnection().prepareStatement(sqldelete);
//            ps.setString(1, eliminarproducto);
//            ps.executeUpdate(); 
//            
//        } catch (SQLException ex) {
//            System.err.println("error: " + ex);
//            JOptionPane.showMessageDialog(null, "Error al eliminar datos");
//        }
//    }
}
