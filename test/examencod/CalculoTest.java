/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examencod;

import mcd.Calculo;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rzarzafernandez
 */
public class CalculoTest {
    
    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setNumero1 method, of class Calculo.
     */
    @Test
    public void testSetNumero1() {
        System.out.println("setNumero1");
        int numero = 0;
        Calculo instance = new Calculo();
        instance.setNumero1(numero);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero2 method, of class Calculo.
     */
    @Test
    public void testSetNumero2() {
        System.out.println("setNumero2");
        int numero = 0;
        Calculo instance = new Calculo();
        instance.setNumero2(numero);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajeResultado method, of class Calculo.
     */
    @Test
    public void testGetMensajeResultado() {
        System.out.println("getMensajeResultado");
        Calculo instance = new Calculo();
        String expResult = "";
        String result = instance.getMensajeResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero1 method, of class Calculo.
     */
    @Test
    public void testGetNumero1() {
        System.out.println("getNumero1");
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.getNumero1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero2 method, of class Calculo.
     */
    @Test
    public void testGetNumero2() {
        System.out.println("getNumero2");
        Calculo instance = new Calculo();
        int expResult = 0;
        int result = instance.getNumero2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD");
        int num1 = 50;
        int num2 = 10;
        Calculo instance = new Calculo();
        int expResult = 10;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result,0.0);
       
    
    }
    
}
