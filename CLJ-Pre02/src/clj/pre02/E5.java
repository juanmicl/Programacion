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
public class E5 {
    public static void main(String[] args) {
        //Calcular factorial
        long factorial = 1; //long porque si no en cifras grandes no cabe con int
        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = teclado4.nextInt();
        for(int i = num; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial es "+factorial);
    }
}

