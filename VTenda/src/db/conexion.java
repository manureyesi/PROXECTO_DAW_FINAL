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
    
    final String url = "jdbc:mysql://beta.fiandeira.es:8082/";
    final String dbName = "proxecto_DAW2";
    final String dbUser = "proxecto";
    final String dbPass = "abc123.";

    public conexion() throws SQLException {
        
        cn = DriverManager.getConnection(this.url+this.dbName,dbUser,dbPass);
        
    }

    public Connection getCn() {
        return cn;
    }
    
    
    
}
