/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv04;
//import java.util.Random;
/**
 *
 * @author 0101001011
 */
public class E3 {
    public static void main(String[] args) {
        // Declaramos variables
        ES ES = new ES(); //Instancia de la clase ES    
        int opcion;
        boolean salir = false;
        
        while(salir == false){
            System.out.println("======== MENU ========");
            System.out.println(
                "1. Insertar Usuario\n"
                + "2. Modificar Usuario\n"
                + "3. Leer Usuario\n"
                + "0. Salir"
            );
            opcion = ES.leerEntero("Selecciona opción: ");
            
            switch (opcion){
                case 1:
                    String nombre = ES.leerCadena("Introduce el nombre: ");
                    String apellidos = ES.leerCadena("Introduce apellidos: ");
                    int edad = ES.leerEntero("Introduce la edad: ");
                    String dni = ES.leerCadena("Introduce el dni: ");
                    Usuario a = new Usuario(nombre, apellidos, edad, dni);
                    a.insertUsuario(1);
                    break;
                default:
                    ES.escribirLn("Debes de introducir una de las opciones listadas arriba.");
                    break;
            }
        }
    }
}
