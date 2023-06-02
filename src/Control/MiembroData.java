package Control;

import java.sql.Connection;

/*
 * @author Grupo 7
 */
public class MiembroData {
    private Connection con;
    
     public MiembroData() {
        con = Conexion.getConexion();
    }
}
