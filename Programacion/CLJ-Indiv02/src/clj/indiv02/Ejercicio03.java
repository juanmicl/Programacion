
package clj.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio03 {
    // Identificar si un número es mayor que otro o son iguales
    public static void main(String[] args) {
        // Declaramos variables
        int numero1;
        int numero2;
        Scanner sc = new Scanner(System.in);
        
        try{
            // obtenemos numero1
            System.out.println("Introduce un número: ");
            numero1 = sc.nextInt();
            // obtenemos numero2
            System.out.println("Introduce otro número: ");
            numero2 = sc.nextInt();
            
            if(numero1 > numero2){
                System.out.println("El número "+numero1+" es mayor que "+numero2);
            }else if(numero1 < numero2){
                System.out.println("El número "+numero1+" es menor que "+numero2);
            }else{
                System.out.println("Los números son iguales");
            }
        }catch(InputMismatchException e){
            System.out.println("Debes introducir SOLO números!");
        }
    }
}
