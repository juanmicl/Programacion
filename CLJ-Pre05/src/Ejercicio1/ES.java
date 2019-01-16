/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

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

    /**
     * leemos decimal por teclado mostrando mensaje y con un valor mínimo
     * @param min
     * @param text
     * @return
     */
    public float leerDecimal(int min, String text){
        float numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                numero = sc.nextFloat();
                sc.nextLine();
                if (numero < min) {
                    System.out.println("Error: El número debe de ser mayor que "+min);
                } else {
                    return numero;
                }
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo un número real.");
            }
        }
    }
}
