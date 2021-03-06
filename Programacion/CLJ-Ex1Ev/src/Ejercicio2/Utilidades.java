/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;
/**
 *
 * @author juanmi
 */
public class Utilidades {
    Scanner sc = new Scanner(System.in);
    
    // Constructor vacío porque no le vamos a pasar nada
    public Utilidades() {
    }
    
    public String comprobarMatricula(String matricula){
        while (!matricula.matches("^[0-9]{4}[A-Z]{3}$") && !matricula.matches("^[A-Z]{2}[0-9]{4}[A-Z]{2}$")) {
            System.out.println("Formato Matricula incorrecto.\n"
                    + "Insertar Matricula: ");
            matricula = sc.next();
        }
        return matricula;
    }
    
    public String comprobarTelefonoEsp(String telefono){
        while (!telefono.matches("^34[6789][0-9]{8}$")) {
            System.out.println("Formato Teléfono incorrecto.\n"
                    + "Insertar Teléfono: ");
            telefono = sc.next();
        }
        return telefono;
    }

}
