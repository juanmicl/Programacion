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
public class DodecaedroTest {
    
    public DodecaedroTest() {
    }
    

    /**
     * Test of area method, of class Dodecaedro.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Dodecaedro instance = new Dodecaedro(2);
        double expResult = 82.58;
        double result = instance.area();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of volumen method, of class Dodecaedro.
     */
    @Test
    public void testVolumen() {
        System.out.println("volumen");
        Dodecaedro instance = new Dodecaedro(2);
        double expResult = 61.30;
        double result = instance.volumen();
        assertEquals(expResult, result, 0.1);
    }
    
}
