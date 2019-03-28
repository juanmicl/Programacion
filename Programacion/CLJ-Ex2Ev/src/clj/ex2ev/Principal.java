/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.ex2ev;

import java.io.IOException;

/**
 * @version 0.1
 * @author juanmi
 */
public class Principal {
    
    private static ES ES = new ES();
    // ARRAYS //
    private static Ordenador [] ordenadores = new Ordenador[50];
    private static Periferico [] perifericos = new Periferico[50];
    
    /**
     * Aquí se encuentra el menú de nuestro programa
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        int opcion;
        boolean salir = false;
        
        while (salir == false) {
            ES.escribirLn("======== MENU ========");
            ES.escribirLn(
                "1. Cargar datos\n"
                + "2. Guardar datos\n"
                + "3. Añadir producto\n" // no disponible
                + "4. Borrar producto\n"
                + "5. Mostrar datos de un producto\n"
                + "0. Salir"
            );
            opcion = ES.leerEntero("Introduce una opción: ");

            switch (opcion) {
                case 1:
                    cargarDatos();
                    break;
                case 2:
                    guardarDatos();
                    break;
                case 3:
                    ES.escribirLn("Esta función todavía no está disponible.");
                    break;
                case 4:
                    borrarProducto();
                    break;
                case 5:
                    mostrarProducto();
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
    
    /**
     * Carga los datos de un archivo de texto, en este caso datos.txt
     * @throws IOException 
     */
    private static void cargarDatos() throws IOException{
        
        String[] txt;
        String[] elemento;
        
        txt = ES.leerArchivo("").split("\n");
        for (String linea : txt) {
            if (linea.matches("^O\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)$") || linea.matches("^P\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)\\|(.*)$")) {
                elemento = linea.split("\\|");
                if (elemento[0].equals("O")) {
                    // ORDENADOR
                    for (int i = 0; i < txt.length; i++) {
                        ordenadores[i] = new Ordenador(
                            elemento[1],
                            Integer.parseInt(elemento[2]),
                            Integer.parseInt(elemento[3]),
                            Enumerados.TipoDispositivo.DIGITAL,
                            Enumerados.Corriente.CONTINUA,
                            elemento[1],
                            elemento[1],
                            Integer.parseInt(elemento[8]),
                            Integer.parseInt(elemento[9]),
                            Integer.parseInt(elemento[10])
                        );
                    }
                            
                } else if (elemento[0].equals("P")) {
                    // PERIFERICO
                    for (int i = 0; i < txt.length; i++) {
                        perifericos[i] = new Periferico(
                            Integer.parseInt(elemento[1]),
                            elemento[2],
                            Enumerados.TipoDispositivo.DIGITAL,
                            Enumerados.Corriente.CONTINUA,
                            elemento[5],
                            elemento[6],
                            Integer.parseInt(elemento[7]),
                            Integer.parseInt(elemento[8]),
                            Integer.parseInt(elemento[9])
                        );
                    }   
                }
            } 
        }
    }
    
    /**
     * Guarda los datos en un archivo de texto, en este caso datos.txt
     */
    private static void guardarDatos(){
        // ordenadores
        for (Ordenador ordenador : ordenadores) {
            if (ordenador != null) {
                ES.escribirArchivo("", ordenador.formatoGuardado(), true);
            }
        }
        
        // perifericos
        for (Periferico periferico : perifericos) {
            if (periferico != null) {
                ES.escribirArchivo("", periferico.formatoGuardado(), true);
            }
        }
    }
    
    /**
     * Borra un producto del array
     */
    private static void borrarProducto(){
        
        int elemento;
        
        ES.escribirLn("Qué desea borrar?");
        if (ES.leerBooleano("Ordenador", "Periferico")) {
            // ordenador
            for (int i = 0; i < ordenadores.length; i++) {
                ES.escribirLn(i+". "+ordenadores[i].toString());
            }
            elemento = ES.leerEntero("introduce qué nº de elemento quieres borrar: ", 0, ordenadores.length);
            ordenadores[elemento] = null;
        } else {
            // periferico
            for (int i = 0; i < perifericos.length; i++) {
                ES.escribirLn(i+". "+perifericos[i].toString());
            }
            elemento = ES.leerEntero("introduce qué nº de elemento quieres borrar: ", 0, perifericos.length);
            perifericos[elemento] = null;
        }
        
    }
    
    /**
     * Muestra un producto por pantalla
     */
    private static void mostrarProducto(){
        String codigo;
        boolean mostrado;
        
        codigo = ES.leerCadena("Introduce código del producto a mostrar: ");
        
        for (Ordenador ordenador : ordenadores) {
            if (ordenador == null) {
                continue;
            }
            
            if (ordenador.getCodigo().equals(codigo)) {
                ES.escribirLn(ordenador.formatoGuardado());
                mostrado = true;
                break;
            }
        }
        
        for (Periferico periferico : perifericos) {
            if (periferico==null) {
                continue;
            }
            if (periferico.getCodigo().equals(codigo)) {
                ES.escribirLn(periferico.formatoGuardado());
                mostrado = true;
                break;
            }
        }
    }
}
