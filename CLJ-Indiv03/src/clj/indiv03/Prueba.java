/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;
import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.Random;
/**
 *
 * @author 0101001011
 */
public class Prueba {
    public static void main(String[] args) {
        // Declaramos variables
        Utilidades Utilidades = new Utilidades(); //Instancia de la clase ES
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        Usuario a = new Usuario("", "", 0, "");
        Producto b = new Producto("", "", 0);
        
        while(salir == false){
            System.out.println("======== MENU ========");
            System.out.println(
                "1. Insertar Usuario\n"
                + "2. Insertar Producto\n"
                + "3. Modificar Usuario\n"
                + "4. Modificar Producto\n"
                + "5. Leer Usuario\n"
                + "6. Leer Producto\n"
                + "0. Salir"
            );
            try{
                opcion = sc.nextInt();
                switch(opcion){
                    case 1:
                        try {       
                            System.out.println("Insertar Nombre: ");
                            a.setNombre(sc.next());
                            System.out.println("Insertar Apellidos: ");
                            a.setApellidos(sc.next());
                            System.out.println("Insertar Edad: ");
                            a.setEdad(sc.nextInt());
                            System.out.println("Insertar NIF: ");
                            a.setDni(Utilidades.comprobarNIF(sc.next()));
                            System.out.println(a);
                        } catch (Exception e) {
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                        }
                        break;
                    case 2:
                        try {
                            b.setReferencia("123");
                            //b.setReferencia(Utilidades.comprobarReferenciaProducto());
                            System.out.println("Insertar Nombre: ");
                            b.setNombre(sc.next());
                            System.out.println("Insertar Unidades: ");
                            b.setUnidades(sc.nextInt());
                            System.out.println(b);
                        } catch (InputMismatchException e){
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                        }
                        break;
                    case 3:
                        System.out.println(
                            "1. Modificar Nombre\n"
                            + "2. Modificar Apellidos\n"
                            + "3. Modificar Edad\n"
                            + "4. Modificar DNI"
                        );
                        try {
                            switch (sc.nextInt()) {
                                case 1:
                                    a.setNombre(sc.next());
                                    break;
                                case 2:
                                    a.setApellidos(sc.next());
                                    break;
                                case 3:
                                    a.setEdad(sc.nextInt());
                                    break;
                                case 4:
                                    a.setDni(sc.next());
                                    break;
                                default:
                                    System.out.println("ERROR! Debes introducir un número indicado en el menú.");
                                    break;
                            }
                        } catch (InputMismatchException e){
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                        } 
                        break;
                    case 4:
                        System.out.println(
                            "1. Modificar Referencia\n"
                            + "2. Modificar Nombre\n"
                            + "3. Modificar Unidades"
                        );
                        try {
                            switch (sc.nextInt()) {
                                case 1:
                                    b.setReferencia(Utilidades.comprobarReferenciaProducto());
                                    break;
                                case 2:
                                    b.setNombre(sc.next());
                                    break;
                                case 3:
                                    b.setUnidades(sc.nextInt());
                                    break;
                                default:
                                    System.out.println("ERROR! Debes introducir un número indicado en el menú.");
                                    break;
                            }
                        } catch (InputMismatchException e){
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                        } 
                        break;
                    case 5:
                        System.out.println(
                            "1. Leer Nombre\n"
                            + "2. Leer Apellidos\n"
                            + "3. Leer Edad\n"
                            + "4. Leer DNI"
                        );
                        try {
                            switch (sc.nextInt()) {
                                case 1:
                                    System.out.println(a.getNombre());
                                    break;
                                case 2:
                                    System.out.println(a.getApellidos());
                                    break;
                                case 3:
                                    System.out.println(a.getEdad());
                                    break;
                                case 4:
                                    System.out.println(a.getDni());
                                    break;
                                default:
                                    System.out.println("ERROR! Debes introducir un número indicado en el menú.");
                                    break;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                        }
                        break;
                    case 6:
                        System.out.println(
                            "1. Leer Referencia\n"
                            + "2. Leer Nombre\n"
                            + "3. Leer Unidades"
                        );
                        try {
                            switch (sc.nextInt()) {
                                case 1:
                                    System.out.println(b.getReferencia());
                                    break;
                                case 2:
                                    System.out.println(b.getNombre());
                                    break;
                                case 3:
                                    System.out.println(b.getUnidades());
                                    break;
                                default:
                                    System.out.println("ERROR! Debes introducir un número indicado en el menú.");
                                    break;
                            }
                        } catch (InputMismatchException e){
                            System.out.println("ERROR! Debes de introducir datos válidos.");
                        } 
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("ERROR! Debes introducir un número indicado en el menú.");
                        break;      
                }
            } catch (InputMismatchException e){
                System.out.println("ERROR! Debes de introducir SOLO Números.");
                salir = true;
            }
        }
    }
}
