/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author DAW221
 */
public class PaPrincipal extends javax.swing.JFrame {
    /**
     * Creates new form PaPrincipal
     */
    public PaPrincipal() {
        
        initComponents();
        
        Image icono = Toolkit.getDefaultToolkit().getImage("img/tpv.png");
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

        jPLectura = new javax.swing.JPanel();
        ten = new javax.swing.JTextField();
        numTenda = new javax.swing.JTextField();
        nomeTenda = new javax.swing.JTextField();
        dirTenda = new javax.swing.JTextField();
        dir2Tenda = new javax.swing.JTextField();
        version = new javax.swing.JTextField();
        JTNombrePrograma = new javax.swing.JTextField();
        jPMenu = new javax.swing.JPanel();
        tpv = new javax.swing.JButton();
        anadirProductos = new javax.swing.JButton();
        anadirCategorias = new javax.swing.JButton();
        cambioContrasena = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();
        listadoPro = new javax.swing.JButton();
        verPedidos = new javax.swing.JButton();
        verTicket = new javax.swing.JButton();
        administrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VTenda");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPLectura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPLectura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ten.setEditable(false);
        ten.setBackground(new java.awt.Color(204, 204, 204));
        ten.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ten.setText("Tienda Nº");
        ten.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numTenda.setEditable(false);
        numTenda.setBackground(new java.awt.Color(204, 204, 204));
        numTenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numTenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numTenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        numTenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTendaActionPerformed(evt);
            }
        });

        nomeTenda.setEditable(false);
        nomeTenda.setBackground(new java.awt.Color(204, 204, 204));
        nomeTenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nomeTenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dirTenda.setEditable(false);
        dirTenda.setBackground(new java.awt.Color(204, 204, 204));
        dirTenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dirTenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dir2Tenda.setEditable(false);
        dir2Tenda.setBackground(new java.awt.Color(204, 204, 204));
        dir2Tenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dir2Tenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        version.setEditable(false);
        version.setBackground(new java.awt.Color(204, 204, 204));
        version.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        version.setText("Version: 2.1");
        version.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTNombrePrograma.setEditable(false);
        JTNombrePrograma.setBackground(new java.awt.Color(204, 204, 204));
        JTNombrePrograma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JTNombrePrograma.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTNombrePrograma.setText("VTENDA MRI");
        JTNombrePrograma.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPLecturaLayout = new javax.swing.GroupLayout(jPLectura);
        jPLectura.setLayout(jPLecturaLayout);
        jPLecturaLayout.setHorizontalGroup(
            jPLecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLecturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLecturaLayout.createSequentialGroup()
                        .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numTenda, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeTenda, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dirTenda, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dir2Tenda, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPLecturaLayout.createSequentialGroup()
                        .addComponent(version, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(JTNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPLecturaLayout.setVerticalGroup(
            jPLecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLecturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTenda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeTenda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dirTenda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dir2Tenda, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPLecturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(version, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tpv.setBackground(new java.awt.Color(204, 204, 204));
        tpv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tpv.setText("TPV");
        tpv.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tpv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpvActionPerformed(evt);
            }
        });

        anadirProductos.setBackground(new java.awt.Color(204, 204, 204));
        anadirProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        anadirProductos.setText("Añadir Productos");
        anadirProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anadirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirProductosActionPerformed(evt);
            }
        });

        anadirCategorias.setBackground(new java.awt.Color(204, 204, 204));
        anadirCategorias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        anadirCategorias.setText("Añadir Categorias");
        anadirCategorias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anadirCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirCategoriasActionPerformed(evt);
            }
        });

        cambioContrasena.setBackground(new java.awt.Color(204, 204, 204));
        cambioContrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cambioContrasena.setText("Cambiar Contraseña");
        cambioContrasena.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cambioContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioContrasenaActionPerformed(evt);
            }
        });

        cerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        listadoPro.setBackground(new java.awt.Color(204, 204, 204));
        listadoPro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listadoPro.setText("Listado Productos");
        listadoPro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listadoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoProActionPerformed(evt);
            }
        });

        verPedidos.setBackground(new java.awt.Color(204, 204, 204));
        verPedidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        verPedidos.setText("Ver Pedidos");
        verPedidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPedidosActionPerformed(evt);
            }
        });

        verTicket.setBackground(new java.awt.Color(204, 204, 204));
        verTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        verTicket.setText("Ver Ticket");
        verTicket.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTicketActionPerformed(evt);
            }
        });

        administrar.setBackground(new java.awt.Color(204, 204, 204));
        administrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        administrar.setText("Administrar");
        administrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        administrar.setEnabled(false);
        administrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPMenuLayout.createSequentialGroup()
                        .addComponent(anadirCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(administrar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPMenuLayout.createSequentialGroup()
                            .addComponent(verTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anadirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPMenuLayout.createSequentialGroup()
                            .addComponent(tpv, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(listadoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verPedidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambioContrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listadoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anadirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambioContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(anadirCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(administrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPLectura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPLectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numTendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTendaActionPerformed

    }//GEN-LAST:event_numTendaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        this.administrar.setEnabled(false);
        
        numTenda.setText(VTenda.nTenda.getnTenda());
        nomeTenda.setText(VTenda.nTenda.getNomeTenda());
        dirTenda.setText(VTenda.nTenda.getDir1());
        dir2Tenda.setText(VTenda.nTenda.getDir2());
        
        this.JTNombrePrograma.setText("VTENDA MRI");
        
        if(VTenda.admin == true){
            this.JTNombrePrograma.setText("VTENDA MRI - ADMIN");
            this.administrar.setEnabled(true);
        }
        
        if(VTenda.entrar == false){
            
            Encriptar en = new Encriptar("abc123.");
        
            if(VTenda.contrasena.compareTo(en.getCifer()) == 0){

                errores.errorContraseña errorContrasena = new errores.errorContraseña(this, true);
                errorContrasena.setVisible(true);

            }
            
            VTenda.entrar = true;      
        
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void anadirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirProductosActionPerformed
        PaAnadirProductos PaAnadirProductos = new PaAnadirProductos(new javax.swing.JDialog(),true);
        PaAnadirProductos.setVisible(true);
    }//GEN-LAST:event_anadirProductosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void cambioContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioContrasenaActionPerformed
        PaCambioContrasena PaAnadirProductos = new PaCambioContrasena(this, true);
        PaAnadirProductos.setVisible(true);
    }//GEN-LAST:event_cambioContrasenaActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        
        VTenda.admin = false;
        VTenda.entrar = false;
        VTenda.contrasena = "";
        VTenda.usuario = "";
        
        VTenda.PaLogin.setVisible(true);
        VTenda.PaPrincipal.setVisible(false);
        
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void listadoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoProActionPerformed
        PaListarProducto PaListarPro = new PaListarProducto(this, true);
        PaListarPro.setVisible(true);
    }//GEN-LAST:event_listadoProActionPerformed

    private void anadirCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirCategoriasActionPerformed
        PaAnadirCategoria PaAnadirCategoria = new PaAnadirCategoria(new javax.swing.JDialog(), true);
        PaAnadirCategoria.setVisible(true);
    }//GEN-LAST:event_anadirCategoriasActionPerformed

    private void verPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verPedidosActionPerformed

    private void verTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTicketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verTicketActionPerformed

    private void administrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administrarActionPerformed
        admin.administrar administrar = new admin.administrar(this, true);
        administrar.setVisible(true);
    }//GEN-LAST:event_administrarActionPerformed

    private void tpvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpvActionPerformed
        TPV TPV = new TPV(this, true);
        TPV.setVisible(true);
    }//GEN-LAST:event_tpvActionPerformed

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
            java.util.logging.Logger.getLogger(PaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTNombrePrograma;
    private javax.swing.JButton administrar;
    private javax.swing.JButton anadirCategorias;
    private javax.swing.JButton anadirProductos;
    private javax.swing.JButton cambioContrasena;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JTextField dir2Tenda;
    private javax.swing.JTextField dirTenda;
    private javax.swing.JPanel jPLectura;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JButton listadoPro;
    private javax.swing.JTextField nomeTenda;
    private javax.swing.JTextField numTenda;
    private javax.swing.JTextField ten;
    private javax.swing.JButton tpv;
    private javax.swing.JButton verPedidos;
    private javax.swing.JButton verTicket;
    private javax.swing.JTextField version;
    // End of variables declaration//GEN-END:variables
}
