/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1;

import java.io.*;

/**
 *
 * @author juanmi
 */
public class SalarioMensual {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        double extras;
        double horas;
        String ntrabajador;
        int opcion;
        double precio;
        double salir;
        double total;
        salir = 0;
        while (salir == 0) {
            System.out.println("===== SALARIO MENSUAL =====");
            System.out.println("");
            System.out.println("1. Calcular salario mensual");
            System.out.println("2. Calcular salario semanal");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(bufEntrada.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del trabajador: ");
                    ntrabajador = bufEntrada.readLine();
                    System.out.println("Introduce horas semanales trabajadas: ");
                    horas = Double.parseDouble(bufEntrada.readLine());
                    System.out.println("Introduce precio por hora: ");
                    precio = Double.parseDouble(bufEntrada.readLine());
                    if (horas > 40) {
                        extras = horas - 40;
                        total = ((1.5 * precio) * extras) + (40 * precio);
                        total = total * 4;
                    } else {
                        total = (horas * precio) * 4;
                    }
                    System.out.println("Trabajador: " + ntrabajador + " | " + total + " Euros mensuales.");
                    break;
                case 2:
                    System.out.println("Introduce el nombre del trabajador: ");
                    ntrabajador = bufEntrada.readLine();
                    System.out.println("Introduce horas semanales trabajadas: ");
                    horas = Double.parseDouble(bufEntrada.readLine());
                    System.out.println("Introduce precio por hora: ");
                    precio = Double.parseDouble(bufEntrada.readLine());
                    if (horas > 40) {
                        extras = horas - 40;
                        total = ((1.5 * precio) * extras) + (40 * precio);
                    } else {
                        total = horas * precio;
                    }
                    System.out.println("Trabajador: " + ntrabajador + " | " + total + " Euros semanales.");
                    break;
                case 0:
                    salir = 1;
                    break;
                default:
                    System.out.println("Debes de elegir una opción dentro del menu.");
            }
        }
    }

}
