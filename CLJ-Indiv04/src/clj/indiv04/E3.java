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
        int id;
        boolean salir = false;
        
        while(salir == false){
            System.out.println("======== MENU ========");
            System.out.println(
                "1. Insertar Usuario\n"
                + "2. Borrar Usuario\n"
                + "3. Leer Usuario\n"
                + "0. Salir"
            );
            opcion = ES.leerEntero(0, 3, "Selecciona opción: ");
            
            switch (opcion){
                case 1:
                    id = ES.leerEntero(1, 10, "Elige ID para este usuario (1-10): ");
                    if (id <= 10 && id > 0) {
                        String nombre = ES.leerCadena("Introduce el nombre: ");
                        String apellidos = ES.leerCadena("Introduce apellidos: ");
                        int edad = ES.leerEntero(1, 120, "Introduce la edad: ");
                        String dni = ES.leerCadena("Introduce el dni: ");
                        Usuario a = new Usuario(nombre, apellidos, edad, dni);
                        a.insertUsuario(id);
                        /*
                        * en php puedo poner if(a.insertUsuario(id)) pero aquí parece que no.
                        * una solución posible sería darle un return con true o false si se ha insertado o no.
                        * si sabes algo del tipo de if que te he puesto arriba en java comentamelo pls.
                        */
                    } else {
                        ES.escribirLn("El ID debe de estar entre 1 y 10");
                    }
                    
                    break;
                case 2:
                    id = ES.leerEntero(1, 10, "Introduce el ID del usuario que quiera borrar (1-10): ");
                    Usuario b = new Usuario(null, null, 0, null);
                    b.insertUsuario(id);
                    break;
                case 3:
                    id = ES.leerEntero(1, 10, "Introduce el ID del usuario que quiera borrar (1-10): ");
                    Usuario c = new Usuario(null, null, 0, null);
                    System.out.println(c.leerUsuario(id));
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    ES.escribirLn("Debes de introducir una de las opciones listadas arriba.");
                    break;
            }
        }
    }
}
