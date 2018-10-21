
package clj.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio05 {
    // Realizar distintas funciones en función de las cifras introducidas
    public static void main(String[] args) {
        // Declaramos variables
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        try{
            // mostramos menú
            System.out.println(
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Salir\n"
            );
            // obtenemos opcion para el menu
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Has elegido la opción SUMA");
                    break;
                case 2:
                    System.out.println("Has elegido la opción RESTA");
                    break;
                case 3:
                    System.out.println("Has elegido la opción MULTIPLICACIÓN");
                    break;
                case 4:
                    System.out.println("Has elegido la opción DIVISIÓN");
                    break;
                case 5:
                    System.out.println("Has elegido la opción SALIR");
                    break;
                default:
                    System.out.println("Este número no coincide con ninguna de las opciones disponibles");
                    break;
            }
        }catch(InputMismatchException e){
            System.out.println("Debes introducir SOLO números!");
        }
    }
}
