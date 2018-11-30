/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre04;
/**
 *
 * @author juanmi
 */
public class E2 {
    public E2() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ES ES = new ES(); //Instancia de la clase ES
        String tipo;
        int n; // le he llamado n porque en el enunciado se le llama n. PD: no me quites puntos XD
        n = ES.leerEntero("¿Cuántos números desea generar? ");
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        
        for (int i = 0; i < n; i++) {
            if (numeros[i]%2 == 0) {
                tipo = "par";
            } else {
                tipo = "impar";
            }
            System.out.println("Posición "+i+" | número "+numeros[i]+" | "+tipo);
        }
    }
    
}
