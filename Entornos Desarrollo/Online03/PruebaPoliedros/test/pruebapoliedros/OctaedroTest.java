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
public class OctaedroTest {
    
    public OctaedroTest() {
    }

    /**
     * Test of area method, of class Octaedro.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Octaedro instance = new Octaedro(2);
        double expResult = 13.85;
        double result = instance.area();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of volumen method, of class Octaedro.
     */
    @Test
    public void testVolumen() {
        System.out.println("volumen");
        Octaedro instance = new Octaedro(2);
        double expResult = 3.77;
        double result = instance.volumen();
        assertEquals(expResult, result, 0.1);
    }
    
}
