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
public class TresEnRaya {

    static ES ES = new ES(); //Instancia de la clase ES
    static String[][] tablero = new String[3][3];

    /**
     *
     */
    public static void reiniciarTablero() {
        for (int i = 0; i < 3; i++) {
            tablero[i][0] = " ";
            tablero[i][1] = " ";
            tablero[i][2] = " ";
        }
    }

    /**
     *
     */
    public static void pintarTablero() {
        ES.escribirLn(
                "-------------\n"
                + "| " + tablero[0][0] + " | " + tablero[0][1] + " | " + tablero[0][2] + " |\n"
                + "-------------\n"
                + "| " + tablero[1][0] + " | " + tablero[1][1] + " | " + tablero[1][2] + " |\n"
                + "-------------\n"
                + "| " + tablero[2][0] + " | " + tablero[2][1] + " | " + tablero[2][2] + " |\n"
                + "-------------\n"
        );
    }
    
    /**
     *
     * @param a
     * @return
     */
    public static int comprobarGanador(Character a) {
        String linea = null;
        String cadena = "";
        int ganador = 0;
        
        for (int i = 0; i < 3; i++) {
            cadena += tablero[i][0];
            cadena += tablero[i][1];
            cadena += tablero[i][2];
        }
        
        if (cadena.length() > 8) {
            return ganador;
        }
        
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    linea = tablero[0][0]+tablero[0][1]+tablero[0][2];
                    break;
                case 1:
                    linea = tablero[0][0]+tablero[1][0]+tablero[2][0];
                    break;
                case 2:
                    linea = tablero[0][2]+tablero[1][2]+tablero[2][2];
                    break;
                case 3:
                    linea = tablero[2][0]+tablero[2][1]+tablero[2][2];
                    break;
                case 4:
                    linea = tablero[0][0]+tablero[1][1]+tablero[2][2];
                    break;
                case 5:
                    linea = tablero[0][2]+tablero[1][1]+tablero[2][0];
                    break;
            }
        }
        if (linea == "XXX") {
            ganador = 1;
        } else if (linea == "OOO") {
            ganador = 2;
        }
        return ganador;
    }
    
    public static boolean comprobarCelda(int fila, int columna, char simbolo, boolean mostrarMensajes){
        if (tablero[fila][columna] ==  " ") {
            tablero[fila][columna] = Character.toString(simbolo);
            return true;
        } else {
            if (mostrarMensajes != false) {
                ES.escribirLn("La casilla está ocupada por otra ficha.");
            }
            return false;
        }
    }
    
    public static void colocarFicha(String nombreJugador, char ficha){
        int fila;
        int columna;
        boolean libre = false;
        
        fila = ES.leerEntero(1, 3, "Introduce la fila: ");
        columna = ES.leerEntero(1, 3, "Introduce la columna: ");
        
        while (libre) {
            libre = comprobarCelda(fila, columna, ficha, true);
        } 
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        while (salir == false) {
            System.out.println("======== MENU ========");
            System.out.println(
                    "0. Salir del juego.\n"
                    + "1. Jugador vs CPU\n"
                    + "2. Jugador 1 vs Jugador 2\n"
            );
            opcion = ES.leerEntero(0, 2, "Selecciona opción: ");

            switch (opcion) {
                case 0:
                    salir = true;
                    break;
                case 1:
                    reiniciarTablero();
                    pintarTablero();
                    break;
                case 2:
                    break;
                default:
                    ES.escribirLn("Debes de introducir una de las opciones listadas arriba.");
                    break;
            }
        }
    }
}
