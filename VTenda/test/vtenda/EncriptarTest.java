/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MANU
 */
public class EncriptarTest {
    
    public EncriptarTest() {
    }
    
    /**
     * Test of getCifer method, of class Encriptar.
     */
    @Test
    public void testGetCiferP1() {
        
        Encriptar instance = new Encriptar("abc123.");
        String expResult = "1325f04d75d9a455279e45fdceb19dcc59286b26";
        
        String result = instance.getCifer();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetCiferP2() {
        
        Encriptar instance = new Encriptar("abc123");
        String expResult = "1325f04d75d9a455279e45fdceb19dcc59286b26";
        
        String result = instance.getCifer();
        
        int pruebas = result.compareTo(expResult);
        
        boolean comprobar = false;
        
        if(pruebas == 0){
            comprobar = true;
        }
        
        assertEquals(false, comprobar);
                
    }
    @Test
    public void testGetCiferP3() {
        
        Encriptar instance = new Encriptar("123");
        String expResult = "0a768b73fc7f9eb4899192f9f1bb58631d905248";
        
        String result = instance.getCifer();
        
        assertEquals(expResult, result);
                
    }
    
    
    
}
