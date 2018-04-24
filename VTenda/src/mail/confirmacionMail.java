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
            
            em.enviarGMail("Para finalizar el rexistro pulse en el siguiente enlace https://beta.fiandeira.es/proxectos/proxecto_DAW2/verificar.php?mail=" + rs.getString("mail") + "&user=" + rs.getString("usuario") + "&cod=" + rs.getInt("cod") + " ."
                + "En caso de no haber echo este registro envie un mensaje a admin@fiandeira.es.", "Confirmacion VTenda", rs.getString("mail"));
            
        }
        
        
    }
    
}
