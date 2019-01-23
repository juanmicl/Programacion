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
public class Ejercicio06 {
    //Realice sucesivamente la suma de los números introducidos por teclado hasta que esta sea mayor o igual que 77.
    //Una vez que finalice tiene que mostrar la suma total y la cantidad de números que se han introducido.
    public static void main(String[] args) {
        
        //establecemos variables
        int numeros[] = new int[5];
        double media = 0.0;
        
        //pedimos información por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("[0] Introduzca un numero: ");
        numeros[0] = sc.nextInt();
        System.out.println("[1] Introduzca un numero: ");
        numeros[1] = sc.nextInt();
        System.out.println("[2] Introduzca un numero: ");
        numeros[2] = sc.nextInt();
        System.out.println("[3] Introduzca un numero: ");
        numeros[3] = sc.nextInt();
        System.out.println("[4] Introduzca un numero: ");
        numeros[4] = sc.nextInt();
        
        //sumamos los datos del array
        for(int i = 0; i < 5; i++){
            media += numeros[i];
        }
        
        //dividimos el total
        media /= 5;
        
        System.out.println("La media es "+media);
    }
}

