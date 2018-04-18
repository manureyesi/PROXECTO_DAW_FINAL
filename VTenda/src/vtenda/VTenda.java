/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

/**
*
* @author ManuReyesI
*/
public class VTenda {
    
    /*************** * GRAFICOS ****************************************************************/
        public static PaLogin PaLogin = new PaLogin();
        public static PaPrincipal PaPrincipal = new PaPrincipal();
        public static PaRegistro PaRegistro = new PaRegistro();
        public static Lobby Lobby = new Lobby();
    /***************** DATOS TENDA *************************************************************/
        public static Tenda nTenda = new Tenda();
        public static Vendedor vendedor = new Vendedor(0,"");
    /****************** ADMIN ******************************************************************/
        public static boolean admin = false;
        public static boolean entrar = false;
    /****************** AUX CAMBIO PRODUCTO ****************************************************/
        public static String cod = "";        
    /***************** BASE DE DATOS ***********************************************************/
        public static String db = "jdbc:mysql://beta.fiandeira.es/proxecto_DAW2";
        public static String dbUser = "proxecto";
        public static String dbPass = "PK38czqKwQfkpB1U";
    /***************** PANTALLA CONTRASEÑA *****************************************************/
        public static String usuario = "";
        public static String contrasena = "";
        public static int pantalla;
       
        
    public static void main(String[] args) {
           
        Lobby.setVisible(true);
        
        
    }
    
}
