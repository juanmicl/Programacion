package Ejercicio2;

import java.util.Scanner;

/**
 * Clase que permite realizar operaciones de Entrada y Salida de datos
 * @author Antonio Ramos
 * @version 1.0
 */
public class ES {
    /**
     * Método que permite leer un número entero desde teclado
     * @return número entero leído desde teclado
     */
    public static int leerEntero(){
        Scanner teclado = new Scanner(System.in);
        do{
            try{
                return teclado.nextInt();
            }
            catch(Exception e){
                escribirLn("¡¡Error!! El dato introducido no es un entero.");
                teclado.nextLine();
            }
        }while (true);
    }
    
    /**
     * Método que permite leer un número entero desde teclado
     * @param mensaje texto que se quiere mostrar al usuario para pedir el dato
     * @return número entero leído desde teclado
     */
    public static int leerEntero(String mensaje){
        escribir(mensaje);
        return leerEntero();
    }
    
    /**
     * Método que permite leer un número entero desde teclado comprendido entre dos valores
     * @param mensaje texto que se quiere mostrar al usuario para pedir el dato
     * @param minimo valor mínimo que puede obtener el número leído desde teclado
     * @param maximo valor máximo que puede obtener el número leído desde teclado
     * @return número entero leído desde teclado
     */
    public static int leerEntero(String mensaje, int minimo, int maximo) {
        int numero;
        do{
            numero = leerEntero(mensaje);
            if (numero < minimo || numero > maximo)
                escribirLn("¡¡Error!! el valor no se encuentra entre " + minimo + " y " + maximo);
        }while(numero < minimo || numero > maximo);
    	return numero;
    }
    
    /**
     * Método que permite leer un número real desde teclado
     * @return número real leído desde teclado
     */
    public static float leerReal(){
        Scanner teclado = new Scanner(System.in);
        do{
            try{
                return teclado.nextFloat();
            }
            catch(Exception e){
                escribirLn("¡¡Error!! El dato introducido no es un real.");
                teclado.nextLine();
            }
        }while (true);
    }
    
    /**
     * Método que permite leer un número real desde teclado
     * @param mensaje texto que se quiere mostrar al usuario para pedir el dato
     * @return número real leído desde teclado
     */
    public static float leerReal(String mensaje){
        escribir(mensaje);
        return leerReal();
    }
    
    /**
     * Método que permite leer un número real desde teclado que sea mayor que un valor mínimo
     * @param mensaje texto que se quiere mostrar al usuario para pedir el dato
     * @param minimo valor mínimo que puede obtener el número leído desde teclado
     * @return número real leído desde teclado
     */
    public static float leerReal(String mensaje, float minimo) {
    	float numero;
        do{
            numero = leerEntero(mensaje);
            if (numero < minimo)
                escribirLn("¡¡Error!! el valor tiene que ser mayor que " + minimo);
        }while(numero < minimo);
    	return numero;
    }
    
    /**
     * Método que permite leer una cadena de caracteres desde teclado
     * @return devuelve la cadena leída desde el teclado
     */
    public static String leerCadena(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
    
    /**
     * Método que permite leer una cadena de caracteres desde teclado
     * @param mensaje texto que se quiere mostrar al usuario para pedir el dato
     * @return devuelve la cadena leída desde el teclado
     */
    public static String leerCadena(String mensaje) {
        escribir(mensaje);
    	return leerCadena();
    }
    
    /**
     * Método que permite mostrar un mensaje por pantalla
     * @param mensaje texto que se quiere mostrar
     */
    public static void escribir(String mensaje) {
        System.out.print(mensaje);
    }
    
    /**
     * Método que permite mostrar un mensaje por pantalla con un salto de línea
     * @param mensaje texto que se quiere mostrar
     */
    public static void escribirLn(String mensaje) {
        System.out.println(mensaje);
    }
}
