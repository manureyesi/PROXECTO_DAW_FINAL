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
    
    final String dbdir = "xxxxxxxxxxxx/";
    final String dbName = "xxxxxxxxxx";
    final String dbUser = "xxxxxxxxx";
    final String dbPass = "xxxxxxxxxx";
    
    final String urlssl = "jdbc:mysql://"+dbdir+""+dbName+"?verifyServerCertificate=true"+"&useSSL=true"+"&requireSSL=true";
    final String url = "jdbc:mysql://"+dbdir+""+dbName;

    public conexion() throws SQLException {
        
        try{
            cn = DriverManager.getConnection(urlssl,dbUser,dbPass);
        }
        catch(SQLException ex){
            System.err.println("Error al conectarse por SSL");
        }
        finally{
            try{
                cn = DriverManager.getConnection(url,dbUser,dbPass);
            }
            catch(SQLException ex){
                System.err.println("Error al conectarse");
            }
        }
                
    }

    public Connection getCn() {
        return cn;
    }
    
}
