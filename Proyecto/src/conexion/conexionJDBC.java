
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexionJDBC {
    public static java.sql.Connection conn;
    
    private static final String USER = "root";
    private static final String PASSWORD = "Dinosaurio_123";
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto?allowPublicKeyRetrieval=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private static final String CLASS_DRIVER = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() {
        try {
            Class.forName(CLASS_DRIVER).newInstance();
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Se conecto");
        } catch (Exception ex) {
            System.out.println(conexionJDBC.class.getName() + " Error al abrir la conexion");
            ex.printStackTrace();
        }
        return conn;
    }        
}
