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
    
    final String url = "jdbc:mysql://127.0.0.1/";
    final String dbName = "proxecto_DAW2";
    final String dbUser = "root";
    final String dbPass = "";

    public conexion() throws SQLException {
        
        cn = DriverManager.getConnection(this.url+this.dbName,dbUser,dbPass);
        
    }

    public Connection getCn() {
        return cn;
    }
    
    
    
}
