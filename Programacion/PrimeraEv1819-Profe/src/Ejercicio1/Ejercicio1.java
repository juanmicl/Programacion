package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

// Importo la clase ES del ejercicio 2. Así no duplico los métodos.
import Ejercicio2.ES;

/**
 * Clase que resuelve el ejercicio 1 del examen de la primera evaluación de programación.
 * @author Antonio Ramos
 * @version 1.0
 */
public class Ejercicio1 {
    
    /**
     * Método principal.
     * Calcula el resultado de una serie de sumas y multiplicaciones de valores positivos. 
     * Cuando se pulsa 0 finaliza el programa.
     * @param args argunmentos que se pueden pasar durante la llamada al programa. En este ejercicio no se utilizan.
     */
    public static void main(String[] args) 
    {
        int numSumas = 0, numMultiplicaciones = 0;
        float numero = 0, resultado = 0;
        
        do
        {
            numero = ES.leerReal("Introduzca un número mayor o igual a cero: ", 0);
            if (numero > 10)
            {
                resultado += numero;
                numSumas++;
            }
            else if (numero > 0)
            {
                resultado *= numero;
                numMultiplicaciones++;
            }
        }while (numero != 0);   
        
        ES.escribirLn("El resultado final es " + resultado + ". Para ello se han empleado " + numSumas + " sumas y " 
                + numMultiplicaciones + " multiplicaciones");
    }
}
