/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author manu
 */
public class conexion {
    
    Connection cn = null;
    
    /* Parametros de Conexion a Base de Datos */
    final String dbdir = "localhost";
    final String dbName = "Fiandeira";
    final String dbUser = "root";
    final String dbPass = "";
    
    /* Conexion Segura por MySQL */
    final String urlssl = "jdbc:mysql://"+dbdir+"/"+dbName+"?verifyServerCertificate=false"+"&useSSL=true"+"&requireSSL=true";
    
    /* Conexion MySQL */
    final String url = "jdbc:mysql://"+dbdir+"/"+dbName;

    public conexion() throws SQLException {
        
        cn = DriverManager.getConnection(url,dbUser,dbPass);
        
    }

    public Connection getCn() {
        return cn;
    }
    
}
