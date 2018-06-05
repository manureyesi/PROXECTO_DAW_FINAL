/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vtenda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MANU
 */
public class RedondearTest {
    
    public RedondearTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of redondearDecimales method, of class Redondear.
     */
    @Test
    public void testRedondearP1() {
        
        double num = 2.222222;
        Redondear instance = new Redondear();
        double expResult = 2.22;
        
        double result = instance.redondearDecimales(num);
        
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testRedondearP2() {
        
        double num = 2.23566662;
        Redondear instance = new Redondear();
        double expResult = 2.24;
        
        double result = instance.redondearDecimales(num);
        
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testRedondearP3() {
        
        double num = 2.238764544;
        Redondear instance = new Redondear();
        double expResult = 2.24;
        
        double result = instance.redondearDecimales(num);
        
        assertEquals(expResult, result, 0.0);
        
    }
    
}
