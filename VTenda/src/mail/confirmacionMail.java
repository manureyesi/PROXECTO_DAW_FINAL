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
            
            em.enviarGMail("<h1 style='color: #620062; text-align: center;'>VTenda</h1>Para finalizar el rexistro pulse en <a href='https://pruebas.fiandeira.es/verificar.php?mail=" + rs.getString("mail") + "&user=" + rs.getString("usuario") + "&cod=" + rs.getInt("cod") + "'>Activar la Cuenta</a> .</br>"
                + "En caso de no haber echo este registro envie un mensaje a admin@fiandeira.es.</br></br><img class='logo' style='text-align: center; ' title='Logo Fiandeira' alt='Fiandeira' src='https://pruebas.fiandeira.es/img/logos/logo_fiandeira.png\'>", "Confirmacion VTenda", rs.getString("mail"));
            
        }
        
        
    }
    
}
