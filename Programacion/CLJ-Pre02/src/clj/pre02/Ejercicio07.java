
package clj.pre02;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author juanmi
 */
public class Ejercicio07 {
    /*
    * Pida un número entero positivo por teclado y realice la división entre 3 del mismo,
    * mediante restas. Al finalizar ha de indicar el cociente y el resto resultante.
    */
    public static void main(String[] args) {
        
        // establecemos variables
        int numero;
        int cociente = 0;
        int resto = 0;
        Scanner sc = new Scanner(System.in);    

        try{
            
            // pedimos información por teclado
            System.out.println("Introduzca un numero: ");
            numero = sc.nextInt();
            
            // comprobamos si es negativo y si lo es nos salimos
            if(numero < 0){
                System.out.println("El número introducido debe de ser positivo.");
                System.exit(0);
            }
            // si es mayor o igual que tres realizamos las operaciones indicadas
            while(numero >= 3){
                numero -= 3;
                cociente++;
                // sacamos el resto
                if(numero < 3){
                    resto = numero;
                }
            }
            System.out.println("El cociente es " + cociente + " y el resto " + resto);
            
        }catch(InputMismatchException e){
            System.out.println("Solo puedes introducir números!");
        }
    }
}

