/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;

/**
 *
 * @author jesim
 */
public class EquipoMiembrosData {
    private Connection con;
    
     public EquipoMiembrosData() {
        con = Conexion.getConexion();
    }
}
