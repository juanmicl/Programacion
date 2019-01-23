
package clj.pre02;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author juanmi
 */
public class Ejercicio08 {
    /*
    * Genere un número entero aleatorio mediante la función random de la 
    * clase Math y que el usuario tenga que adivinarlo. Cada vez que se introduzca 
    * un número el programa a de indicar si es mayor o menor que el número que hay 
    * que descubrir. El programa solo finalizará una vez que el usuario escriba el número correcto. 
    */
    public static void main(String[] args) {
        
        // declaramos variables
        int numero = 0;
        int random = 0;
        Scanner teclado = new Scanner(System.in);
        random = (int) (Math.random() * 50);

        //con do-while consigo adivinar el número
        do {
            // para pillar excepciones luego con catch
            try {
                // pedimos el numerico
                System.out.println("Introduce un número entre el 0 y 50 ");
                numero = teclado.nextInt();
                
                // le decimos si es mayor menor o si ha acertado
                if (numero > random) {
                    System.out.println("El número introducido es mayor");
                } else if (numero < random) {
                    System.out.println("El número introducido es menor");
                } else {
                    System.out.println("¡BINGO!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Tienes que introducir un número");
            }
        } while (numero != random);
        // sacamos el numero por pantalla
        System.out.println("El número random es el " + random);
    }
}

