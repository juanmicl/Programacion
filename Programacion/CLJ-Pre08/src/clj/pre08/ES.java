/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    public int leerEntero() {

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
    public int leerEntero(String text) {
        escribirLn(text);
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
     * @param maximo
     * @return
     */
    public int leerEntero(String text, int minimo, int maximo) {
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
   
    public boolean leerBooleano(String opc1, String opc2) {
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
    public void escribirLn(String a) {
        System.out.println(a);
    }
    
    /**
     *
     * @param ruta
     * @param datos
     * @param sobrescribir
     * @return
     */
    public static boolean escribirArchivo(String ruta, String datos, boolean sobrescribir){
        FileWriter archivo;
        try {
            if (sobrescribir) {
                archivo = new FileWriter(ruta, false); // el true es para append
                archivo.write(datos);
            } else{
                archivo = new FileWriter(ruta, true); // el true es para append
                archivo.write("\n"+datos);
            }
            
            archivo.close();
            return true;

        } catch (IOException ex) {
            return false;
            //System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
    
    /**
     *
     * @param ruta
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String leerArchivo(String ruta) throws FileNotFoundException, IOException{
        String salida = "";
        String cadena;
        FileReader f = new FileReader(ruta);
        try (BufferedReader b = new BufferedReader(f)) {
            while ((cadena = b.readLine()) != null) {
                salida += cadena+"\n";
            }
        }
        return salida;
    }
}
