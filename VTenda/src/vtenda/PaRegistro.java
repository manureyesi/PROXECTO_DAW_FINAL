/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW221
 */
public class PaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form PaReguistro
     */
    public PaRegistro() {
        
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

        jLUsuario = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLContrasena = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLContrasena2 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        jLNombre = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLApellidos = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLClave = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        errores = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VTenda - Registro");
        setResizable(false);

        jLUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLUsuario.setText("Usuario:");

        usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLContrasena.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLContrasena.setText("Contraseña:");

        pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLContrasena2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLContrasena2.setText("Repetir Contraseña:");

        pass2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLNombre.setText("Nombre:");

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLApellidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLApellidos.setText("Apellidos:");

        apellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLCorreo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLCorreo.setText("Correo:");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLClave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLClave.setText("Clave de registro:");

        clave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                claveMouseClicked(evt);
            }
        });
        clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                claveKeyPressed(evt);
            }
        });

        errores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        volver.setBackground(new java.awt.Color(204, 204, 204));
        volver.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        volver.setText("Volver");
        volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        registrarse.setBackground(new java.awt.Color(204, 204, 204));
        registrarse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registrarse.setText("Registrarse");
        registrarse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(jLUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLContrasena, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLContrasena2)
                            .addComponent(pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jLApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errores, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        this.usuario.setText("");
        this.pass.setText("");
        this.pass2.setText("");
        this.clave.setText("");
        this.email.setText("");
        this.nombre.setText("");
        this.apellidos.setText("");
        this.errores.setText("");
        
        VTenda.PaLogin.setVisible(true);
        VTenda.PaRegistro.setVisible(false);
        
    }//GEN-LAST:event_volverActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        
        try{
            
            /*Comprobar Mail*/
            boolean comprobarMail = false;
            int contA = 0;
            
            for(int i = 0; i < this.email.getText().length() ; i++){
            
                if(this.email.getText().charAt(i) == '@'){
                    contA++;
                }
            
            }
            if(contA == 1){
                comprobarMail = true;
            }
            
            
            this.errores.setText("");

            /*Comprobacion de errores*/
            if(this.usuario.getText().compareTo("") == 0 || this.pass.getText().compareTo("") == 0){
                this.errores.setText("No se permiten campos en blanco");
            }
            else if (this.pass.getText().compareTo("") == 0){
                this.errores.setText("Escriba la confirmación de la contraseña");
            }
            else if(this.nombre.getText().compareTo("") == 0 || this.apellidos.getText().compareTo("") == 0 ){
                this.errores.setText("Escriba su nombre y apellidos");
            }
            else if(this.email.getText().compareTo("") == 0){
                this.errores.setText("Escriba su correo");
            }
            else if(this.clave.getText() == ""){
                this.errores.setText("Lo sentimos introduzca una clave para crear usuario");
            }
            else if(comprobarMail == false){
                this.errores.setText("Lo sentimos el correo no es valido");
            }
            else if(this.pass.getText().length() <= 8){
            
                this.errores.setText("La contraseña tiene que ser mayor de 8 caracteres");
            
            }
            else{

                if((this.pass.getText().compareTo(this.pass2.getText())) == 0){

                    /*Conexion contra DB*/
                    Connection cn = DriverManager.getConnection(VTenda.db,VTenda.dbUser,VTenda.dbPass);

                    /*Consulta usuario*/

                    PreparedStatement consultarUsuario= cn.prepareStatement("SELECT * FROM `usuarios` WHERE `usuario` = ?");

                    consultarUsuario.setString(1, this.usuario.getText());

                    ResultSet rs = consultarUsuario.executeQuery();

                    boolean comprobarUsuario = false;

                        while (rs.next()){
                            /*Comprobacion USUARIO*/
                            if(0 == rs.getString("usuario").compareToIgnoreCase(this.usuario.getText())){
                                comprobarUsuario = true;
                            }

                        }

                        if(comprobarUsuario == true){
                            /*Se o usuario e igual a outro*/
                            this.errores.setText("Hai otro usuario con el mismo nombre");
                            this.usuario.setText("");
                        }
                        else{
                                
                            /*Consulta Serial*/
                            Statement buscarSerial = cn.createStatement();
                                
                            PreparedStatement consultarSerial = cn.prepareStatement("SELECT * FROM tablaSerial WHERE serial = ?");

                            consultarSerial.setString(1, this.clave.getText());

                            ResultSet cs = consultarSerial.executeQuery();
                                
                            boolean claveEncontrada = false;
                                
                            while(cs.next()){
                                /*Comprobar se o serial existe e esta usado*/
                                if(this.clave.getText().compareTo(cs.getString("serial")) == 0 && cs.getInt("usada") == 0){
                                            
                                    claveEncontrada = true;
                                            
                                    String user = this.usuario.getText();
                                    Encriptar contra = new Encriptar(this.pass.getText());
                                    
                                    /* mayusculas apellido */
                                    String apellidos = "";
                                    
                                    String []  apel = this.apellidos.getText().split(" ");
                                    
                                    for(int i =0; i < apel.length;i++){
                                        
                                        apel[i]=Character.toUpperCase(apel[i].charAt(0)) + apel[i].substring(1).toLowerCase();
                                    
                                    }
                                    
                                    for(int i =0; i < apel.length;i++){
                                        
                                        apellidos += apel[i]+" ";
                                    
                                    }
                                    
                                    /* mayusculas nombre */
                                    String nombre = "";
                                    
                                    String []  nom = this.nombre.getText().split(" ");
                                    
                                    for(int i =0; i < nom.length;i++){
                                        
                                        nom[i]=Character.toUpperCase(nom[i].charAt(0)) + nom[i].substring(1).toLowerCase();
                                    
                                    }
                                    
                                    for(int i =0; i < nom.length;i++){
                                        
                                        nombre += nom[i]+" ";
                                    
                                    }
                                    
                                    /* Crear usuario en BD */  
                                    PreparedStatement crearUser = cn.prepareStatement("INSERT INTO `usuarios`(`usuario`, `nombre`, `apellidos`, `mail`, `contrasena`) VALUES (?,?,?,?,?)");

                                        crearUser.setString(1, user);
                                        crearUser.setString(2, nombre);
                                        crearUser.setString(3, apellidos);
                                        crearUser.setString(4, this.email.getText());
                                        crearUser.setString(5, contra.cifer);
                                            
                                    crearUser.executeUpdate();
                                 
                                    VTenda.usuario = this.usuario.getText();
                                    VTenda.contrasena = contra.cifer;

                                    this.errores.setText("Usuario creado");

                                    /*Modificar Tabla Serial*/
                                    PreparedStatement UpdateSerial = cn.prepareStatement("UPDATE `tablaSerial` SET `usada`= ? WHERE `serial` = ?");

                                    UpdateSerial.setString(2, this.clave.getText());
                                    
                                        UpdateSerial.setInt(1, 1);

                                    UpdateSerial.executeUpdate();

                                    /*Consulta datos Usuarios*/
                                    PreparedStatement buscarDatos= cn.prepareStatement("SELECT * FROM `usuarios` WHERE `usuario` = ?");

                                        buscarDatos.setString(1, this.usuario.getText());

                                    ResultSet datosUser = buscarDatos.executeQuery();
                                                
                                    while(datosUser.next()){
                                        /*Enviar Emeil Confirmacion Correo*/
                                        envioMail em = new envioMail();

                                        em.enviarGMail("Para finalizar el rexistro pulse en el siguiente enlace https://beta.fiandeira.es/proxecto_DAW2/verificar.php?mail=" + this.email.getText() + "&user=" + this.usuario.getText() + "&cod=" + datosUser.getInt("cod") + " ."
                                                            + "En caso de no haber echo este registro envie un mensaje a admin@fiandeira.es.", "Confirmacion VTenda", this.email.getText());

                                    }

                                    /*Borrar datos*/
                                    this.usuario.setText("");
                                    this.pass.setText("");
                                    this.pass2.setText("");
                                    this.clave.setText("");
                                    this.email.setText("");
                                    this.nombre.setText("");
                                    this.apellidos.setText("");
                                    this.errores.setText("Verifique su buzon de correo");

                                }
                                else{

                                    claveEncontrada = false;

                                }

                            }
                                    
                            if(claveEncontrada == false){
                                /*Se non existe un serial*/
                                this.clave.setText("");
                                this.errores.setText("No tiene clave para crear usuario");
                            }
                                    
                        }

                }
            }

        } catch (Exception e){

            this.clave.setText("");
            this.errores.setText("Lo sentimos no podemos acceder a la Base de Datos");
                    
        }
        
        
    }//GEN-LAST:event_registrarseActionPerformed

    private void claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claveMouseClicked
        
        Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
        
        if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)){
            String text;
            try {
                text = (String) t.getTransferData(DataFlavor.stringFlavor);
                
                int cont =0;
                for(int i =0; i<text.length();i++){
                
                    if(text.charAt(i) =='-'){
                        cont++;
                    }
                
                }
                if(cont ==3){
                    if(text.length()==19){
                        this.clave.setText(text);
                    }
                }
                
                
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(PaRegistro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PaRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_claveMouseClicked

    private void claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            try{

                /*Comprobar Mail*/
                boolean comprobarMail = false;
                int contA = 0;

                for(int i = 0; i < this.email.getText().length() ; i++){

                    if(this.email.getText().charAt(i) == '@'){
                        contA++;
                    }

                }
                if(contA == 1){
                    comprobarMail = true;
                }


                this.errores.setText("");

                /*Comprobacion de errores*/
                if(this.usuario.getText().compareTo("") == 0 || this.pass.getText().compareTo("") == 0){
                    this.errores.setText("No se permiten campos en blanco");
                }
                else if (this.pass.getText().compareTo("") == 0){
                    this.errores.setText("Escriba la confirmación de la contraseña");
                }
                else if(this.nombre.getText().compareTo("") == 0 || this.apellidos.getText().compareTo("") == 0 ){
                    this.errores.setText("Escriba su nombre y apellidos");
                }
                else if(this.email.getText().compareTo("") == 0){
                    this.errores.setText("Escriba su correo");
                }
                else if(this.clave.getText() == ""){
                    this.errores.setText("Lo sentimos introduzca una clave para crear usuario");
                }
                else if(comprobarMail == false){
                    this.errores.setText("Lo sentimos el correo no es valido");
                }
                else if(this.pass.getText().length() <= 8){
            
                    this.errores.setText("La contraseña tiene que ser mayor de 8 caracteres");
            
                }
                else{

                    if((this.pass.getText().compareTo(this.pass2.getText())) == 0){

                        /*Conexion contra DB*/
                        Connection cn = DriverManager.getConnection(VTenda.db,VTenda.dbUser,VTenda.dbPass);

                        /*Consulta usuario*/

                        PreparedStatement consultarUsuario= cn.prepareStatement("SELECT * FROM `usuarios` WHERE `usuario` = ?");

                        consultarUsuario.setString(1, this.usuario.getText());

                        ResultSet rs = consultarUsuario.executeQuery();

                        boolean comprobarUsuario = false;

                            while (rs.next()){
                                /*Comprobacion USUARIO*/
                                if(0 == rs.getString("usuario").compareToIgnoreCase(this.usuario.getText())){
                                    comprobarUsuario = true;
                                }

                            }

                            if(comprobarUsuario == true){
                                /*Se o usuario e igual a outro*/
                                this.errores.setText("Hai otro usuario con el mismo nombre");
                                this.usuario.setText("");
                            }
                            else{

                                /*Consulta Serial*/
                                Statement buscarSerial = cn.createStatement();

                                PreparedStatement consultarSerial = cn.prepareStatement("SELECT * FROM tablaSerial WHERE serial = ?");

                                consultarSerial.setString(1, this.clave.getText());

                                ResultSet cs = consultarSerial.executeQuery();

                                boolean claveEncontrada = false;

                                while(cs.next()){
                                    /*Comprobar se o serial existe e esta usado*/
                                    if(this.clave.getText().compareTo(cs.getString("serial")) == 0 && cs.getInt("usada") == 0){

                                        claveEncontrada = true;

                                        String user = this.usuario.getText();
                                        Encriptar contra = new Encriptar(this.pass.getText());
                                        
                                        /* mayusculas apellido */
                                        String apellidos = "";

                                        String []  apel = this.apellidos.getText().split(" ");

                                        for(int i =0; i < apel.length;i++){

                                            apel[i]=Character.toUpperCase(apel[i].charAt(0)) + apel[i].substring(1).toLowerCase();

                                        }

                                        for(int i =0; i < apel.length;i++){

                                            apellidos += apel[i]+" ";

                                        }

                                        /* mayusculas nombre */
                                        String nombre = "";

                                        String []  nom = this.nombre.getText().split(" ");

                                        for(int i =0; i < nom.length;i++){

                                            nom[i]=Character.toUpperCase(nom[i].charAt(0)) + nom[i].substring(1).toLowerCase();

                                        }

                                        for(int i =0; i < nom.length;i++){

                                            nombre += nom[i]+" ";

                                        }
                                        
                                        /*Crear usuario en BD*/
                                        PreparedStatement crearUser = cn.prepareStatement("INSERT INTO `usuarios`(`usuario`, `nombre`, `apellidos`, `mail`, `contrasena`) VALUES (?,?,?,?,?)");

                                            crearUser.setString(1, user);
                                            crearUser.setString(2, nombre);
                                            crearUser.setString(3, apellidos);
                                            crearUser.setString(4, this.email.getText());
                                            crearUser.setString(5, contra.cifer);

                                        crearUser.executeUpdate();

                                        VTenda.usuario = this.usuario.getText();
                                        VTenda.contrasena = contra.cifer;

                                        this.errores.setText("Usuario creado");

                                        /*Modificar Tabla Serial*/
                                        PreparedStatement UpdateSerial = cn.prepareStatement("UPDATE `tablaSerial` SET `usada`= ? WHERE `serial` = ?");

                                        UpdateSerial.setString(2, this.clave.getText());

                                            UpdateSerial.setInt(1, 1);

                                        UpdateSerial.executeUpdate();

                                        /*Consulta datos Usuarios*/
                                        PreparedStatement buscarDatos= cn.prepareStatement("SELECT * FROM `usuarios` WHERE `usuario` = ?");

                                            buscarDatos.setString(1, this.usuario.getText());

                                        ResultSet datosUser = buscarDatos.executeQuery();

                                        while(datosUser.next()){
                                            /*Enviar Emeil Confirmacion Correo*/
                                            envioMail em = new envioMail();

                                            em.enviarGMail("Para finalizar el rexistro pulse en el siguiente enlace https://beta.fiandeira.es/proxectos/proxecto_DAW2/verificar.php?mail=" + this.email.getText() + "&user=" + this.usuario.getText() + "&cod=" + datosUser.getInt("cod") + " ."
                                                                + "En caso de no haber echo este registro envie un mensaje a admin@fiandeira.es.", "Confirmacion VTenda", this.email.getText());

                                        }

                                        /*Borrar datos*/
                                        this.usuario.setText("");
                                        this.pass.setText("");
                                        this.pass2.setText("");
                                        this.clave.setText("");
                                        this.email.setText("");
                                        this.nombre.setText("");
                                        this.apellidos.setText("");
                                        this.errores.setText("Verifique su buzon de correo");

                                    }
                                    else{

                                        claveEncontrada = false;

                                    }

                                }

                                if(claveEncontrada == false){
                                    /*Se non existe un serial*/
                                    this.clave.setText("");
                                    this.errores.setText("No tiene clave para crear usuario");
                                }

                            }

                    }
                }

            } catch (Exception e){

                this.clave.setText("");
                this.errores.setText("Lo sentimos no podemos acceder a la Base de Datos");

            }
        
        }
        
    }//GEN-LAST:event_claveKeyPressed

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
            java.util.logging.Logger.getLogger(PaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form volver*/   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField email;
    private javax.swing.JLabel errores;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLContrasena2;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JButton registrarse;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
