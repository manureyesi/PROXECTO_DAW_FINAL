/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardaTicket;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 6001110
 */
public class GuardarTicket extends javax.swing.JDialog {

    /**
     * Creates new form GuardarTicket
     * @param parent
     * @param modal
     */
    public GuardarTicket(javax.swing.JDialog parent, boolean modal) {
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

        jLInfo1 = new javax.swing.JLabel();
        alias = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Guardar Ticket");

        jLInfo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLInfo1.setText("Introduce un ALIAS para guardar el Ticket:");

        alias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aliasKeyPressed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        volver.setText("Volver");
        volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(204, 204, 204));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alias, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLInfo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aliasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aliasKeyPressed

        /*Evento para tecla ENTER*/
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            /* Cambiar estado de ticket */
            try{

                String aliasTicket = "";

                db.consultas con = new db.consultas();

                if(this.alias.getText().isEmpty() == true){

                    /* Fecha TPV */
                    Date fechaActual = new Date();

                    String dd;

                    Calendar fecha = Calendar.getInstance();
                        int año = fecha.get(Calendar.YEAR);
                        int mes = fecha.get(Calendar.MONTH) + 1;
                        int dia = fecha.get(Calendar.DAY_OF_MONTH);

                    dd=dia+"/"+mes+"/"+año;

                    aliasTicket = dd + " " + fecha.get(Calendar.HOUR_OF_DAY) + ":" + fecha.get(Calendar.MINUTE);

                    con.update("ticket", "estado = 'Guardado', alias = '"+aliasTicket+"'", "cod = "+vtenda.VTenda.auxTicketGuardar);

                }
                else{

                    aliasTicket = this.alias.getText();

                    con.update("ticket", "estado = 'Guardado', alias = '"+this.alias.getText()+"'", "cod = "+vtenda.VTenda.auxTicketGuardar);

                }

                System.out.println("Guardado el Ticket con Alias: "+aliasTicket);

                vtenda.VTenda.guardarTicket = 1;
                vtenda.VTenda.auxTicketGuardar = 0;
                dispose();

            }
            catch(SQLException ex){

                System.out.println("Error al guardar Ticket");

                vtenda.VTenda.guardarTicket = 2;
                dispose();

            }

        }

    }//GEN-LAST:event_aliasKeyPressed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        vtenda.VTenda.guardarTicket = 0;
        dispose();
        
    }//GEN-LAST:event_volverActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        /* Cambiar estado de ticket */
        try{
            
            String aliasTicket = "";
            
            db.consultas con = new db.consultas();
            
            if(this.alias.getText().isEmpty() == true){
                
                /* Fecha TPV */
                Date fechaActual = new Date();

                String dd;

                Calendar fecha = Calendar.getInstance();
                    int año = fecha.get(Calendar.YEAR);
                    int mes = fecha.get(Calendar.MONTH) + 1;
                    int dia = fecha.get(Calendar.DAY_OF_MONTH);
                               
                dd=dia+"/"+mes+"/"+año;
                
                aliasTicket = dd + " " + fecha.get(Calendar.HOUR_OF_DAY) + ":" + fecha.get(Calendar.MINUTE);
                
                con.update("ticket", "estado = 'Guardado', alias = '"+aliasTicket+"'", "cod = "+vtenda.VTenda.auxTicketGuardar);
                
            }
            else{
                
                aliasTicket = this.alias.getText();
                
                con.update("ticket", "estado = 'Guardado', alias = '"+this.alias.getText()+"'", "cod = "+vtenda.VTenda.auxTicketGuardar);
                
            }
            
            System.out.println("Guardado el Ticket con Alias: "+aliasTicket);
            
            vtenda.VTenda.guardarTicket = 1;
            vtenda.VTenda.auxTicketGuardar = 0;
            dispose();
        
        }
        catch(SQLException ex){
            
            System.out.println("Error al guardar Ticket");
            
            vtenda.VTenda.guardarTicket = 2;
            dispose();
            
        }
        
        
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(GuardarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GuardarTicket dialog = new GuardarTicket(new javax.swing.JDialog(), true);
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
    private javax.swing.JTextField alias;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLInfo1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
