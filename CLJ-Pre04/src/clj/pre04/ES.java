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
    public int leerEntero(){
        return sc.nextInt();
    }
    public long leerEnteroLargo(){
        return sc.nextLong();
    }
    public float leerReal(){
        return sc.nextFloat();
    }
    public double leerRealLArgo(){
        return sc.nextDouble();
    }
    public String leerCadena(){
        return sc.next();
    }
    public Character leerCaracter(){
        return sc.next().charAt(0);
    }
    public Boolean leerBooleano(){
        return sc.nextBoolean();
    }
    
    // Métodos Salida Print, los paso a String porque como no vamos a trabajar con ellos no importa
    public void escribir(String a){
        System.out.print(a);
    }
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
