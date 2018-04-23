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
import vtenda.VTenda;

/**
 *
 * @author manureyesi
 */
public class buscarUser {
    
    
    public int consultaUser(String usuario, String contrasena){
        
        try{
            
            int errorCode = 0;
            
            db.conexion con= new db.conexion();

            /*Consulta de usuario*/
            PreparedStatement consultarUsuario= con.getCn().prepareStatement("SELECT * FROM usuarios where usuario = ?");

            consultarUsuario.setString(1, usuario);

            ResultSet rs = consultarUsuario.executeQuery();

            Encriptar nc = new Encriptar(contrasena);

            String contra = nc.getCifer();
            
            while(rs.next()){
                
                if(rs.getString("usuario").compareToIgnoreCase(usuario) == 0){

                    if(rs.getString("contrasena").compareTo(contra) == 0){
                        
                        if(rs.getInt("verificado") == 0){

                            errorCode = 2;

                        }
                        else{
                            
                            errorCode = 3;
                            
                            VTenda.vendedor.setNomeVendedor(rs.getString("nombre") + " " + rs.getString("apellidos"));
                            VTenda.vendedor.setNumVendedor(rs.getInt("cod"));

                            /*Consulta de Tenda*/
                            PreparedStatement consultarTienda = con.getCn().prepareStatement("SELECT * FROM `tendas` WHERE `cod` = 1");

                            ResultSet Resultienda = consultarTienda.executeQuery();

                            while(Resultienda.next()){

                                if(rs.getInt("admin") == 1){
                                    VTenda.admin = true;
                                    VTenda.nTenda.getAll(Resultienda.getInt("cod"), Resultienda.getString("nomeTenda"), Resultienda.getString("dir1"), Resultienda.getString("dir2"));
                                }

                                VTenda.nTenda.getAll(Resultienda.getInt("cod"), Resultienda.getString("nomeTenda"), Resultienda.getString("dir1"), Resultienda.getString("dir2"));

                            }

                            VTenda.usuario = rs.getString("usuario");
                            VTenda.contrasena = rs.getString("contrasena");

                            
                        }
                        
                        
                    }
                    else{
                        
                        errorCode = 1;
                        
                    }

                }

            }

            return errorCode;
        
        }
        catch(SQLException Ex){
            
            int errorCode = 4;
            return errorCode;
            
        }
         
        
    }
   
           
}
