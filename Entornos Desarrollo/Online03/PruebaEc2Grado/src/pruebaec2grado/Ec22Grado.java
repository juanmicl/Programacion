/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaec2grado;

import java.io.IOException;

/**
 *
 * @author 0101001011
 */
public class Ec22Grado {

    private int a;
    private int b;
    private int c;

    public Ec22Grado(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double primera() throws IOException {
        int d;
        double x1;
        d = (int) (Math.pow(b, 2) - 4 * a * c);
        if (d < 0) {
            System.out.println("La ecuación no tiene soluciones reales");
            return 0;
        } else {
            if (d == 0) {
                x1 = -b / (2 * a);
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
            }
        }
        return x1;
    }

    public double segunda() throws IOException {
        int d;
        double x2;
        d = (int) (Math.pow(b, 2) - 4 * a * c);
        if (d < 0) {
            System.out.println("La ecuación no tiene soluciones reales");
            return 0;
        } else {
            if (d == 0) {
                x2 = -b / (2 * a);
            } else {
                x2 = (-b - Math.sqrt(d)) / (2 * a);
            }
        }
        return x2;
    }

    @Override
    public String toString() {
        return "Ec22Grado{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
