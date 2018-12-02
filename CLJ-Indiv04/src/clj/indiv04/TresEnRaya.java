/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv04;
//import java.util.Random;

import java.awt.Event;
import javafx.scene.input.KeyCode;

/**
 *
 * @author 0101001011
 */
public class TresEnRaya {

    static ES ES = new ES(); //Instancia de la clase ES
    static Character[][] tablero = new Character[3][3];

    /**
     *
     */
    static public void reiniciarTablero() {
        for (int i = 0; i < 3; i++) {
            tablero[i][0] = ' ';
            tablero[i][1] = ' ';
            tablero[i][2] = ' ';
        }
    }

    /**
     *
     */
    static public void pintarTablero() {
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
            opcion = ES.leerEntero("Selecciona opción: ");

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
