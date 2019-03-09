/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre07;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author juanmi
 */
public class Archivos {

    public ArrayList<String> getLineas(String archivo) throws FileNotFoundException, IOException {
        ArrayList<String> lineas = new ArrayList<>();
        String cadena;
        FileReader f = new FileReader(archivo);
        try (BufferedReader b = new BufferedReader(f)) {
            while ((cadena = b.readLine()) != null) {
                lineas.add(cadena);
                //System.out.println(cadena);
            }
        }
        return lineas;
    }

    public void escribir(String archivo, String datos) throws FileNotFoundException, IOException {

        FileWriter fichero;
        try {
            fichero = new FileWriter(archivo, true); // el true es para append
            // Escribimos linea a linea en el fichero
            fichero.write("\n"+datos);
            fichero.close();
            System.out.println("Archivo escrito correctamente en: "+archivo);

        } catch (IOException ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
