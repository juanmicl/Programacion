/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre02;

import java.util.Scanner;

/**
 *
 * @author juanmi
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Calcular si es mayor de edad
        int edad;
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        edad = teclado1.nextInt();

        if(edad>=18){
            System.out.println("Eres mayor de edad!");
        }else{
            System.out.println("No eres mayor de edad!");
        }
    }
}

