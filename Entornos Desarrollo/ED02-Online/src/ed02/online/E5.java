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
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        int aprobados = 0;
        int suspensos = 0;
        Scanner teclado1 = new Scanner(System.in);
        
        System.out.println("Introduce nota: ");
        n1 = teclado1.nextInt();
        System.out.println("Introduce nota: ");
        n2 = teclado1.nextInt();
        
        if (n1 < n2) {
            System.out.println("La nota mas baja es: "+n1);
            System.out.println("La nota mas alta es: "+n2);
        } else {
            System.out.println("La nota mas baja es: "+n2);
            System.out.println("La nota mas alta es: "+n1);
        }
        
        if (n1 < 5) {
            suspensos++;
        } else {
            aprobados++;
        }
        
        if (n2 < 5) {
            suspensos++;
        } else {
            aprobados++;
        }
        
        System.out.println("El promedio es: "+((n1+n2)/2));
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Suspensos: "+suspensos);
    }
    
}
