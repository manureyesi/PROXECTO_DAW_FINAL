/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MANU
 */
public class consultas {
    
    public ResultSet select(String tabla, String cadena) throws SQLException{
            
        db.conexion con= new db.conexion();
            
        /* Select */
        PreparedStatement consulta= con.getCn().prepareStatement("SELECT * FROM "+ tabla +" where "+cadena);

        ResultSet rs = consulta.executeQuery();
            
        return rs;
        
    }
    
    
    public void insert(String tabla, String campos, String cadena) throws SQLException{
        
        db.conexion con= new db.conexion();
            
        /* Insert */
        PreparedStatement insert = con.getCn().prepareStatement("INSERT INTO "+ tabla +"("+campos+") VALUES ("+cadena+")");

        insert.executeUpdate();
            
    }
    
    public void update(String tabla, String campos, String cadena) throws SQLException{
        
        db.conexion con= new db.conexion();
            
        /* Insert */
        PreparedStatement insert = con.getCn().prepareStatement("UPDATE "+ tabla +" SET "+campos+" WHERE "+cadena+")");

        insert.executeUpdate();
            
    }
    
}
