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
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        Scanner teclado1 = new Scanner(System.in);
        
        System.out.println("Introduce primer número: ");
        n1 = teclado1.nextInt();
        System.out.println("Introduce segundo número: ");
        n2 = teclado1.nextInt();
        
        if (n1 < 0 || n2 < 0) {
            System.out.println("Debes introducir SOLO números positivos.");
        }
        
        if (n1 > n2) {
            System.out.println(n1); 
        } else {
            System.out.println(n2); 
        }
    }
    
}
