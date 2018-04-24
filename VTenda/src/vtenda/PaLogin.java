/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author DAW221
 */
public class PaLogin extends javax.swing.JFrame {

    /**
     * Creates new form PaLogin
     */
    public PaLogin() {
        initComponents();
        
        Image icono = Toolkit.getDefaultToolkit().getImage("img/IconoProgramaFinal.png");
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        this.errores.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUsuario = new javax.swing.JLabel();
        jLContrasena = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        errores = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VTenda - Login");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLUsuario.setText("Usuario:");

        jLContrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLContrasena.setText("Contraseña:");

        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });

        contrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contrasenaKeyPressed(evt);
            }
        });

        errores.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        entrar.setBackground(new java.awt.Color(204, 204, 204));
        entrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        entrar.setText("Entrar");
        entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        registro.setBackground(new java.awt.Color(204, 204, 204));
        registro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registro.setText("Registrarse");
        registro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contrasena))
                    .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLContrasena)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jLContrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(contrasena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrar)
                    .addComponent(registro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed

        try{
            
            VTenda.entrar = false;
            VTenda.admin = false;
            this.errores.setText("");

            if((this.usuario.getText().compareTo("") == 0) || this.contrasena.getText().compareTo("") == 0){
                this.errores.setText("No se permiten campos vacios");
            }
            else{
                
                db.buscarUser bu = new db.buscarUser();
                
                int numErro = bu.consultaUser(this.usuario.getText(), this.contrasena.getText());
                
                switch(numErro){
                    
                    /* Tipos de errores */

                    case 0:

                    this.errores.setText("Lo sentimos no encontramos el usuario indicado");
                    this.usuario.setText("");
                    this.contrasena.setText("");
                    this.usuario.requestFocus();

                    break;

                    case 1:

                    this.errores.setText("Lo sentimos la contraseña no es correcta");
                    this.contrasena.setText("");
                    this.contrasena.requestFocus();
                    break;

                    case 2:

                    this.errores.setText("Porfavor verifique su correo electronico");
                    this.contrasena.requestFocus();

                    break;

                    case 3:
                    
                    System.out.println("Entrando con el usuario: "+this.usuario.getText());
                        
                    VTenda.PaLogin.setVisible(false);
                    VTenda.PaPrincipal.setVisible(true);

                    this.errores.setText("");
                    this.usuario.setText("");
                    this.contrasena.setText("");

                    break;
                    
                    case 4:

                    this.errores.setText("No podemos conectar con el servidor");
                    this.usuario.setText("");
                    this.contrasena.setText("");
                    this.usuario.requestFocus();

                    break;

                }

                
            }

        }catch (Exception e){

            this.errores.setText("Lo sentimos acabamos de sufrir un error");
        }

    }//GEN-LAST:event_entrarActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        
        System.out.println("Entrando en registro");
        
        this.errores.setText("");

        this.usuario.setText("");
        this.contrasena.setText("");

        VTenda.PaLogin.setVisible(false);
        VTenda.PaRegistro.setVisible(true);

    }//GEN-LAST:event_registroActionPerformed

    private void contrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrasenaKeyPressed
        /*Evento para tecla ENTER*/
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            try{

                VTenda.entrar = false;
                VTenda.admin = false;
                this.errores.setText("");

                if((this.usuario.getText().compareTo("") == 0) || this.contrasena.getText().compareTo("") == 0){
                    this.errores.setText("No se permiten campos vacios");
                }
                else{

                    db.buscarUser bu = new db.buscarUser();

                    int numErro = bu.consultaUser(this.usuario.getText(), this.contrasena.getText());

                    switch(numErro){

                        /* Tipos de errores */

                        case 0:

                        this.errores.setText("Lo sentimos no encontramos el usuario indicado");
                        this.usuario.setText("");
                        this.contrasena.setText("");
                        this.usuario.requestFocus();

                        break;

                        case 1:

                        this.errores.setText("Lo sentimos la contraseña no es correcta");
                        this.contrasena.setText("");
                        this.contrasena.requestFocus();
                        break;

                        case 2:

                        this.errores.setText("Porfavor verifique su correo electronico");
                        this.contrasena.requestFocus();

                        break;

                        case 3:
                        
                        System.out.println("Entrando con el usuario: "+this.usuario.getText());
                        
                        VTenda.PaLogin.setVisible(false);
                        VTenda.PaPrincipal.setVisible(true);

                        this.errores.setText("");
                        this.usuario.setText("");
                        this.contrasena.setText("");

                        break;

                        case 4:

                        this.errores.setText("No podemos conectar con el servidor");
                        this.usuario.setText("");
                        this.contrasena.setText("");
                        this.usuario.requestFocus();

                        break;

                    }


                }

            }catch (Exception e){

                this.errores.setText("Lo sentimos acabamos de sufrir un error");
            }
            
        }
        
    }//GEN-LAST:event_contrasenaKeyPressed

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        
        /*Evento para tecla ENTER*/
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            /*Lanzar foco a pass*/
            this.contrasena.requestFocus();
            
        }
        
    }//GEN-LAST:event_usuarioKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        /*Lanzar foco a pass*/
        this.usuario.requestFocus();
        
        this.usuario.setText("");
        this.contrasena.setText("");
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(PaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel errores;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JButton registro;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
