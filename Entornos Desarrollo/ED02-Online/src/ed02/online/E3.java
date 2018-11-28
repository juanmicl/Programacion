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
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner teclado1 = new Scanner(System.in);
        
        System.out.println("Múltiplos de 2 o 3? ");
        n = teclado1.nextInt();
        
        for (int i = 1; i <= 100; i++) {
            if (i%n == 0) {
                System.out.println(i);
            }
        }
    }
    
}
