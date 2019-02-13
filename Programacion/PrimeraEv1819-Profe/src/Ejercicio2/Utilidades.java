package Ejercicio2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que implementa diversos métodos que pueden ayudar a resolver problemas
 * @author Antonio Ramos
 * @version 1.0
 */
public class Utilidades {
    /**
     * Método que permite comprobar si una matrícula pasada por parámetro tiene un formato correcto
     * @param matricula matrícula que se quiere validar
     * @return verdadero si cumple con el formato español de matrículas. Falso en el resto de casos
     */
    public static boolean comprobarMatricula(String matricula) {
        matricula = matricula.toUpperCase();
        
        Pattern patron = Pattern.compile("([0-9]{4}[B-Z&&[^EIOU]]{3})|([A-Z]{1,2}[0-9]{4}[A-Z]{1,2}) ");
        Matcher validar = patron.matcher(matricula);
        return validar.matches();
    }
    
    /**
     * Método que permite validar un teléfono pasado por parámetro
     * @param numeroTelefono número de teléfono a validar
     * @return verdadero si cumple con el formato español de teléfonos. Falso en el resto de casos
     */
    public static boolean comprobarTelefonoEsp(String numeroTelefono) {
    	Pattern patron = Pattern.compile("34[6-9][0-9]{8}");
        Matcher validar = patron.matcher(numeroTelefono);
        return validar.matches();
    }
}
