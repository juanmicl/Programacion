
import java.io.*;

public class OperacionesAritmeticas {

    static BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

    /**
     *
     * @return @throws IOException
     */
    public static int menu() throws IOException {
        int op;
        System.out.println("Calcular el area de:");
        System.out.println("1. Tetraedro");
        System.out.println("2. Cubo (hexaedro)");
        System.out.println("3. Octaedro");
        System.out.println("4. Dodecaedro");
        System.out.println("5. Icosaedro");
        System.out.println("6. Salir");
        System.out.println("Elige opción");
        op = Integer.parseInt(bufEntrada.readLine());
        System.out.println("");
        return op;
    }

    /**
     *
     * @throws IOException
     */
    public static void tetraedro() throws IOException {
        int arista;
        int resutado;
        System.out.println("Introduce la arista");
        arista = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Area: " + (Math.pow(arista, 2)) * Math.sqrt(3));
        System.out.println("Volumen: " + ((Math.pow(arista, 3)) * Math.sqrt(2)) / 12);
    }

    /**
     *
     * @throws IOException
     */
    public static void cubo() throws IOException {
        int arista;
        int resutado;
        System.out.println("Introduce la arista");
        arista = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Area: " + 6 * (Math.pow(arista, 2)));
        System.out.println("Volumen: " + Math.pow(arista, 3));
    }

    /**
     *
     * @throws IOException
     */
    public static void octaedro() throws IOException {
        int arista;
        int resutado;
        System.out.println("Introduce la arista");
        arista = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Area: " + (2 * (Math.pow(arista, 2))) * Math.sqrt(3));
        System.out.println("Volumen: " + ((Math.pow(arista, 3)) * Math.sqrt(2)) / 3);
    }

    /**
     *
     * @throws IOException
     */
    public static void dodecaedro() throws IOException {
        int arista;
        int resutado;
        System.out.println("Introduce la arista");
        arista = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Area: " + (3 * (Math.pow(arista, 2))) * (Math.sqrt(25 + (10 * Math.sqrt(5)))));
        System.out.println("Volumen: " + ((Math.pow(arista, 3)) / 4) * (15 + (7 * Math.sqrt(5))));
    }

    /**
     *
     * @throws IOException
     */
    public static void icosaedro() throws IOException {
        int arista;
        int resutado;
        System.out.println("Introduce la arista");
        arista = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Area: " + 5 * (Math.pow(arista, 2)) * Math.sqrt(3));
        System.out.println("Volumen: " + (5 * (Math.pow(arista, 3)) / 12) * (3 + Math.sqrt(5)));
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
                    tetraedro();
                    break;
                case 2:
                    cubo();
                    break;
                case 3:
                    octaedro();
                    break;
                case 4:
                    dodecaedro();
                    break;
                case 5:
                    icosaedro();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción errónea");
            }
            System.out.println("Pulse una tecla para continuar...");
            System.in.read(); //espera un Enter
            System.out.println("");
            opcion = menu();
        }
    }

}
