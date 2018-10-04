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
public class CLJPre02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String edad;
       Scanner teclado = new Scanner(System.in);
       System.out.print("Introduzca su edad: ");
       edad = teclado.nextLine();
       System.out.println("Tu edad es " + edad + "!");
       //System.out.print(teclado);
    }
    
}
