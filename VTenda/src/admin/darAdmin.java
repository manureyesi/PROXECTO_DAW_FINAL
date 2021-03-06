/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import vtenda.VTenda;

/**
 *
 * @author DAW221
 */
public class darAdmin extends javax.swing.JDialog {

    /**
     * Creates new form darAdmin
     */
    public darAdmin(javax.swing.JDialog parent, boolean modal) {
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

        darAdmin = new javax.swing.JButton();
        volver1 = new javax.swing.JButton();
        jLTexto = new javax.swing.JLabel();
        usuarios = new javax.swing.JComboBox<>();
        errores1 = new javax.swing.JLabel();
        errores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Administracion");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        darAdmin.setBackground(new java.awt.Color(204, 204, 204));
        darAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        darAdmin.setText("Dar Administrador");
        darAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        darAdmin.setEnabled(false);
        darAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAdminActionPerformed(evt);
            }
        });

        volver1.setBackground(new java.awt.Color(204, 204, 204));
        volver1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver1.setText("Volver");
        volver1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });

        jLTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTexto.setText("Selecciona el usuario:");

        usuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        errores1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        errores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTexto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errores1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(darAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errores1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(darAdmin)
                    .addComponent(volver1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void darAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAdminActionPerformed
        
        try{
            
            /*Conexion contra DB*/
            db.consultas con = new db.consultas();
            
            /* Actualizar Admin */
            con.update("usuarios", "admin = 1", "usuario = '"+(String)this.usuarios.getSelectedItem()+"'");
            
            this.errores.setText("Administrador dado con exito");
            
        }catch(SQLException ex){
            System.err.println("Error al conectarse contra la DB");
            this.errores.setText("Lo sentimos acabamos de sufrir un error");
        }
        
        int itemCount = usuarios.getItemCount();

            for(int i=0;i<itemCount;i++){
                usuarios.removeItemAt(0);
            }
            
            /* Introducir categoria */
            this.usuarios.addItem("Seleccione:"); 
        
        try{
            
            /*Conexion contra DB*/
            db.consultas con = new db.consultas();
            
            /* Consulta usuarios */
            ResultSet rs = con.select("usuarios", "admin = 0");
            
            int cont = 0;
            
            while(rs.next()){
                this.usuarios.addItem(rs.getString("usuario"));
                cont++;
            }
            
            if(cont ==0){
                this.errores.setText("Lo sentimos no existe ningun usuario");
                this.errores1.setText("al que dar admin");
                this.darAdmin.setEnabled(false);
            }
            else{
                this.darAdmin.setEnabled(true);
            }
            
        }catch(SQLException ex){
            System.err.println("Error de conexion contra la DB");
            this.errores.setText("Lo sentimos acabamos de sufrir un error");
        }
        
    }//GEN-LAST:event_darAdminActionPerformed

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        dispose();
    }//GEN-LAST:event_volver1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        int itemCount = usuarios.getItemCount();

            for(int i=0;i<itemCount;i++){
                usuarios.removeItemAt(0);
            }
            
            /* Introducir categoria */
            this.usuarios.addItem("Seleccione:"); 
        
        try{
            
            /*Conexion contra DB*/
            db.consultas con = new db.consultas();
            
            /* Consulta usuarios */
            ResultSet rs = con.select("usuarios", "admin = 0");
            
            int cont = 0;
            
            while(rs.next()){
                this.usuarios.addItem(rs.getString("usuario"));
                cont++;
            }
            
            if(cont ==0){
                this.errores.setText("Lo sentimos no existe ningun usuario");
                this.errores1.setText("al que dar admin");
                this.darAdmin.setEnabled(false);
            }
            else{
                this.darAdmin.setEnabled(true);
            }
            
        }catch(SQLException ex){
            System.err.println("Acabamos de sufrir un error al conectar con la DB");
            this.errores.setText("Lo sentimos acabamos de sufrir un error");
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(darAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(darAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(darAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(darAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                darAdmin dialog = new darAdmin(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton darAdmin;
    private javax.swing.JLabel errores;
    private javax.swing.JLabel errores1;
    private javax.swing.JLabel jLTexto;
    private javax.swing.JComboBox<String> usuarios;
    private javax.swing.JButton volver1;
    // End of variables declaration//GEN-END:variables
}
