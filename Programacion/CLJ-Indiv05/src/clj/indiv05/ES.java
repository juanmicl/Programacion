/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv05;

import java.util.Scanner;

/**
 *
 * @author juanmi
 */
public class ES {

    Scanner sc = new Scanner(System.in);

    // Constructor vacío porque no le vamos a pasar nada
    public ES() {
    }

    // Métodos de entrada por teclado
    /**
     * Leer entero solamente
     * @return
     */
    public int leerEntero() {
        int numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            try {
                numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Utiliza solo números enteros.");
            }
        }
    }

    /**
     * Leer entero mostrando un texto
     * @param text
     * @return
     */
    public int leerEntero(String text) {
        System.out.println(text);
        return leerEntero();
    }

    /**
     * Leer entero mostrando un texto y comparamos si es menor que minimo
     * @param minimo
     * @param text
     * @return
     */
    public int leerEntero(String text, int minimo) {
        int numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            numero = leerEntero(text);
            if (numero >= minimo) {
                return numero;
            } else {
                System.out.println("Error: El número debe de ser mayor que " + minimo);
            }
        }
    }

    /**
     * leemos decimal por teclado mostrando mensaje y con un valor mínimo
     *
     * @param min
     * @param text
     * @return
     */
    public float leerDecimal(int min, String text) {
        float numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try {
                numero = sc.nextFloat();
                sc.nextLine();
                if (numero < min) {
                    System.out.println("Error: El número debe de ser mayor que " + min);
                } else {
                    return numero;
                }
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo un número real.");
            }
        }
    }

    /**
     *
     * @param text
     * @return
     */
    public long leerEnteroLargo(String text) {
        long numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try {
                numero = sc.nextLong();
                sc.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Utiliza solo números enteros o Largos.");
            }
        }
    }

    /**
     *
     * @param text
     * @return
     */
    public String leerCadena(String text) {
        String cadena;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try {
                cadena = sc.next();
                sc.nextLine();
                return cadena;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo una cadena de texto.");
            }
        }
    }

    /**
     * escribimos string
     *
     * @param a
     */
    public void escribir(String a) {
        System.out.print(a);
    }

    /**
     * escribimos string con salto de linea
     *
     * @param a
     */
    public void escribirLn(String a) {
        System.out.println(a);
    }
}
