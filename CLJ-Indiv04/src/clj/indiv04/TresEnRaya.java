/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv04;

/**
 *
 * @author 0101001011
 */
public class TresEnRaya {

    static ES ES = new ES(); //Instancia de la clase ES
    private static String[][] tablero = new String[3][3];

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
     * @return
     */
    public static int comprobarGanador() {
        String linea = null;
        String cadena = "";
        int ganador = -1;

        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    linea = tablero[0][0] + tablero[0][1] + tablero[0][2];
                    break;
                case 1:
                    linea = tablero[0][0] + tablero[1][0] + tablero[2][0];
                    break;
                case 2:
                    linea = tablero[0][2] + tablero[1][2] + tablero[2][2];
                    break;
                case 3:
                    linea = tablero[2][0] + tablero[2][1] + tablero[2][2];
                    break;
                case 4:
                    linea = tablero[0][0] + tablero[1][1] + tablero[2][2];
                    break;
                case 5:
                    linea = tablero[0][2] + tablero[1][1] + tablero[2][0];
                    break;
                case 6:
                    linea = tablero[1][0] + tablero[1][1] + tablero[1][2];
                    break;
            }

            if (linea.matches("XXX")) {
                return 1;
            } else if (linea.matches("OOO")) {
                return 2;
            }
        }
        for (int i = 0; i < 3; i++) {
            cadena += tablero[i][0];
            cadena += tablero[i][1];
            cadena += tablero[i][2];
        }
        cadena = cadena.replace(" ", "");
        if (cadena.length() > 8) {
            return 0;
        }
        return ganador;
    }

    public static boolean comprobarCelda(int fila, int columna, char simbolo, boolean mostrarMensajes) {
        fila--;
        columna--;

        if (tablero[fila][columna] == " ") {
            tablero[fila][columna] = Character.toString(simbolo);
            return true;
        } else {
            if (mostrarMensajes != false) {
                ES.escribirLn("La casilla está ocupada por otra ficha.");
            }
            return false;
        }
    }

    public static void colocarFicha(String nombreJugador, char ficha) {
        int fila = 0;
        int columna = 0;
        boolean libre = false;

        while (libre == false) {
            fila = ES.leerEntero(1, 3, "Introduce la fila: ");
            columna = ES.leerEntero(1, 3, "Introduce la columna: ");
            libre = comprobarCelda(fila, columna, ficha, true);
        }

        ES.escribirLn("El jugador " + nombreJugador + " ha colocado su ficha en " + fila + "-" + columna);
    }

    public static void logicaCPU() {
        int fila;
        int columna;
        boolean libre = false;

        while (libre != true) {
            fila = (int) (Math.random() * ((3 - 1) + 1) + 1);
            columna = (int) (Math.random() * ((3 - 1) + 1) + 1);
            libre = comprobarCelda(fila, columna, 'O', false);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int opcion;
        int ganador = -1;
        boolean jugando = false;
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
                    jugando = true;
                    while (jugando) {
                        pintarTablero();
                        ES.escribirLn("Jugador 1:");
                        colocarFicha("Jugador 1", 'X');
                        ES.escribirLn("Turno de CPU");
                        ganador = comprobarGanador();
                        if (ganador == -1) {
                            logicaCPU();
                            pintarTablero();
                        }
                        ganador = comprobarGanador();
                        switch (ganador) {
                            case 0:
                                ES.escribirLn("EMPATE");
                                jugando = false;
                                break;
                            case 1:
                                ES.escribirLn("Jugador 1 Gana");
                                jugando = false;
                                break;
                            case 2:
                                ES.escribirLn("CPU Gana");
                                jugando = false;
                                break;
                            default:
                                ES.escribirLn("Siguiente turno");
                                break;
                        }
                    }
                    break;
                case 2:
                    reiniciarTablero();
                    jugando = true;
                    while (jugando) {
                        pintarTablero();
                        ES.escribirLn("Jugador 1:");
                        colocarFicha("Jugador 1", 'X');
                        pintarTablero();
                        ES.escribirLn("Jugador 2:");
                        ganador = comprobarGanador();
                        if (ganador == -1) {
                            colocarFicha("Jugador 2", 'O');
                            pintarTablero();
                        }
                        ganador = comprobarGanador();
                        switch (ganador) {
                            case 0:
                                ES.escribirLn("EMPATE");
                                jugando = false;
                                break;
                            case 1:
                                ES.escribirLn("Jugador 1 Gana");
                                jugando = false;
                                break;
                            case 2:
                                ES.escribirLn("Jugador 2 Gana");
                                jugando = false;
                                break;
                            default:
                                ES.escribirLn("Siguiente turno");
                                break;
                        }
                    }
                    break;
                default:
                    ES.escribirLn("Debes de introducir una de las opciones listadas arriba.");
                    break;
            }
        }
    }
}
