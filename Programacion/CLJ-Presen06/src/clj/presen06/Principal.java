/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.presen06;

import java.util.ArrayList;

/**
 *
 * @author juanmi
 */
public class Principal {

    private static ES ES = new ES();
    private static ArrayList<Animal> animales = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        while (salir == false) {
            ES.escribirLn("======== MENU ========");
            ES.escribirLn(
                    "1. Añadir Animal\n"
                    + "2. Listar Animales\n"
                    + "3. Borrar Animal\n"
                    + "0. Salir"
            );
            opcion = ES.leerEntero("Introduce una opción: ");

            switch (opcion) {
                case 1:
                    // añadir animal
                    anadirAnimal();
                    break;
                case 2:
                    // listar animales
                    listAnimales();
                    break;
                case 3:
                    // borrar animal
                    borrarAnimal();
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

    private static void listAnimales() {
        for (int i = 0; i < animales.size(); i++) {
            ES.escribirLn(i+". "+animales.get(i).toString());
        }
    }

    private static void anadirAnimal() {
        Mamifero.TipoMamifero tipoMamifero;
        Mamifero.TipoAlimentacion tipoAlimentacion;
        
        boolean anadido = false;
        while (anadido == false) {
            int tipoAnimal = ES.leerEntero(
                    "Introduce tipo de animal:\n"
                    + "1. Ave\n"
                    + "2. Mamífero\n"
            );
            switch (tipoAnimal) {
                case 1:
                    animales.add(
                        new Ave(
                            ES.leerCadena("Introduce color:"),
                            ES.leerBooleano("Puede volar", "No puede volar"),
                            ES.leerCadena("Introduce nombre:"),
                            ES.leerReal("Introduce peso:", 0),
                            ES.leerEntero("Introduce edad:", 0)
                        )
                    );
                    anadido = true;
                    break;
                case 2:
                    // tipoMamifero
                    while (true) {
                        ES.escribirLn("Introduce opción:");
                        for (int i = 0; i < Mamifero.TipoMamifero.values().length; i++) {
                            ES.escribirLn(i+". "+Mamifero.TipoMamifero.values()[i]);
                        }
                        try {
                            tipoMamifero = Mamifero.TipoMamifero.values()[ES.leerEntero()];
                            System.out.println(tipoMamifero);
                            break;
                        } catch (Exception e) {
                            ES.escribirLn("Elige un número de la lista.");
                        }
                    }
                    // tipoAlimentacion
                    while (true) {
                        ES.escribirLn("Introduce opción:");
                        for (int i = 0; i < Mamifero.TipoAlimentacion.values().length; i++) {
                            ES.escribirLn(i+". "+Mamifero.TipoAlimentacion.values()[i]);
                        }
                        try {
                            tipoAlimentacion = Mamifero.TipoAlimentacion.values()[ES.leerEntero()];
                            break;
                        } catch (Exception e) {
                            ES.escribirLn("Elige un número de la lista.");
                        }
                    }
                    animales.add(
                        new Mamifero(
                            tipoAlimentacion,
                            tipoMamifero,
                            ES.leerCadena("Introduce nombre:"),
                            ES.leerReal("Introduce peso:", 0),
                            ES.leerEntero("Introduce edad:", 0)
                        )
                    );
                    anadido = true;
                    break;
                default:
                    ES.escribirLn("Elige una opción válida.");
                    break;
            }
        }
    }

    private static void borrarAnimal() {
        listAnimales();
        try {
            animales.remove(ES.leerEntero("Elige animal para borrar:", 0, animales.size()));
        } catch (Exception e) {
            ES.escribirLn("PArece que has seleccionado un animal que no está en la lista.");
        }
    }

}
