/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAW221
 */
public class PaAnadirProductos extends javax.swing.JDialog {

    public DefaultTableModel modelo;
    public static int salir = 0;
    
    public PaAnadirProductos(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        Image icono = Toolkit.getDefaultToolkit().getImage("img/tpv.png");
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);
        
        String cabecera[]={"Artículo", "Nombre", "Categoría", "Stock", "Sin IVA", "IVA", "Con IVA"};
        String datos[][]={};
        
        modelo = new DefaultTableModel(datos, cabecera);
        this.productos.setModel(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLCArticulo = new javax.swing.JLabel();
        codArticulo = new javax.swing.JTextField();
        jLNArticulo = new javax.swing.JLabel();
        nomArticulo = new javax.swing.JTextField();
        jLPrecioSIVA = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        jLCategoria = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        jLStock = new javax.swing.JLabel();
        stock = new javax.swing.JSpinner();
        anadir = new javax.swing.JButton();
        errores = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productos = new javax.swing.JTable();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VTenda - Añadir");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLCArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCArticulo.setText("Codigo Artículo:");

        codArticulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLNArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLNArticulo.setText("Nombre Artículo:");

        nomArticulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLPrecioSIVA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLPrecioSIVA.setText("Precio sin IVA:");

        precio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCategoria.setText("Categoría:");

        categoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLStock.setText("Stock:");

        stock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stockKeyPressed(evt);
            }
        });

        anadir.setBackground(new java.awt.Color(204, 204, 204));
        anadir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        anadir.setText(" + Añadir");
        anadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anadir.setEnabled(false);
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        errores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLDescripcion.setText("Descripción del producto:");

        descripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLDescripcion)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLCArticulo)
                                .addComponent(codArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLNArticulo)
                                .addComponent(nomArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(descripcion)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLPrecioSIVA))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLCategoria)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLStock)
                                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCArticulo)
                    .addComponent(jLNArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPrecioSIVA)
                    .addComponent(jLCategoria)
                    .addComponent(jLStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6", "Título 7"
            }
        ));
        productos.setEnabled(false);
        jScrollPane1.setViewportView(productos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver.setText("Volver");
        volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        this.errores.setText("");
        this.codArticulo.setText("");
        this.nomArticulo.setText("");
        this.precio.setText("");
        this.stock.setValue(0);
        this.descripcion.setText("");
        
        try{
            
            int itemCount = categoria.getItemCount();

            for(int i=0;i<itemCount;i++){
                categoria.removeItemAt(0);
            }
            
            /* Introducir categoria */
            this.categoria.addItem("Seleccione:");            
            
            /*Conexion contra DB*/
            Connection cn = DriverManager.getConnection(VTenda.db,VTenda.dbUser,VTenda.dbPass);
            
            /* Consulta categorias */
            PreparedStatement consultarCategoria = cn.prepareStatement("SELECT * FROM `categorias` WHERE 1 ORDER BY `cod` ASC");
                
            ResultSet rs = consultarCategoria.executeQuery();
            
            int cont = 0;
            
            while(rs.next()){
                this.categoria.addItem(rs.getString("nombre"));
                cont++;
            }
            
            if(cont == 0){
                
                this.errores.setText("Lo sentimos no tiene ninguna categoria creada.");
                
                switch(PaAnadirProductos.salir){
                    
                    case 0:
                        vtenda.errores.errorCategoria PaAvisoCategoria = new vtenda.errores.errorCategoria(new javax.swing.JDialog(), true);
                        PaAvisoCategoria.setVisible(true);
                    break;
                    
                    case 1:
                        PaAnadirProductos.salir =0;
                        PaAnadirCategoria PaAnadirCategoria = new PaAnadirCategoria(new javax.swing.JDialog(), true);
                        PaAnadirCategoria.setVisible(true);                     
                    break;
                    
                    case 2:
                        PaAnadirProductos.salir =0;
                        dispose();
                    break;
                
                }
                
               
            }
            else{
                this.anadir.setEnabled(true);
            }
            
        }
        catch(Exception ex){
        }
        
    }//GEN-LAST:event_formWindowActivated

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        
        try{
            double preci = 0;
            try{
                /*Introducir datos en clase*/
                preci = Double.parseDouble(this.precio.getText());
            }
            catch(Exception ex){
                this.errores.setText("Lo sentimos, compruebe los campos numericos");
            }
            
            
            /*Conexion contra DB*/
            Connection cn = DriverManager.getConnection(VTenda.db,VTenda.dbUser,VTenda.dbPass);
            
            Productos p1 = new Productos();

            /*Comprobar errores*/
            if(this.codArticulo.getText().isEmpty()||this.nomArticulo.getText().isEmpty()||this.precio.getText().isEmpty()||this.descripcion.getText().isEmpty()){

                this.errores.setText("Comprueba que relleno todos los campos");

            }
            else if((String)categoria.getSelectedItem() == "Seleccione:"){
                this.errores.setText("Elija una categoria para este producto");
            }
            else if(preci <= 0){
                this.errores.setText("Lo sentimos, el precio tiene que ser superior a 0");
            }
            else{
                
                int error = 0;
                
                /* Controlar error de paso a Double */
                try{
                /*Introducir datos en clase*/
                        p1.setCodArticulo(this.codArticulo.getText());
                        p1.setNomeArticulo(this.nomArticulo.getText());
                        p1.setPrecioSin(Double.parseDouble(this.precio.getText()));
                }
                catch(Exception ex){
                    this.errores.setText("Lo sentimos, compruebe los campos numericos");
                    error = 1;
                }

                int value=(int)this.stock.getValue();

                if(value==0){
                    p1.setStock(1);
                }
                else{
                    p1.setStock(value);
                }


                /*Consulta buscar codigo repetido productos da tenda*/
                PreparedStatement consultarCodigo = cn.prepareStatement("SELECT * FROM `productos` WHERE `cod` = ?");

                consultarCodigo.setString(1, this.codArticulo.getText());

                ResultSet rs = consultarCodigo.executeQuery();

                while(rs.next()){

                    if(this.codArticulo.getText().compareTo(rs.getString("cod")) == 0 ){
                        error = 2;
                    }

                }

                if(error == 2){

                    this.errores.setText("El código de artículo se encuentra repetido");
                    this.codArticulo.setText("");

                }
                else if(error == 0){

                    /* Consulta codCategoria */
                    PreparedStatement consultarCategoria = cn.prepareStatement("SELECT `cod`, `nombre` FROM `categorias` WHERE `nombre` = ?");

                        consultarCategoria.setString(1, (String)categoria.getSelectedItem());

                    ResultSet cat = consultarCategoria.executeQuery();

                    int codCategoria = 0;

                    while(cat.next()){

                        codCategoria = cat.getInt("cod");

                    }


                    String cod=this.codArticulo.getText();
                    String nome=this.nomArticulo.getText();

                    int val=(int)this.stock.getValue();

                    String Stock;

                    if(val<=0){
                        Stock="1";
                    }
                    else{
                        Stock=val+"";
                    }

                    double iv=Double.parseDouble(this.precio.getText())*0.21;

                    Redondear rd = new Redondear();

                    double fin =rd.redondearDecimales(iv);
                    
                    String iva=fin+"";
                    double SinIVA=Double.parseDouble(this.precio.getText());
                    String ConIVA=(Double.parseDouble(this.precio.getText())+fin)+"";

                    /*Insertar datos Productos*/
                    PreparedStatement insertProductos = cn.prepareStatement("INSERT INTO `productos`(`cod`, `nombre`, `descripcion`, `codCategoria`, `precioSin`, `stock`) VALUES (?, ?, ?, ?, ?, ?)");

                        insertProductos.setString(1, cod);
                        insertProductos.setString(2, nome);
                        insertProductos.setString(3, this.descripcion.getText());
                        insertProductos.setInt(4, codCategoria);
                        insertProductos.setDouble(5, SinIVA);
                        insertProductos.setString(6, Stock);

                    insertProductos.executeUpdate();

                    Object Datos[]={cod, nome,(String)categoria.getSelectedItem(), Stock, SinIVA, iva, ConIVA};

                    modelo.addRow(Datos);

                    this.errores.setText("");
                    this.codArticulo.setText("");
                    this.nomArticulo.setText("");
                    this.precio.setText("");
                    this.stock.setValue(0);
                    this.descripcion.setText("");
                    

                }
                else{
                    this.errores.setText("Lo sentimos, compruebe los campos númerico");
                }

            }
            
        }catch(Exception ex){
            this.errores.setText("Lo sentimos, acabamos de sufrir un error");
        }
        
    }//GEN-LAST:event_anadirActionPerformed

    private void stockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyPressed
        
        /*Evento para tecla ENTER*/
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        
            try{
                
                double preci = 0;
                try{
                    /*Introducir datos en clase*/
                    preci = Double.parseDouble(this.precio.getText());
                }
                catch(Exception ex){
                    this.errores.setText("Lo sentimos, compruebe los campos numericos");
                }


                /*Conexion contra DB*/
                Connection cn = DriverManager.getConnection(VTenda.db,VTenda.dbUser,VTenda.dbPass);

                Productos p1 = new Productos();

                /*Comprobar errores*/
                if(this.codArticulo.getText().isEmpty()||this.nomArticulo.getText().isEmpty()||this.precio.getText().isEmpty()||this.descripcion.getText().isEmpty()){

                    this.errores.setText("Comprueba que relleno todos los campos");

                }
                else if((String)categoria.getSelectedItem() == "Seleccione:"){
                    this.errores.setText("Elija una categoria para este producto");
                }
                else if(preci <= 0){
                    this.errores.setText("Lo sentimos, el precio tiene que ser superior a 0");
                }
                else{

                    int error = 0;

                    /* Controlar error de paso a Double */
                    try{
                    /*Introducir datos en clase*/
                            p1.setCodArticulo(this.codArticulo.getText());
                            p1.setNomeArticulo(this.nomArticulo.getText());
                            p1.setPrecioSin(Double.parseDouble(this.precio.getText()));
                    }
                    catch(Exception ex){
                        this.errores.setText("Lo sentimos, compruebe los campos numericos");
                        error = 1;
                    }

                    int value=(int)this.stock.getValue();

                    if(value==0){
                        p1.setStock(1);
                    }
                    else{
                        p1.setStock(value);
                    }


                    /*Consulta buscar codigo repetido productos da tenda*/
                    PreparedStatement consultarCodigo = cn.prepareStatement("SELECT * FROM `productos` WHERE `cod` = ?");

                    consultarCodigo.setString(1, this.codArticulo.getText());

                    ResultSet rs = consultarCodigo.executeQuery();

                    while(rs.next()){

                        if(this.codArticulo.getText().compareTo(rs.getString("cod")) == 0 ){
                            error = 2;
                        }

                    }

                    if(error == 2){

                        this.errores.setText("El código de artículo se encuentra repetido");
                        this.codArticulo.setText("");

                    }
                    else if(error == 0){

                        /* Consulta codCategoria */
                        PreparedStatement consultarCategoria = cn.prepareStatement("SELECT `cod`, `nombre` FROM `categorias` WHERE `nombre` = ?");

                            consultarCategoria.setString(1, (String)categoria.getSelectedItem());

                        ResultSet cat = consultarCategoria.executeQuery();

                        int codCategoria = 0;

                        while(cat.next()){

                            codCategoria = cat.getInt("cod");

                        }


                        String cod=this.codArticulo.getText();
                        String nome=this.nomArticulo.getText();

                        int val=(int)this.stock.getValue();

                        String Stock;

                        if(val<=0){
                            Stock="1";
                        }
                        else{
                            Stock=val+"";
                        }

                        double iv=Double.parseDouble(this.precio.getText())*0.21;

                        Redondear rd = new Redondear();

                        double fin=rd.redondearDecimales(iv);

                        String iva=fin+"";
                        double SinIVA=Double.parseDouble(this.precio.getText());
                        String ConIVA=(Double.parseDouble(this.precio.getText())+fin)+"";

                        /*Insertar datos Productos*/
                        PreparedStatement insertProductos = cn.prepareStatement("INSERT INTO `productos`(`cod`, `nombre`, `descripcion`, `codCategoria`, `precioSin`, `stock`) VALUES (?, ?, ?, ?, ?, ?)");

                            insertProductos.setString(1, cod);
                            insertProductos.setString(2, nome);
                            insertProductos.setString(3, this.descripcion.getText());
                            insertProductos.setInt(4, codCategoria);
                            insertProductos.setDouble(5, SinIVA);
                            insertProductos.setString(6, Stock);

                        insertProductos.executeUpdate();

                        Object Datos[]={cod, nome,(String)categoria.getSelectedItem(), Stock, SinIVA, iva, ConIVA};

                        modelo.addRow(Datos);

                        this.errores.setText("");
                        this.codArticulo.setText("");
                        this.nomArticulo.setText("");
                        this.precio.setText("");
                        this.stock.setValue(0);
                        this.descripcion.setText("");


                    }
                    else{
                        this.errores.setText("Lo sentimos, compruebe los campos númerico");
                    }

                }

            }catch(Exception ex){
                this.errores.setText("Lo sentimos, acabamos de sufrir un error");
                ex.printStackTrace();
            }
        
        }
        
    }//GEN-LAST:event_stockKeyPressed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(PaAnadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaAnadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaAnadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaAnadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaAnadirProductos dialog = new PaAnadirProductos(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton anadir;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField codArticulo;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel errores;
    private javax.swing.JLabel jLCArticulo;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLNArticulo;
    private javax.swing.JLabel jLPrecioSIVA;
    private javax.swing.JLabel jLStock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomArticulo;
    private javax.swing.JTextField precio;
    private javax.swing.JTable productos;
    private javax.swing.JSpinner stock;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
