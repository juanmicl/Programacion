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
public class CLJPre07 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Archivos archivo = new Archivos();
        ArrayList<String> lineas;
        String[] datos;

        lineas = archivo.getLineas("/home/juanmi/Documentos/entrada.txt");

        for (String linea : lineas) {
            switch (linea.charAt(0)) {
                case 'M':
                    // hacemos la media split by $
                    linea = linea.substring(1);
                    datos = linea.split("\\$");
                    //System.out.println("Media: "+media(datos));
                    // que podría haber creado un constructor y meter el path dentro y hacerlo como objeto salida y entrada pero así es más rápido
                    archivo.escribir("/home/juanmi/Documentos/salida.txt", "Media: "+Float.toString(media(datos)));
                    break;
                case 'S':
                    // hacemos la suba split by $
                    linea = linea.substring(1);
                    datos = linea.split("\\$");
                    //System.out.println("Suma: "+suma(datos));
                    archivo.escribir("/home/juanmi/Documentos/salida.txt", "Suma: "+Float.toString(suma(datos)));
                    break;
                case 'B':
                    // buscamos split by $
                    linea = linea.substring(1);
                    datos = linea.split("\\$");
                    //System.out.println("Veces: "+buscar(datos));
                    archivo.escribir("/home/juanmi/Documentos/salida.txt", "Veces: "+Float.toString(buscar(datos)));
                    break;
                default:
                    System.out.println("Desconocido");
                    break;
            }

        }

    }

    private static float media (String[] datos) {
        int i = 0;
        int suma = 0;
        
        for (String dato : datos) {
            if (!"".equals(dato)) {
                suma += Float.parseFloat(dato);
            }
            i++;
        }
        return suma/i;
    }
    
    private static float suma (String[] datos) {
        int suma = 0;
        
        for (String dato : datos) {
            if (!"".equals(dato)) {
                suma += Float.parseFloat(dato);
            }
        }
        return suma;
    }
    
    private static int buscar (String[] datos) {
        String []matches = datos[2].split(datos[1]);

        return matches.length-1;
    }

}
