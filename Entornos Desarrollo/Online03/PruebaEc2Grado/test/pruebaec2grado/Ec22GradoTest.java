/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaec2grado;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 0101001011
 */
public class Ec22GradoTest {
    
    public Ec22GradoTest() {
    }

    /**
     * Test of primera method, of class Ec22Grado.
     * @throws java.lang.Exception
     */
    @Test
    public void testPrimera() throws Exception {
        System.out.println("primera");
        Ec22Grado instance = new Ec22Grado(1, 2, 1);
        double expResult = -1.0;
        double result = instance.primera();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of segunda method, of class Ec22Grado.
     * @throws java.lang.Exception
     */
    @Test
    public void testSegunda() throws Exception {
        System.out.println("segunda");
        Ec22Grado instance = new Ec22Grado(1, 2, 1);
        double expResult = -1.0;
        double result = instance.segunda();
        assertEquals(expResult, result, 0.0);
    }
    
}
