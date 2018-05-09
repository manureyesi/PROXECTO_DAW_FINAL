/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

/**
 *
 * @author MANU
 */
public class PaFinalizarTicket extends javax.swing.JDialog{
    
    public static double valorTicket = 0;
    
    /**
     * Creates new form PaActualizarProducto
     */
    public PaFinalizarTicket(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Image icono = Toolkit.getDefaultToolkit().getImage(VTenda.dirIMG);
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
        cerrarTicket = new javax.swing.JButton();
        jLabelTipoPago = new javax.swing.JLabel();
        tipoPago = new javax.swing.JTextField();
        pago = new javax.swing.JTextField();
        jLabelPagado = new javax.swing.JLabel();
        pagado = new javax.swing.JTextField();
        jLabelTotalPagar = new javax.swing.JLabel();
        totalPagar = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 0), new java.awt.Dimension(300, 32767));
        linea = new javax.swing.JLabel();
        jLabelTotalPagar1 = new javax.swing.JLabel();
        jLabelDiferencia = new javax.swing.JLabel();
        diferencia = new javax.swing.JTextField();
        errores = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelManual3 = new javax.swing.JLabel();
        jLabelManual1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelManual2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Cerrar Ticket");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        cerrarTicket.setBackground(new java.awt.Color(204, 204, 204));
        cerrarTicket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cerrarTicket.setText("Cerrar Ticket");
        cerrarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarTicketActionPerformed(evt);
            }
        });
        cerrarTicket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cerrarTicketKeyPressed(evt);
            }
        });

        jLabelTipoPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTipoPago.setText("Tipo de Pago .....................");

        tipoPago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPagoActionPerformed(evt);
            }
        });
        tipoPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tipoPagoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tipoPagoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tipoPagoKeyTyped(evt);
            }
        });

        pago.setEditable(false);
        pago.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pago.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pago.setText("0.0 €");
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });

        jLabelPagado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPagado.setText("PAGADO ..............");

        pagado.setEditable(false);
        pagado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pagado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pagado.setText("0.0 €");
        pagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagadoActionPerformed(evt);
            }
        });
        pagado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pagadoKeyPressed(evt);
            }
        });

        jLabelTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTotalPagar.setText("TOTAL A PAGAR ...");

        totalPagar.setEditable(false);
        totalPagar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalPagar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalPagar.setText("0.0 €");
        totalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPagarActionPerformed(evt);
            }
        });

        filler1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        linea.setText("________________________________");

        jLabelTotalPagar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelDiferencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDiferencia.setText("DIFERENCIA ........");

        diferencia.setEditable(false);
        diferencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diferencia.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        diferencia.setText("0.0 €");
        diferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diferenciaActionPerformed(evt);
            }
        });

        errores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelManual3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManual3.setForeground(new java.awt.Color(0, 204, 204));
        jLabelManual3.setText("<F8> Cerrar Ticket  || <F10> Cerrar Ticket e Imprimir");

        jLabelManual1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManual1.setForeground(new java.awt.Color(0, 204, 204));
        jLabelManual1.setText("Tipos de Pago:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));

        jLabelManual2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelManual2.setForeground(new java.awt.Color(0, 204, 204));
        jLabelManual2.setText("C -> Contado || T -> Tarjeta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelManual1)
                    .addComponent(jLabel3)
                    .addComponent(jLabelManual2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelManual3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelManual1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelManual2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelManual3)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linea)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelPagado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelTipoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelTotalPagar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pagado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTotalPagar1)
                            .addComponent(jLabelDiferencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoPago)
                    .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPagado)
                    .addComponent(pagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotalPagar)
                    .addComponent(totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(linea, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTotalPagar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDiferencia))
                    .addComponent(diferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cerrarTicket(String modoPago, boolean inprimirTicket){
        
        try{
            
            /*Conexion contra DB*/
            db.consultas con = new db.consultas();

            /*Consulta Producto*/
            con.update("ticket", " estado='Cerrado',alias=NULL,modoPago='"+modoPago+"',precioFinal="+valorTicket, "cod = '"+TPV.auxTicket+"'");
            
            System.out.println("Cerrando Ticket Nº "+ TPV.auxTicket);
            TPV.auxTicket = 0;
            dispose();
            
        }
        catch(SQLException ex){
            this.errores.setText("Error ao cerrar Ticket");
            System.err.println("Error contra DB ao cerrar Ticket");
        }
        
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void cerrarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarTicketActionPerformed
        
        if(this.tipoPago.getText().isEmpty()){
            this.errores.setText("Es obligatorio poner un tipo de Pago");
        }
        else{
            
            if(this.tipoPago.getText().compareToIgnoreCase("C")==0){
                
                if(this.pagado.getText().isEmpty()){
                    this.errores.setText("Es obligatorio poner un Inporte en Pagado");
                }
                else{
                    cerrarTicket("Contado", true);
                }
                
            }
            else{
                cerrarTicket("Tarjeta", true);
            }
            
        }
               
    }//GEN-LAST:event_cerrarTicketActionPerformed

    private void tipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoPagoActionPerformed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagoActionPerformed

    private void pagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagadoActionPerformed

    private void totalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPagarActionPerformed
    
    private void tipoPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoPagoKeyPressed
        // TODO add your handling code here:       
    }//GEN-LAST:event_tipoPagoKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_F8){
            
            System.out.println("Guardando Ticket sin Imprimir Ticket");
            
            if(this.tipoPago.getText().isEmpty()){
                this.errores.setText("Es obligatorio poner un tipo de Pago");
            }
            else{

                if(this.tipoPago.getText().compareToIgnoreCase("C")==0){

                    if(this.pagado.getText().isEmpty()){
                        this.errores.setText("Es obligatorio poner un Inporte en Pagado");
                    }
                    else{
                        cerrarTicket("Contado", false);
                    }

                }
                else{
                    cerrarTicket("Tarjeta", false);
                }

            }
                        
        }
        else if(evt.getKeyCode()==KeyEvent.VK_F10){
            
            System.out.println("Guardando Ticket Imprimiendo Ticket");
            
            if(this.tipoPago.getText().isEmpty()){
                this.errores.setText("Es obligatorio poner un tipo de Pago");
            }
            else{

                if(this.tipoPago.getText().compareToIgnoreCase("C")==0){

                    if(this.pagado.getText().isEmpty()){
                        this.errores.setText("Es obligatorio poner un Inporte en Pagado");
                    }
                    else{
                        cerrarTicket("Contado", true);
                    }

                }
                else{
                    cerrarTicket("Tarjeta", true);
                }

            }
            
        }
        
    }//GEN-LAST:event_formKeyPressed

    private void cerrarTicketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cerrarTicketKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarTicketKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        valorTicket = TPV.total;
        
        this.pago.setText(valorTicket +" €");
        this.totalPagar.setText(valorTicket +" €");
        
    }//GEN-LAST:event_formWindowOpened

    private void tipoPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoPagoKeyTyped
        // TODO add your handling code here:  
    }//GEN-LAST:event_tipoPagoKeyTyped

    private void tipoPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoPagoKeyReleased
        
        switch(evt.getKeyCode()){
            
            case KeyEvent.VK_C:
                
                this.tipoPago.setText("C");
                this.pagado.setText("");
                this.pagado.setEditable(true);
                this.pagado.requestFocus();
                
            break;
                
            case KeyEvent.VK_T:
                
                this.tipoPago.setText("T");
                this.pagado.setEditable(false);
                this.diferencia.setText(" 0.0 €");
                this.requestFocus();
                
            break;
            
            default:
                
                this.tipoPago.setText("");
                this.tipoPago.setText("");
                this.tipoPago.requestFocus();
                this.pagado.setEditable(false);
                this.diferencia.setText(" 0.0 €");
                
            break;
        
        }
        
    }//GEN-LAST:event_tipoPagoKeyReleased

    private void pagadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagadoKeyPressed
        
        double CanpoPagado = 0;
        double resultado = 0;
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(this.pagado.getText().isEmpty()){
                this.pagado.setText(this.valorTicket +" €");
                this.requestFocus();
                this.errores.setText("");
            }
            else{
            
                try{

                    CanpoPagado = Double.parseDouble(this.pagado.getText());

                    if(CanpoPagado < this.valorTicket){
                        this.errores.setText("El valor Pagado tiene que ser mas alto");
                        this.diferencia.setText(" 0.0 €");
                    }
                    else{

                        resultado = CanpoPagado - this.valorTicket;

                        Redondear rd = new Redondear();
                        resultado = rd.redondearDecimales(resultado);

                        this.pagado.setText(CanpoPagado+" €");
                        this.diferencia.setText(resultado + " €");
                        
                        this.errores.setText("");
                        
                        this.requestFocus();

                    }

                }
                catch(NumberFormatException ex){

                    this.pagado.setText("");
                    this.pagado.requestFocus();
                    this.diferencia.setText(" 0.0 €");
                    this.errores.setText("Comprueba el valor de Pagado");

                }
            }
            
        }
        
    }//GEN-LAST:event_pagadoKeyPressed

    private void diferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diferenciaActionPerformed
    
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
            java.util.logging.Logger.getLogger(PaFinalizarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaFinalizarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaFinalizarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaFinalizarTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaFinalizarTicket dialog = new PaFinalizarTicket(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton cerrarTicket;
    private javax.swing.JTextField diferencia;
    private javax.swing.JLabel errores;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDiferencia;
    private javax.swing.JLabel jLabelManual1;
    private javax.swing.JLabel jLabelManual2;
    private javax.swing.JLabel jLabelManual3;
    private javax.swing.JLabel jLabelPagado;
    private javax.swing.JLabel jLabelTipoPago;
    private javax.swing.JLabel jLabelTotalPagar;
    private javax.swing.JLabel jLabelTotalPagar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linea;
    private javax.swing.JTextField pagado;
    private javax.swing.JTextField pago;
    private javax.swing.JTextField tipoPago;
    private javax.swing.JTextField totalPagar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

}
