/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv04;

/**
 *
 * @author 0101001011
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ES ES = new ES(); //Instancia de la clase ES
        int tamano;
        int pares = 0;
        int impares = 0;
        tamano = ES.leerEntero(0, 100, "Indica el tamaño del array: ");
        int[] numeros = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        
        for (int i = 0; i < tamano; i++) {
            if (numeros[i]%2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
    }
    
}
