
package clj.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio10 {
    /**
     * Programa que introducido un número indique si es positivo.
     * Si no lo es finalizará el programa pero en caso de que sea mayor que cero
     * mostrará todos los números entre los que es divisible.
     * Ejemplo: si se introduce el 20 mostrará: 10, 5, 4, 2 y 1.
     */
    public static void main(String[] args){
        
        // Declaramos variables
        int numero;
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
            
            if(numero > 0){
                // Es positivo
                System.out.println(
                    "El número "+numero+" es POSITIVO\n"
                    + "Y es divisible entre: "
                );
                // cada vez que i sea menor o = que 1 y se resta 1 cada vez
                for(int i = numero; i >= 1; i--){
                    //si el numero dividido entre i da resto 0
                    if(numero%i == 0){
                        System.out.println(i);
                    }
                }
            }else if(numero < 0){
                // Es negativo
                System.out.println("El número "+numero+" es NEGATIVO");
            }else{
                // Es cero
                System.out.println("el número es cero");
            }
        }catch(InputMismatchException e){
            System.out.println("Debes introducir SOLO números!");
        }
    }
}
