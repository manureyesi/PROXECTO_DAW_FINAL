/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verTicket;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DAW221
 */
public class buscarTicket extends javax.swing.JDialog {
    
    public static int codTicketAux;
    
    /**
     * Creates new form generarClave
     */
    public buscarTicket(javax.swing.JDialog parent, boolean modal) {
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

        jLTexto1 = new javax.swing.JLabel();
        numTicket = new javax.swing.JTextField();
        volver1 = new javax.swing.JButton();
        verTicket = new javax.swing.JButton();
        ultimoNumTicket = new javax.swing.JLabel();
        errores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Buscar Ticket");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLTexto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLTexto1.setText("Introduce un numero de Ticket:");

        numTicket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numTicketKeyPressed(evt);
            }
        });

        volver1.setBackground(new java.awt.Color(153, 153, 153));
        volver1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver1.setText("Volver");
        volver1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver1ActionPerformed(evt);
            }
        });

        verTicket.setBackground(new java.awt.Color(153, 153, 153));
        verTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        verTicket.setText("Ver Ticket");
        verTicket.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTicketActionPerformed(evt);
            }
        });

        ultimoNumTicket.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ultimoNumTicket.setText(" El ultimo ticket es:");

        errores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(verTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(volver1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ultimoNumTicket, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLTexto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numTicket, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ultimoNumTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver1)
                    .addComponent(verTicket))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver1ActionPerformed
        dispose();
    }//GEN-LAST:event_volver1ActionPerformed
    
    private void verTicket(){
        
        this.errores.setText("");
        
        try{
            
            int cod = Integer.parseInt(this.numTicket.getText());
            
            try{
                
                //Comprobar Ticket
                db.consultas con = new db.consultas();
                
                // Consultar cod
                ResultSet rs = con.select("ticket", "estado = 'Cerrado' and cod = "+cod);
                
                int cont = 0;
                
                while(rs.next()){
                    cont++;
                }
                
                if(cont == 1){
                    
                    codTicketAux = cod;
                    
                    verTicket verTicket= new verTicket(new javax.swing.JDialog(),true);
                    verTicket.setVisible(true);
                    
                    this.numTicket.setText("");
                    
                }
                else{
                    this.errores.setText("No se encuentra el Ticket");
                }

            }
            catch(SQLException ex){
                this.errores.setText("Error al buscar ultimo Ticket");
            }
            
        }
        catch(NumberFormatException ex){
            this.errores.setText("Valor no valido");
        }
        
    }
    
    private void verTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTicketActionPerformed
        verTicket();
    }//GEN-LAST:event_verTicketActionPerformed

    private void numTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numTicketKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            verTicket();
        }
    }//GEN-LAST:event_numTicketKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        this.errores.setText("");
        
        //Crear consulta
        db.consultas con = new db.consultas();
        
        try{
            
            // Consultar cod ultimo Ticket
            ResultSet rs = con.select("ticket", "1 ORDER BY cod ASC limit 1");
            
            while(rs.next()){
                
                this.ultimoNumTicket.setText(" El ultimo Ticket es: "+rs.getInt("cod"));
                
            }
            
        }
        catch(SQLException ex){
            this.errores.setText("Error al buscar ultimo Ticket");
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
            java.util.logging.Logger.getLogger(buscarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                buscarTicket dialog = new buscarTicket(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel errores;
    private javax.swing.JLabel jLTexto1;
    private javax.swing.JTextField numTicket;
    private javax.swing.JLabel ultimoNumTicket;
    private javax.swing.JButton verTicket;
    private javax.swing.JButton volver1;
    // End of variables declaration//GEN-END:variables
}
