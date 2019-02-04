/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed03;
import java.io.*;
import java.math.*;

/**
 *
 * @author juanmi
 */
public class ED03 {

    static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

    /**
     *
     * @return @throws IOException
     */
    public static int menu() throws IOException {
        int op;
        System.out.println("MENÚ");
        System.out.println("1. Tetraedro");
        System.out.println("2. Cubo (hexaedro)");
        System.out.println("3. Octaedro");
        System.out.println("4. Dodecaedro");
        System.out.println("5. Icosaedro");
        System.out.println("6. Ecuación 2º Grado");
        System.out.println("7. Salir");
        System.out.println("Elige opción");
        op = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        return op;
    }

    

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        int num1;
        int num2;
        int opcion;
        opcion = menu();
        while ((opcion != 7)) {
            switch (opcion) {
                case 1:
                    Algoritmos.tetraedro(4);
                    break;
                case 2:
                    Algoritmos.cubo(4);
                    break;
                case 3:
                    Algoritmos.octaedro(4);
                    break;
                case 4:
                    Algoritmos.dodecaedro(4);
                    break;
                case 5:
                    Algoritmos.icosaedro(4);
                    break;
                case 6:
                    Algoritmos.ec2grado(1,-1,3,1);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción errónea");
            }
            System.out.println("Pulse una tecla para continuar...");
            System.out.println("");
            opcion = menu();
        }
    }
    
}
