/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import vtenda.VTenda;

/**
 *
 * @author DAW221
 */
public class generarClave extends javax.swing.JDialog {

    /**
     * Creates new form generarClave
     */
    public generarClave(javax.swing.JDialog parent, boolean modal) {
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

        jLInfo1 = new javax.swing.JLabel();
        jLInfo2 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        claves = new javax.swing.JTextField();
        volver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Generar Clave");
        setResizable(false);

        jLInfo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLInfo1.setText("Genera la clave:");

        jLInfo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver.setText("Generar Clave");
        volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        claves.setEditable(false);
        claves.setBackground(new java.awt.Color(204, 204, 204));
        claves.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        claves.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        claves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clavesMouseClicked(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(claves, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claves, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver)
                    .addComponent(volver1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        try{
            
            /* Conexion contra la DB */
            db.consultas con = new db.consultas();
            
            String Serial = "";

            boolean encontrado = true;

            Serial = "";
            encontrado = true;

            while(encontrado == true){

                while(Serial.length()<19){

                    for(int i = 0; i<4; i++){

                        if((int)(Math.random()*2) == 0){

                            int num = (int)(Math.random()*10);

                            Serial = Serial + num;

                        }
                        else{

                            int resultado=(int)(Math.random()*26+65);
                            char letra = (char)resultado;

                            Serial = Serial + letra;

                        }

                    }

                    if(Serial.length()<19){
                        Serial = Serial + "-";
                    }

                }

                encontrado = false;
                
                ResultSet rs = con.select("tablaSerial", "serial = '"+Serial+"'");
                
                while(rs.next()){

                    if(rs.getString("serial").compareTo(Serial) == 0){

                        encontrado = true;

                    }

                }

            }

            /* Introducir serial en DB */
            con.insert("tablaSerial", "serial", "'"+Serial+"'");
            
            this.claves.setText(Serial);

            System.out.println("Clave: " + Serial + " generada con exito.");
            
            this.jLInfo1.setText("La clave fue generada con exito");
            this.jLInfo2.setText("Copiela y enviesela a su usuario a registrar");
            
        }catch(SQLException ex){
            this.jLInfo1.setText("Lo sentimos acabamos de sufrir un error");
            this.jLInfo2.setText("");
            System.err.println("Error contra la DB");
        }
    }//GEN-LAST:event_volverActionPerformed

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        dispose();
    }//GEN-LAST:event_volver1ActionPerformed

    private void clavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clavesMouseClicked
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(this.claves.getText());
        cb.setContents(ss, ss);
        System.out.println("Copiando clave en portapapeles");
    }//GEN-LAST:event_clavesMouseClicked

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
            java.util.logging.Logger.getLogger(generarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(generarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(generarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(generarClave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                generarClave dialog = new generarClave(new javax.swing.JDialog(), true);
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
    private javax.swing.JTextField claves;
    private javax.swing.JLabel jLInfo1;
    private javax.swing.JLabel jLInfo2;
    private javax.swing.JButton volver;
    private javax.swing.JButton volver1;
    // End of variables declaration//GEN-END:variables
}
