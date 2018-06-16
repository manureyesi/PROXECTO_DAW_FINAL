/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import vtenda.VTenda;

/**
 *
 * @author DAW221
 */
public class recuperarCuenta extends javax.swing.JDialog {
    
    /* Variable para Aux Ticket */
    public static String usuarioRecuperar = "";
    
    /**
     * Creates new form generarClave
     */
    public recuperarCuenta(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Image icono = new ImageIcon(getClass().getResource(VTenda.dirIMG)).getImage();
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();
        errores2 = new javax.swing.JLabel();
        userIco = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        recuperar = new javax.swing.JButton();
        errores1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Recuperar Cuenta");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver.setText("Volver");
        volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        errores2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        userIco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userpequeno.png"))); // NOI18N

        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });

        texto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        texto1.setText("Introduce el nombre de Usuario, para ");

        texto2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        texto2.setText("recuperar la Contraseña:");

        recuperar.setBackground(new java.awt.Color(204, 204, 204));
        recuperar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        recuperar.setText("Recuperar Contraseña");
        recuperar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarActionPerformed(evt);
            }
        });

        errores1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errores2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recuperar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userIco)
                        .addGap(18, 18, 18)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(errores1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIco)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errores1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(errores2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recuperar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed

        /*Evento para tecla ENTER*/
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){

            enviarMail(this.usuario.getText());

        }

    }//GEN-LAST:event_usuarioKeyPressed
    
    private void enviarMail(String user){
    
        try{
            
            /*Conexion contra DB*/
                db.consultas con = new db.consultas();
               
            /*Consulta Producto*/
            ResultSet rs = con.select("usuarios", "usuario = '"+user+"'");
            
            Boolean comprobarUsuario = false;
            
            while(rs.next()){
                if(rs.getString("usuario").compareToIgnoreCase(user) == 0){
                    comprobarUsuario = true;
                }
            }
            
            if(comprobarUsuario == true){
                
                usuarioRecuperar = user;
                this.errores1.setText("Compruebe su correo Electronico");
                this.usuario.setText("");
                this.usuario.requestFocus();
                
                Thread thread = new Thread(){
                public void run(){

                    try{

                        System.out.println("Preparando envio para "+usuarioRecuperar);

                        mail.confirmacionMail email = new mail.confirmacionMail(usuarioRecuperar);

                        email.enviaMailRecuperacion();

                        System.out.println("Enviando mail de Recuperacion a: "+usuarioRecuperar);

                    }
                    catch(Exception ex){
                        System.err.println("Error al enviar correo");
                    }

                }
            };

            thread.start();
                
            }
            else{
                this.errores1.setText("El Usuario no existe");
                this.errores2.setText("Pruebe a volver introducirlo");
                this.usuario.setText("");
                this.usuario.requestFocus();
            }
        
        }
        catch(SQLException ex){
            System.err.println("Error al conectar con la DB al recuperar contraseña");
            this.errores1.setText("Error, al conectar con la");
            this.errores2.setText("Base de Datos");
        }
        
    }
    
    private void recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarActionPerformed
        enviarMail(this.usuario.getText());
    }//GEN-LAST:event_recuperarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(recuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recuperarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                recuperarCuenta dialog = new recuperarCuenta(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errores1;
    private javax.swing.JLabel errores2;
    private javax.swing.JButton recuperar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel userIco;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}