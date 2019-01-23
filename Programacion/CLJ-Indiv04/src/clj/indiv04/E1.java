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
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ES ES = new ES(); //Instancia de la clase ES
        int tamano;
        int media = 0;
        int nMayor = 0;
        int nMenor = 100;
        tamano = ES.leerEntero(0, 100, "Indica el tamaño del array: ");
        int[] numeros = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        
        for (int i = 0; i < tamano; i++) {
            media += numeros[i];
            if (numeros[i] > nMayor) {
                nMayor = numeros[i];
            }
            if (numeros[i] < nMenor) {
                nMenor = numeros[i];
            }
        }
        
        System.out.println("La media es: "+(media/tamano));
        System.out.println("El número más alto es: "+nMayor);
        System.out.println("El número más bajo es: "+nMenor);
    }
    
}
