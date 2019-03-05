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
public class CuboTest {
    
    public CuboTest() {
    }
    

    /**
     * Test of area method, of class Cubo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Cubo instance = new Cubo(2);
        double expResult = 24.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of volumen method, of class Cubo.
     */
    @Test
    public void testVolumen() {
        System.out.println("volumen");
        Cubo instance = new Cubo(2);
        double expResult = 8.0;
        double result = instance.volumen();
        assertEquals(expResult, result, 0.1);
    }
    
}
