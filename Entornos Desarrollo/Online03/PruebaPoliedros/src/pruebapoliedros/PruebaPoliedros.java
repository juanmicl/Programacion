/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapoliedros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author 0101001011
 */
public class PruebaPoliedros {
    
    static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    
    /**
     *
     * @return
     * @throws IOException
     */
    public static int menu() throws IOException {
        int op;
        System.out.println("MENÚ");
        System.out.println("1. Tetraedro");
        System.out.println("2. Cubo (hexaedro)");
        System.out.println("3. Octaedro");
        System.out.println("4. Dodecaedro");
        System.out.println("5. Icosaedro");
        System.out.println("0. Salir");
        System.out.println("Elige opción");
        op = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        return op;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int arista = 2;
        int opcion;
        opcion = menu();
        while ((opcion != 0)) {
            switch (opcion) {
                case 1:
                    Tetraedro tetraedro = new Tetraedro(arista);
                    System.out.println("area:");
                    System.out.println(tetraedro.area());
                    System.out.println("volumen:");
                    System.out.println(tetraedro.volumen());
                    break;
                case 2:
                    Cubo cubo = new Cubo(arista);
                    System.out.println("area:");
                    System.out.println(cubo.area());
                    System.out.println("volumen:");
                    System.out.println(cubo.volumen());
                    break;
                case 3:
                    Octaedro octaedro = new Octaedro(arista);
                    System.out.println("area:");
                    System.out.println(octaedro.area());
                    System.out.println("volumen:");
                    System.out.println(octaedro.volumen());
                    break;
                case 4:
                    Dodecaedro dodecaedro = new Dodecaedro(arista);
                    System.out.println("area:");
                    System.out.println(dodecaedro.area());
                    System.out.println("volumen:");
                    System.out.println(dodecaedro.volumen());
                    break;
                case 5:
                    Icosaedro icosaedro = new Icosaedro(arista);
                    System.out.println("area:");
                    System.out.println(icosaedro.area());
                    System.out.println("volumen:");
                    System.out.println(icosaedro.volumen());
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
