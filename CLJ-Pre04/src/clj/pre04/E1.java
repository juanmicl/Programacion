/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre04;
//import java.util.Scanner;
/**
 *
 * @author juanmi
 */
public class E1 {
    public E1() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
        ES ES = new ES(); //Instancia de la clase ES
        int[] numeros = new int[5];
        int total = 0;
        
        for (int i = 0; i < 5; i++) {
            numeros[i] = ES.leerEntero("Introduce el número de la posición "+i+": ");
        }
        
        for (int i = 0; i < 5; i++) {
            total += numeros[i];
        }
        
        System.out.println("El total de la suma es: "+total);
    }
    
}
