
package clj.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio08 {
    // Muestre la tabla de multiplicar de un número introducido por teclado.
    public static void main(String[] args){
        
        //establecemos variables
        Scanner sc = new Scanner(System.in);
        int numero;
        
        try{
            //obtenemos numero
            System.out.println("Introduce un número: ");
            numero = sc.nextInt();
            
            System.out.println("Tabla de multiplicar del "+numero);
            //mostramos tablica de multiplicar con for
            for(int i = 0; i <= 10; i++){
                System.out.println(numero+" * "+i+" = "+numero*i);
            }
        }catch(InputMismatchException e){
            System.out.println("Debes introducir SOLO números!");
        }
    }
}
