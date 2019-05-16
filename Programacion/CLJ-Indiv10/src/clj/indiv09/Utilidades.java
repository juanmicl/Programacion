/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv09;

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

    /*
    public Boolean comprobarMatricula(String matricula) {
        matricula = matricula.toUpperCase();
        return matricula.matches("^[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}$") || matricula.matches("^[A-Z]{2}[0-9]{4}[A-Z]{2}$");
    }
    
    public Boolean comprobarDni(String dni) {
        dni = dni.toUpperCase();
        return dni.matches("^[0-9]{8}[A-Z]$");
    }
    
    public Boolean comprobarCodigoPostal(String cp) {
        return cp.matches("^[01-52]{2}[0-9]{3}$");
    }
    
    public Boolean comprobarTelefonoEsp(String telefono) {
        return telefono.matches("^34[6789][0-9]{8}$");
    } */
    public String comprobarMatricula(String matricula) {
        matricula = matricula.toUpperCase();
        if (!matricula.matches("^[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}$") && !matricula.matches("^[A-Z]{2}[0-9]{4}[A-Z]{2}$")) {
            return null;
        } else {
            return matricula;
        }
    }

    public String comprobarDni(String dni) {
        dni = dni.toUpperCase();
        if (!dni.matches("^[0-9]{8}[A-Z]$")) {
            return null;
        } else {
            return dni;
        }
    }

    public String comprobarCodigoPostal(String cp) {
        if (!cp.matches("^[01-52]{2}[0-9]{3}$")) {
            return null;
        } else {
            return cp;
        }
    }

    public String comprobarTelefonoEsp(String telefono) {
        if (!telefono.matches("^34[6789][0-9]{8}$")) {
            return null;
        } else {
            return telefono;
        }

    }
}

