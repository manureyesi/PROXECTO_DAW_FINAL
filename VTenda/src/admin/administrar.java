/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DAW221
 */
public class administrar extends javax.swing.JDialog {

    /**
     * Creates new form administrar
     */
    public administrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Image icono = Toolkit.getDefaultToolkit().getImage(vtenda.VTenda.dirIMG);
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

        generarClave = new javax.swing.JButton();
        darAdmin = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        arreglarTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Administrar");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        generarClave.setBackground(new java.awt.Color(204, 204, 204));
        generarClave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        generarClave.setText("Generar Clave");
        generarClave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarClaveActionPerformed(evt);
            }
        });

        darAdmin.setBackground(new java.awt.Color(204, 204, 204));
        darAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        darAdmin.setText("Dar Admin");
        darAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        darAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAdminActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver.setText("Volver");
        volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        arreglarTicket.setBackground(new java.awt.Color(204, 204, 204));
        arreglarTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arreglarTicket.setText("Arreglar Ticket");
        arreglarTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        arreglarTicket.setEnabled(false);
        arreglarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arreglarTicketActionPerformed(evt);
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
                        .addComponent(arreglarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(darAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(generarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(darAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arreglarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarClaveActionPerformed
        System.out.println("Entrando en Generar Clave");
        generarClave PaGenerarClave = new generarClave(new javax.swing.JDialog(),true);
        PaGenerarClave.setVisible(true);
    }//GEN-LAST:event_generarClaveActionPerformed

    private void darAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAdminActionPerformed
        System.out.println("Entrando en generar Administrador");
        darAdmin darAdmin = new darAdmin(new javax.swing.JDialog(),true);
        darAdmin.setVisible(true);
    }//GEN-LAST:event_darAdminActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        System.out.println("Salir de Administracion");
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void arreglarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arreglarTicketActionPerformed
        
        /* Listas de Ticket no Guardados */
        
        System.out.println("Entrando en recuperacion de Ticket");
        buscarTicket buscarTicket = new buscarTicket(new javax.swing.JDialog(),true);
        buscarTicket.setVisible(true);
        
        
    }//GEN-LAST:event_arreglarTicketActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        /* Buscar Tickets No Cerrados */
        
        try {
            
            db.consultas con = new db.consultas();

                ResultSet rs = con.select("ticket", "estado = 'Iniciado' and codVendedor = (SELECT cod FROM usuarios WHERE usuario = '"+vtenda.VTenda.usuario+"') limit 0,1");

                while(rs.next()){

                    System.out.println("Desbloquear boton de Arreglar Ticket");

                    this.arreglarTicket.setEnabled(true);
                    
                }
             
        } 
        catch (SQLException ex) {
            System.err.println("Error al buscar un Ticket sin Cerrar");
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
            java.util.logging.Logger.getLogger(administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                administrar dialog = new administrar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton arreglarTicket;
    private javax.swing.JButton darAdmin;
    private javax.swing.JButton generarClave;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
