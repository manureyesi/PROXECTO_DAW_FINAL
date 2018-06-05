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
public class ProductosTest {
    
    public ProductosTest() {
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
     * Test of getCodArticulo method, of class Productos.
     */
    @Test
    public void testGetCodArticulo() {
        
        Productos instance = new Productos();
        instance.setCodArticulo("111");
        String expResult = "111";
        
        String result = instance.getCodArticulo();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getNomeArticulo method, of class Productos.
     */
    @Test
    public void testGetNomeArticulo() {
        
        Productos instance = new Productos();
        instance.setNomeArticulo("Producto 1");
        
        String expResult = "Producto 1";
        String result = instance.getNomeArticulo();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrecioSin method, of class Productos.
     */
    @Test
    public void testGetPrecioSin() {
        
        Productos instance = new Productos();
        instance.setPrecioSin(2.3);
        double expResult = 2.3;
        
        double result = instance.getPrecioSin();
        
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getCategoria method, of class Productos.
     */
    @Test
    public void testGetCategoria() {
        
        Productos instance = new Productos();
        instance.setCategoria("Botons");
        
        String expResult = "Botons";
        String result = instance.getCategoria();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getStock method, of class Productos.
     */
    @Test
    public void testGetStock() {
        
        Productos instance = new Productos();
        instance.setStock(5);
        
        int expResult = 5;
        int result = instance.getStock();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularIVA method, of class Productos.
     */
    @Test
    public void testCalcularIVA() {
        
        Productos instance = new Productos();
        instance.setPrecioSin(1);
        
        double expResult = 1.21;
        double result = instance.calcularIVA();
        
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testDevolverIVA() {
        
        Productos instance = new Productos();
        instance.setPrecioSin(1);
        
        double expResult = 0.21;
        double result = instance.getIVA();
        
        assertEquals(expResult, result, 0.0);
        
    }

    
}
