/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaec2grado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 0101001011
 */
public class PruebaEc2Grado {
    
    static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     *
     * @return @throws IOException
     */
    public static int menu() throws IOException {
        int op;
        System.out.println("MENÚ");
        System.out.println("1. Primera solución");
        System.out.println("2. Segunda solución");
        System.out.println("0. Salir");
        System.out.println("Elige opción");
        op = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        return op;
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Ec22Grado Ec2Grado = new Ec22Grado(1, 2, 1);
        System.out.println(Ec2Grado.toString());
        int opcion;
        opcion = menu();
        while ((opcion != 0)) {
            switch (opcion) {
                case 1:
                    System.out.println(Ec2Grado.primera());
                    break;
                case 2:
                    System.out.println(Ec2Grado.primera());
                    break;
                default:
                    System.out.println("Opción errónea");
            }
            //System.out.println("Pulse una tecla para continuar...");
            System.out.println("");
            opcion = menu();
        }
    }
    
}
