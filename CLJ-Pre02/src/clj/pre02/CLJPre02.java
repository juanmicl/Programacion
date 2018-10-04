/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre02;

import java.util.Scanner;

/**
 *
 * @author juanmi
 */
public class CLJPre02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MENU
        Scanner sn = new Scanner(System.in);
        boolean salir = false; //Para el while si queremos salir
        int opcion; //Declaramos la variable de la opción del usuario
 
        while (!salir) {
 
            System.out.println("1. Calcular mayoría de edad");
            System.out.println("2. Calcular número par o inpar");
            System.out.println("3. Cuantos días tiene un mes");
            System.out.println("4. Calcular el factorial de un número");
            System.out.println("0. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        // Calcular si es mayor de edad
                        int edad;
                        Scanner teclado = new Scanner(System.in);
                        System.out.print("Introduzca su edad: ");
                        edad = Integer.parseInt(teclado.nextLine());

                        if(edad>=18){
                            System.out.println("Eres mayor de edad!");
                        }else{
                            System.out.println("No eres mayor de edad!");
                        }
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 0 y 4");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }   
}
