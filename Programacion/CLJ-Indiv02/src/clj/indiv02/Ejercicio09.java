
package clj.indiv02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio09 {
    /**
     * Basándonos en el ejercicio 8 nos diga si queremos mostrar otra tabla de multiplicar.
     * Si el usuario introduce una 's' volverá a comenzar el programa y pedirá un 
     * nuevo número del que mostrar la tabla de multiplicar y realizará nuevamente 
     * la pregunta de si se quiere mostrar una tabla de multiplicar.
     */
    public static void main(String[] args){
        
        //establecemos variables
        Scanner sc = new Scanner(System.in);
        int numero;
        char opcion = 's';
        
        // si opcion es s que se vuelva a repetir el proceso
        while(opcion == 's'){
            try{
                //obtenemos numero
                System.out.println("Introduce un número: ");
                numero = sc.nextInt();

                System.out.println("Tabla de multiplicar del "+numero);
                //mostramos tablica de multiplicar con for
                for(int i = 0; i <= 10; i++){
                    System.out.println(numero+" * "+i+" = "+numero*i);
                }
                
                System.out.println("Si desea mostrar otra tabla puse la tecla 's' ");
                opcion = sc.next().charAt(0);

            }catch(InputMismatchException e){
                System.out.println("Debes introducir SOLO números!");
                // le quitamos el valor a la variable opción por posibles bucles infinitos
                opcion = 'o';
            }
        }
    }
}
