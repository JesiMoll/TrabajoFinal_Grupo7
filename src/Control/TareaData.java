package Control;

import java.sql.Connection;

/*
 * @author Grupo7
 */
public class TareaData {
    private Connection con;
    
     public TareaData() {
        con = Conexion.getConexion();
    }
   
    
}
