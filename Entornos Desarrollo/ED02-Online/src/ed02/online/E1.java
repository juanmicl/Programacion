/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed02.online;
import java.util.Scanner;
/**
 *
 * @author juanmi
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        int n3; 
        Scanner teclado1 = new Scanner(System.in);
        
        System.out.println("Introduzca primer número: ");
        n1 = teclado1.nextInt();
        System.out.println("Introduzca segundo número: ");
        n2 = teclado1.nextInt();
        System.out.println("Introduzca tercer número: ");
        n3 = teclado1.nextInt();
        
        if (n1 < 0) {
            System.out.println(n1*n2*n3);
        } else {
            System.out.println(n1+n2+n3);
        }
    }
    
}
