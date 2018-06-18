/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MANU
 */
public class confirmacionMail {
    
    public String user;

    public confirmacionMail() {
    }

    public confirmacionMail(String user) {
        this.user = user;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    public void enviaMail() throws SQLException{
        
        db.consultas con = new db.consultas();
        
        ResultSet rs = con.select("usuarios", "usuario = '"+this.user+"'");
        
        mail.envioMail em = new mail.envioMail();
        
        while(rs.next()){
            
            em.enviarGMail("<h1 style='color: #620062; text-align: center;'>VTenda</h1>Para finalizar el rexistro pulse en <a href='https://fiandeira.gal/verificar.php?mail=" + rs.getString("mail") + "&user=" + rs.getString("usuario") + "&cod=" + rs.getInt("cod") + "'>Activar la Cuenta</a> .</br>"
                + "En caso de no haber echo este registro envie un mensaje a admin@fiandeira.es.</br></br><img class='logo' style='text-align: center; ' title='Logo Fiandeira' alt='Fiandeira' src='https://pruebas.fiandeira.es/img/logos/logo_fiandeira.png'>", "Confirmacion VTenda", rs.getString("mail"));
            
        }
        
    }
    
    public void enviaMailRecuperacion() throws SQLException{
        
        db.consultas con = new db.consultas();
        
        /* Buscar Usuarios */
        ResultSet rs = con.select("usuarios", "usuario = '"+this.user+"'");
        
        /* Crear Contraseña */
        int n = 65;
        int m = 90;
        
        String contrasena = "";
        
        for(int i = 0; i < 10; i++){
                        
            if(((int)(Math.random()*2)) == 0){
                contrasena += (int)(Math.random()*9+1);
            }
            else{
                contrasena += (char)((int)(Math.random()*(m-n+1)+n));     
            }
            
        }
        
        vtenda.Encriptar en = new vtenda.Encriptar(contrasena);
        
        con.update("usuarios", "contrasena = '"+en.getCifer()+"'", "usuario = '"+user+"'");
        
        mail.envioMail em = new mail.envioMail();
        
        while(rs.next()){
            
            em.enviarGMail("<body style='background-color: #FFFFFF; text-align: center; font-family: Tahoma;'>\n" +
            "\n" +
            "        <img style='text-align: center;width: 80%;' class='logo' title='Logo Fiandeira' alt='Fiandeira' src='https://pruebas.fiandeira.es/img/logos/logo_fiandeira.png'>\n" +
            "\n" +
            "        <p style='text-align: justify;width: 90%;margin-left: 5%;margin-right: 5%;' class='texto'>Este es un correo autogenerado, por lo que no tiene que responder.</p>\n" +
            "        <p style='text-align: justify;width: 90%;margin-left: 5%;margin-right: 5%;'>Su contraseña es:</p>\n" +
            "\n" +
            "        <div style='background-color: #620062;height: 50px;width: 90%;margin-left: 5%;margin-right: 5%;box-shadow: 5px 6px rgba(0,0,0,0.5);' class='contenedor'>\n" +
            "\n" +
            "            <span style='display: block;color: white;font-size: 20px;padding: 0 auto;padding-top: 10px;' class='contrasena'>"+contrasena+"</span>\n" +
            "\n" +
            "        </div>\n" +
            "\n" +
            "        <span id='copy' style='display: block;margin-top: 50px;text-align: left;margin-left: 5%;margin-right: 5%;width: 90%;height: 25px;border-top: 1px solid #620062'>\n" +
            "            <img style='padding-right: 10px;width: 18px;' src='https://cdn.pixabay.com/photo/2016/06/26/23/32/copyright-1481585_960_720.png' alt='Copyright'>\n" +
            "            <a style='text-decoration: none;font-size: 20px;width: 100px;color: #620062' href='#'>FIANDEIRA 2011 - 2018</a>\n" +
            "        </span>\n" +
            "\n" +
            "    </body>", "Recuperación Contraseña VTenda", rs.getString("mail"));
            
        }
        
    }
    
}
