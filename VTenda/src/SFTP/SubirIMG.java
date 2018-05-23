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
import java.io.File;

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
    public File directorio_equipo;
    
    public SubirIMG(){}

    public SubirIMG(String nombre_producto, File directorio_equipo) {
        
            this.nombre_producto = nombre_producto;
            this.directorio_equipo = directorio_equipo;
            
            UploadIMG();
           
        
    }
    
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
  
    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setDirectorio_equipo(File directorio_equipo) {
        this.directorio_equipo = directorio_equipo;
    }

    public File getDirectorio_equipo() {
        return directorio_equipo;
    }
            
    private void UploadIMG(){
        
        try{

            System.out.println("--------- INICIO TRANSFERENCIA ARCHIVO -------");

            JSch jsch = new JSch();
            Session session = jsch.getSession(this.user, this.host, this.port);
            UserInfo ui = new SUserInfo(this.pass, null);

            session.setUserInfo(ui);
            session.setPassword(this.pass);
            session.connect();

            ChannelSftp sftp = (ChannelSftp)session.openChannel("sftp");
            sftp.connect();
            
            sftp.cd(this.directorio_servidor);
            sftp.put(this.directorio_equipo+"", this.nombre_producto);

            System.out.println("Archivos " + this.nombre_producto + " subidos.");

            sftp.exit();
            sftp.disconnect();
            session.disconnect();

            System.out.println("---------  FIN TRANSFERENCIA ARCHIVO ---------");
        
        }
        catch(Exception ex){
            System.err.println("Error al subir IMG a SFTP");
        }
        
        
    }
    
    
    
}
