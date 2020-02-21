 
package controlador;

import conexion.conexionJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.persona;
import vista.creacion_usuario;
import vista.menu;

public class persona_controlador {
    PreparedStatement ps;
    ResultSet rs;
    
    conexionJDBC Stringconexion = new conexionJDBC();
    private menu p;
    
    public void crearUsuario(persona nuevapersona){
        String sqlcrear="INSERT INTO proyecto.persona (USUARIO,CONTRASENA) VALUES (?,?);";
        try {
            ps=Stringconexion.getConnection().prepareStatement(sqlcrear);
            ps.setString(1, nuevapersona.getNombre());
            ps.setString(2, nuevapersona.getCont());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane.showMessageDialog(null, "Error al crear usuario");
        }
    } 
}
