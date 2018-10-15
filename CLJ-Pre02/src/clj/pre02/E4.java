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
public class E4 {
    public static void main(String[] args) {
        //Calcular cuantos días tiene un mes
        int mes;
        int dias;
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("Introduzca un mes (en formato numérico): ");

        mes = teclado3.nextInt();

        switch (mes){
            case 2:
                dias = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            default:
                dias = 0;
                break;
        }     

        System.out.println("El mes "+mes+" tiene "+dias+" días!");
    }
}

