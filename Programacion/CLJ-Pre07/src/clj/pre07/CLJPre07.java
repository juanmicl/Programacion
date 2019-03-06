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
        
        lineas = archivo.getLineas("/home/juanmi/Documentos/entrada.txt");
        
        for (String linea : lineas) {
            switch (linea.charAt(0)) {
                case 'M':
                    // hacemos la media split by $
                    String[] datos = linea.split("\\$");
                    
                    for (String dato : datos) {
                        System.out.println(dato);
                    }
                    
                    break;
                case 'S':
                    System.out.println("Esto es una suma\n");
                    break;
                case 'B':
                    System.out.println("Buscar palabra\n");
                    break;
                default:
                    System.out.println("Desconocido");
                    break;
            }

        }
        
        
    }
    
}
