
package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @Grupo 7
 */

public class Conexion {
    
    private static final String DATABASE_URL = "jdbc:mariadb://";
    private static final String DATABASE_HOST = "localhost:3306";//Colocar el puerto que usa.
    private static final String DATABASE_DB = "/tpfinal_basedatos_grupo7";
    private static final String DATABASE_USUARIO = "root";
    private static final String DATABASE_PASSWORD = "";
    private static Conexion conexion = null;
    
    private Conexion() {
        try {
            //Cargar drivers
            Class.forName("org.mariadb.jdbc.Driver");
            
        } catch ( ClassNotFoundException ex ) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver" + ex);
        }
    }

    public static Connection getConexion() {
        Connection con = null;
        
        if ( conexion == null ) {
            conexion = new Conexion();
        }
        
        try {
            // Setup the connection with the DB
            con = DriverManager.getConnection(
                    DATABASE_URL + 
                    DATABASE_HOST + 
                    DATABASE_DB + 
                    "?useLegacyDatetimeCode=false&serverTimezone=UTC" + 
                    "&user=" + 
                    DATABASE_USUARIO + 
                    "&password=" + 
                    DATABASE_PASSWORD
            );
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion." + ex.getMessage());
        }
        
        return con;
    }
    
}
