
package clj.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio01 {
    // Identificar número positivo o negativo
    public static void main(String[] args) {
        // Declaramos variables
        int numero;
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
            
            if(numero > 0){
                System.out.println("El número "+numero+" es POSITIVO");
            }else if(numero < 0){
                System.out.println("El número "+numero+" es NEGATIVO");
            }else{
                System.out.println("El número "+numero+" es 0, ni es positivo ni es negativo");
            }
        }catch(InputMismatchException e){
            System.out.println("Debes introducir SOLO números!");
        }
    }
}
