/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapoliedros;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 0101001011
 */
public class TetraedroTest {
    
    public TetraedroTest() {
    }

    /**
     * Test of area method, of class Tetraedro.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Tetraedro instance = null;
        double expResult = 0.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volumen method, of class Tetraedro.
     */
    @Test
    public void testVolumen() {
        System.out.println("volumen");
        Tetraedro instance = null;
        double expResult = 0.0;
        double result = instance.volumen();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
