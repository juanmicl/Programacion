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
public class IcosaedroTest {
    
    public IcosaedroTest() {
    }

    /**
     * Test of area method, of class Icosaedro.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Icosaedro instance = new Icosaedro(2);
        double expResult = 34.64;
        double result = instance.area();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of volumen method, of class Icosaedro.
     */
    @Test
    public void testVolumen() {
        System.out.println("volumen");
        Icosaedro instance = new Icosaedro(2);
        double expResult = 17.45;
        double result = instance.volumen();
        assertEquals(expResult, result, 0.1);
    }
    
}
