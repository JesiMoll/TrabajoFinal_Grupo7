/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;

/**
 * @author Grupo 7
 */
public class CommentarioData {
    private Connection con;
    
     public CommentarioData() {
        con = Conexion.getConexion();
    }
}
