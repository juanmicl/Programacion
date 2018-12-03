/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;

import java.util.Scanner;
/**
 *
 * @author 0101001011
 */
public class Utilidades {
    Scanner sc = new Scanner(System.in);
    
    // Constructor vacío porque no le vamos a pasar nada
    public Utilidades() {
    }
    
    // Métodos de entrada por teclado

    /**
     *
     * @param nif
     * @return 
     */
    public boolean comprobarNIF(String nif){
        return true;
    }
    
    public boolean comprobarReferenciaProducto(String ref){
        return ref.matches("^[^OL]{3}[0-9]{2}$");
    }
    
    /**
     *
     * @param text
     * @return
     */
    public long leerEnteroLargo(String text){
        long numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                numero = sc.nextLong();
                sc.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Utiliza solo números enteros o Largos.");
            }
        }
    }
    
    
    /*public static void main(String[] args) {
    
        ES sc = new ES();
        System.out.println(sc.leerEntero());
    } 
    // Ignorar esto de aquí.
    */ 
}
