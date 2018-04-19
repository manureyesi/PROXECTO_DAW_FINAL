/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vtenda.Encriptar;

/**
 *
 * @author 6001110
 */
public class consultas {
    
    
    
    public int consultaUser(String usuario, String contrasena) throws SQLException{
        
        db.conexion con= new db.conexion();
        
        /*Consulta de usuario*/
        PreparedStatement consultarUsuario= con.getCn().prepareStatement("SELECT * FROM usuarios where usuario = ?");

        consultarUsuario.setString(1, usuario);

        ResultSet rs = consultarUsuario.executeQuery();

        Encriptar nc = new Encriptar(contrasena);

        String contra = nc.getCifer();
        
        int errorCode = 0;
        
        while(rs.next()){
        
            if(rs.getString("usuario") == usuario){
                
                if(rs.getString("contrasena")== contrasena){
                    
                    errorCode = 1;
                
                }
                else{
                    
                    errorCode = 2;
                    
                }
                
                
            }
        
        }
        
        
        return errorCode;
        
    }
    
    
    
}
