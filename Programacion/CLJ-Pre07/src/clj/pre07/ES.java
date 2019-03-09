/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre07;

import java.util.Scanner;

/**
 *
 * @author juanmi
 */
public class ES {
    static Scanner sc = new Scanner(System.in);
    // Constructor vacío porque no le vamos a pasar nada
    public ES() {
    }

    // Métodos de entrada por teclado
    /**
     * Leer entero solamente
     * @return
     */
    public static int leerEntero() {

        while (true) {          
            try {
                return sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                escribirLn("Error: Utiliza solo números enteros.");
            }
        }
    }

    /**
     * Leer entero mostrando un texto
     * @param text
     * @return
     */
    public static int leerEntero(String text) {
        escribirLn(text);
        return leerEntero();
    }

    /**
     * Leer entero mostrando un texto y comparamos si es menor que minimo
     * @param minimo
     * @param text
     * @return
     */
    public static int leerEntero(String text, int minimo) {
        int numero;
        while (true) {         
            numero = leerEntero(text);
            if (numero >= minimo) {
                return numero;
            } else {
                escribirLn("Error: El número debe de ser mayor que " + minimo);
            }
        }
    }
    
    /**
     * Leer entero mostrando un texto y comparamos si es menor que minimo
     * @param minimo
     * @param text
     * @return
     */
    public static int leerEntero(String text, int minimo, int maximo) {
        int numero;
        while (true) {         
            numero = leerEntero(text);
            if (numero >= minimo && numero <= maximo) {
                return numero;
            } else {
                escribirLn("Error: El número debe de ser mayor que " + minimo+" y menor que"+maximo);
            }
        }
    }
    
    /**
     *
     * @param text
     * @return
     */
    public String leerCadena(String text) {
        while (true) {        
            escribirLn(text);
            try {
                return sc.next();
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                escribirLn("Error: Introduce solo una cadena de texto.");
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
    public float leerReal(String text, float min) {
        float numero;
        while (true) {
            escribirLn(text);
            try {
                numero = sc.nextFloat();
                sc.nextLine();
                if (numero < min) {
                    escribirLn("Error: El número debe de ser mayor que " + min);
                } else {
                    return numero;
                }
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                escribirLn("Error: Introduce solo un número real.");
            }
        }
    }
   
    public static boolean leerBooleano(String opc1, String opc2) {
        int opcion;
        while (true) {
            escribirLn("Introduce alguna de las opciones:");
            escribirLn("1. "+opc1);
            escribirLn("2. "+opc2);
            opcion = leerEntero();
            if (opcion >= 1 && opcion <= 2) {
                return opcion == 1;
            } else {
                escribirLn("Error: Elige una de las opciones listadas.");
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
    public static void escribirLn(String a) {
        System.out.println(a);
    }
}
