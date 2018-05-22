/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFTP;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.UserInfo;

/**
 *
 * @author 6001111
 */
public class SubirIMG {
    
    private static final String user = "prueba";
    private static final String host = "pruebas.fiandeira.es";
    private static final Integer port = 22;
    private static final String pass = "Maindo.11";
    
    private static final String directorio_servidor = "/pruebas-server/img/pruebas/";
    
    public String nombre_producto;
    public String directorio_equipo;
    
    public SubirIMG(){}

    public SubirIMG(String nombre_producto, String directorio_equipo) {
        try {
            
            this.nombre_producto = nombre_producto;
            this.directorio_equipo = directorio_equipo;
            
            UploadIMG();
            
        } catch (JSchException | SftpException ex) {
            System.err.println("Error al Subir IMG");
            ex.printStackTrace();
        }
        
    }
    
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
  
    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setDirectorio_equipo(String directorio_equipo) {
        this.directorio_equipo = directorio_equipo;
    }

    public String getDirectorio_equipo() {
        return directorio_equipo;
    }
        
    public void UploadIMG() throws JSchException, SftpException{
    
        System.out.println("------------------- INICIO");
 
        JSch jsch = new JSch();
        Session session = jsch.getSession(this.user, this.host, this.port);
        UserInfo ui = new SUserInfo(this.pass, null);
 
        session.setUserInfo(ui);
        session.setPassword(this.pass);
        session.connect();
 
        ChannelSftp sftp = (ChannelSftp)session.openChannel("sftp");
        sftp.connect();
 
        sftp.cd(this.directorio_servidor);
        
        sftp.put(this.directorio_equipo, this.nombre_producto);
        //sftp.put(this.directorio_equipo, this.nombre_producto);
 
        System.out.println("Archivos subidos.");
 
        sftp.exit();
        sftp.disconnect();
        session.disconnect();
 
        System.out.println("----------------- FIN");
        
    }
    
    
    
}
