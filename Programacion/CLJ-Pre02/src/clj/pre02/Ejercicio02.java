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
public class Ejercicio02 {
    public static void main(String[] args) {
        //Calcular si un numero es par o impar
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero2 = teclado2.nextInt();
        if(numero2%2==0){
             System.out.println(numero2+" es PAR");
        }else{
            System.out.println(numero2+" es IMPAR");
        }
    }
}

