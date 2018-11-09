/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre03;

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
    
    
    public static void main(String[] args) {
    
        ES sc = new ES();
        System.out.println(sc.leerEntero());
    }
}
