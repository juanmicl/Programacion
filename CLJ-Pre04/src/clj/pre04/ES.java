/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre04;

import java.util.Scanner;
/**
 *
 * @author 0101001011
 */
public class ES {
    Scanner sc = new Scanner(System.in);
    
    // Constructor vacío porque no le vamos a pasar nada
    public ES() {
    }
    
    // Métodos de entrada por teclado

    /**
     *
     * @param text
     * @return
     */
    public int leerEntero(String text){
        int numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Utiliza solo números enteros.");
            }
        }
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
    
    /**
     *
     * @param text
     * @return
     */
    public float leerReal(String text){
        float numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                numero = sc.nextFloat();
                sc.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo un número real.");
            }
        }
    }
    
    /**
     *
     * @param text
     * @return
     */
    public double leerRealLArgo(String text){
        double numero;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                numero = sc.nextDouble();
                sc.nextLine();
                return numero;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo un Real Largo.");
            }
        }
    }
    
    /**
     *
     * @param text
     * @return
     */
    public String leerCadena(String text){
        String cadena;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                cadena = sc.next();
                sc.nextLine();
                return cadena;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo una cadena de texto.");
            }
        }
    }
    
    /**
     *
     * @param text
     * @return
     */
    public Character leerCaracter(String text){
        char caracter;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                caracter = sc.next().charAt(0);
                sc.nextLine();
                return caracter;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo un caracter.");
            }
        }
    }
    
    /**
     *
     * @param text
     * @return
     */
    public Boolean leerBooleano(String text){
        boolean boleano;
        while (true) {  // se ejecuta siempre hasta que se hace un return :)          
            System.out.println(text);
            try{
                boleano = sc.nextBoolean();
                sc.nextLine();
                return boleano;
            } catch (java.util.InputMismatchException e) {
                sc.nextLine();
                System.out.println("Error: Introduce solo un caracter.");
            }
        }
    }
    
    // Métodos Salida Print, los paso a String porque como no vamos a trabajar con ellos no importa

    /**
     *
     * @param a
     */
    public void escribir(String a){
        System.out.print(a);
    }

    /**
     *
     * @param a
     */
    public void escribirLn(String a){
        System.out.println(a);
    }
    
    /*public static void main(String[] args) {
    
        ES sc = new ES();
        System.out.println(sc.leerEntero());
    } 
    // Ignorar esto de aquí.
    */ 
}
