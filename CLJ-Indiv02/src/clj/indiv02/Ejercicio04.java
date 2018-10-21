
package clj.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio04 {
    // Realizar distintas funciones en función de las cifras introducidas
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
                // Si el primer número es mayor que el segundo realice la resta.
                numero1 -= numero2;
                System.out.println("El resultado de la resta es: "+numero1);
            }else if(numero1 < numero2){
                // Si el primer número es menor que el segundo realice la suma.
                numero1 += numero2;
                System.out.println("El resultado de la suma es: "+numero1);
            }else{
                // Si los números son iguales realice la multiplicación.
                numero1 *= numero2;
                System.out.println("El resultado de la multiplicación es: "+numero1);
            }
        }catch(InputMismatchException e){
            System.out.println("Debes introducir SOLO números!");
        }
    }
}
