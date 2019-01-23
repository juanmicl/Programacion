/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarectangulo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanmi
 */
public class RectanguloTest {

    public RectanguloTest() {
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
     * Test of area method, of class Rectangulo.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangulo instance = new Rectangulo();
        double expResult = 1.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of perimetro method, of class Rectangulo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Rectangulo instance = new Rectangulo();
        double expResult = 4.0;
        double result = instance.perimetro();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of num_rect method, of class Rectangulo.
     */
    @Test
    public void testNum_rect() {
        System.out.println("num_rect");
        int expResult = 0;
        int result = Rectangulo.num_rect();
        assertEquals(expResult, result);
    }

}
