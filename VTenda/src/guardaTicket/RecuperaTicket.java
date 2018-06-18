/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardaTicket;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import vtenda.VTenda;

/**
 *
 * @author manu
 */
public class RecuperaTicket extends javax.swing.JDialog {

    /**
     * Creates new form RecuperaTicket
     */
    public RecuperaTicket(javax.swing.JDialog parent, boolean modal) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        recuperar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        errores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Recuperar Ticket");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLInfo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLInfo1.setText("Selecciona un Ticket a Recuperar:");

        lista.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(lista);

        recuperar.setBackground(new java.awt.Color(204, 204, 204));
        recuperar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recuperar.setText("Recuperar Ticket");
        recuperar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarActionPerformed(evt);
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

        errores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(recuperar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarActionPerformed
        
        if(this.lista.getSelectedIndex() == -1){
            this.errores.setText("Seleccione un Ticket");
        }
        else{
            
            try{
                
                db.consultas con = new db.consultas();
                
                ResultSet comprobarAdmin = con.select("usuarios", "cod = "+vtenda.VTenda.vendedor.getNumVendedor());
                
                boolean comprobar = false;
                
                while(comprobarAdmin.next()){
                    if(comprobarAdmin.getBoolean("admin")){
                        comprobar = true;
                    }
                }
                
                ResultSet rs;
                
                if(comprobar){
                    rs = con.select("ticket", "estado = 'Guardado'");
                }
                else{
                    System.out.println("Entrando aqui");
                    rs = con.select("ticket", "estado = 'Guardado' and codVendedor = "+vtenda.VTenda.vendedor.getNumVendedor());
                }
                
                int cont = 0;
                
                while(rs.next()){
                    
                    if(cont == this.lista.getSelectedIndex()){
                    
                        vtenda.VTenda.auxTicketGuardar = rs.getInt("cod");
                        
                    }
                    
                    cont++;
                    
                }
                
                vtenda.VTenda.guardarTicket = 1;
                dispose();
                
            }
            catch(SQLException ex){
                System.err.println("Error al conectar con la DB");
                dispose();
                vtenda.VTenda.guardarTicket = 2;
            }
            
            
        }
        
    }//GEN-LAST:event_recuperarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        vtenda.VTenda.guardarTicket = 0;
        dispose();
        
    }//GEN-LAST:event_volverActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        try{
            
            db.consultas con = new db.consultas();
            
            ResultSet comprobarAdmin = con.select("usuarios", "cod = "+vtenda.VTenda.vendedor.getNumVendedor());
                
            boolean comprobar = false;
                
            while(comprobarAdmin.next()){
                if(comprobarAdmin.getBoolean("admin")){
                    comprobar = true;
                }
            }

            ResultSet rs;

            if(comprobar){
                rs = con.select("ticket", "estado = 'Guardado'");
            }
            else{
                System.out.println("Entrando aqui");
                rs = con.select("ticket", "estado = 'Guardado' and codVendedor = "+vtenda.VTenda.vendedor.getNumVendedor());
            }
                
            JList listaNombres=new JList();
            DefaultListModel modelo = new DefaultListModel();
            
            while(rs.next()){
                
                modelo.addElement(" "+rs.getString("alias"));
            
            }
            
            this.lista.setModel(modelo);
            
        }
        catch(SQLException ex){
            System.err.println("Error al conectar con la DB");
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
            java.util.logging.Logger.getLogger(RecuperaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecuperaTicket dialog = new RecuperaTicket(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel jLInfo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private javax.swing.JButton recuperar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
