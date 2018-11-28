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
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado1 = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        n = teclado1.nextInt();
        
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    
}
