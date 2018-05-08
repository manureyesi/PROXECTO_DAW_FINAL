package mail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manu
 */
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class envioMail {
    
    public static void enviarGMail(String mensaje,String asunto, String correo) {
        try{
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "lanuri7b@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("lanuri7b@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(correo));
            message.setSubject(asunto);
            message.setText(mensaje, "utf-8", "html");

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("lanuri7b@gmail.com", "Maindo.11");
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
    
