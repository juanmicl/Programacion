/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed03;

import java.io.IOException;

/**
 *
 * @author juanmi
 */
public class Algoritmos {
    /**
     *
     * @param arista
     * @return 
     * @throws IOException
     */
    public static double tetraedro(int arista) throws IOException {
        double resultado = (Math.pow(arista, 2)) * Math.sqrt(3);
        return resultado;
        
    }

    /**
     *
     * @param arista
     * @return 
     * @throws IOException
     */
    public static int cubo(int arista) throws IOException {
        int resultado = (int) (6 * (Math.pow(arista, 2)));
        return resultado;
    }

    /**
     *
     * @param arista
     * @return 
     * @throws IOException
     */
    public static double octaedro(int arista) throws IOException {
        double resultado = (2 * (Math.pow(arista, 2))) * Math.sqrt(3);
        return resultado;
    }

    /**
     *
     * @param arista
     * @return 
     * @throws IOException
     */
    public static double dodecaedro(int arista) throws IOException {
        double resultado = (3 * (Math.pow(arista, 2))) * (Math.sqrt(25 + (10 * Math.sqrt(5))));
        return resultado;
    }

    /**
     *
     * @param arista
     * @return 
     * @throws IOException
     */
    public static double icosaedro(int arista) throws IOException {
        double resultado = 5 * (Math.pow(arista, 2)) * Math.sqrt(3);
        return resultado;

    }
    
    /**
     *
     * @param a
     * @param b
     * @param c
     * @param x
     * @return
     * @throws IOException
     */
    public static double ec2grado(int a, int b, int c, int x) throws IOException {
        int d;
        double x1;
        double x2 = 0;
        d = (int) (Math.pow(b,2)-4*a*c);
        if (d<0) {
                System.out.println("La ecuación no tiene soluciones reales");
                return 0;
        } else {
                if (d==0) {
                        x1 = -b/(2*a);
                } else {
                        x1 = (-b+Math.sqrt(d))/(2*a);
                        x2 = (-b-Math.sqrt(d))/(2*a);
                }
        }
        if (x == 1) {
            return x1;
        } else {
            return x2;
        }
    }
}
