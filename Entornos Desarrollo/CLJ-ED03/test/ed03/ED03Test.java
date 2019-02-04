/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed03;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanmi
 */
public class ED03Test {
    
    public ED03Test() {
    }

    /**
     * Test of tetraedro method, of class ED03.
     * @throws java.lang.Exception
     */
    @Test
    public void testTetraedro() throws Exception {
        double expResult = 27.71;
        double result = Algoritmos.tetraedro(4);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of cubo method, of class ED03.
     * @throws java.lang.Exception
     */
    @Test
    public void testCubo() throws Exception {  
        int expResult = 96;
        int result = Algoritmos.cubo(4);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of octaedro method, of class ED03.
     * @throws java.lang.Exception
     */
    @Test
    public void testOctaedro() throws Exception {
        double expResult = 55.42;
        double result = Algoritmos.octaedro(4);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of dodecaedro method, of class ED03.
     * @throws java.lang.Exception
     */
    @Test
    public void testDodecaedro() throws Exception {
        double expResult = 330.33;
        double result = Algoritmos.dodecaedro(4);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of icosaedro method, of class ED03.
     * @throws java.lang.Exception
     */
    @Test
    public void testIcosaedro() throws Exception {
        double expResult = 138.56;
        double result = Algoritmos.icosaedro(4);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of ec2grado method, of class ED03.
     * @throws java.lang.Exception
     */
    @Test
    public void testEc2grado() throws Exception {
        double expResult = -1;
        double result = Algoritmos.ec2grado(1,4,3,1);
        assertEquals(expResult, result, 0.1);
    }
    
}
