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
            
            System.out.println("========== MENU ==========");
            System.out.println("1. Calcular mayoría de edad");
            System.out.println("2. Calcular número par o inpar");
            System.out.println("3. Cuantos días tiene un mes");
            System.out.println("4. Calcular el factorial de un número");
            System.out.println("0. Salir");
            System.out.println("==========================");
 
            try {
 
                System.out.println("Introduce una de las opciones:");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        // Calcular si es mayor de edad
                        int edad;
                        Scanner teclado1 = new Scanner(System.in);
                        System.out.println("Introduzca su edad: ");
                        edad = teclado1.nextInt();

                        if(edad>=18){
                            System.out.println("Eres mayor de edad!");
                        }else{
                            System.out.println("No eres mayor de edad!");
                        }
                        break;
                    case 2:
                        //Calcular si un numero es par o impar
                        Scanner teclado2 = new Scanner(System.in);
                        System.out.println("Introduzca un numero: ");
                        int numero2 = teclado2.nextInt();
                        if(numero2%2==0){
                             System.out.println(numero2+" es PAR");
                        }else{
                            System.out.println(numero2+" es IMPAR");
                        }
                        break;
                    case 3:
                        //Calcular cuantos días tiene un mes
                        int mes;
                        int dias;
                        Scanner teclado3 = new Scanner(System.in);
                        System.out.println("Introduzca un mes (en formato numérico): ");
                        
                        mes = teclado3.nextInt();
                        
                        //no hago switch porque hay mas lineas de codigo (y creo que así está mejor aunque el netbeans ponga un warning)
                        if(mes == 2){
                            dias = 28;
                        } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                            dias = 30;
                        } else {
                            dias = 31;
                        }
                        
                        System.out.println("El mes "+mes+" tiene "+dias+" días!");
                        
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
