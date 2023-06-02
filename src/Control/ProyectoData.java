
package Control;

import java.sql.Connection;

/*
 * @author Grupo 7
 */
public class ProyectoData {
   private Connection con;

    public ProyectoData() {
        con = Conexion.getConexion();
    }
   
   
   
}
