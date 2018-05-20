/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFTP;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

/**
 *
 * @author MANU
 */
public class SFTP {
  
    private static final String user = "admin";
    private static final String host = "beta.fiandeira.es";
    private static final Integer port = 22;
    private static final String pass = "Maindon11";
    
    public void subirArchivo() throws Exception{
        
        System.out.println("------------------- INICIO");
 
        JSch jsch = new JSch();
        Session session = jsch.getSession(user, host, port);
        UserInfo ui = new SUserInfo(pass, null);
 
        session.setUserInfo(ui);
        session.setPassword(pass);
        session.connect();
 
        ChannelSftp sftp = (ChannelSftp)session.openChannel("sftp");
        sftp.connect();
 
        sftp.cd("/beta-server/");
        
        System.out.println("Subiendo c:/archivo.txt ...");
        sftp.put("C:/Users/MANU/Documents/harrypopoter.jpg", "nombre.jpg");
 
        System.out.println("Archivos subidos.");
 
        sftp.exit();
        sftp.disconnect();
        session.disconnect();
 
        System.out.println("----------------- FIN");
        
    }
    
}
