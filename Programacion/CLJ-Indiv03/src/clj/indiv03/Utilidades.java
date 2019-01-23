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
    public String comprobarNIF(String nif){
        System.out.println("Seleccione:\n"
                + "1. Español mayor de 18 años.\n"
                + "2. Extranjero.");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                while (!nif.matches("^[0-9]{8}[A-Z]$")) {
                    System.out.println("Formato NIF incorrecto.\n"
                            + "Insertar NIF: ");
                    nif = sc.next();
                }
                break;
            case 2:
                while (!nif.matches("^[MXYZ][0-9]{7}[A-Z]$")) {
                    System.out.println("Formato NIF Extranjero incorrecto.\n"
                            + "Insertar NIF Extranjero: ");
                    nif = sc.next();
                }
                break;
        }
        return nif;
    }
    
    public String comprobarReferenciaProducto(){
        System.out.println("Insertar Referencia: ");
        String ref = sc.next();
        while(!ref.matches("^[^OL]{3}[0-9]{2}$")) {
            System.out.println("Formato de Referencia incorrecto.\n"
                    + "Insertar Referencia: ");
            ref = sc.next();
        }
        return ref;
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
