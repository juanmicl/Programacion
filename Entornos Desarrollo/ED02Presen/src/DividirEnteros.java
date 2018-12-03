
import java.io.*;

public class DividirEnteros {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int division;
        int numero1;
        int numero2;
        System.out.println("Introduce número: ");
        numero1 = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Introduce número");
        numero2 = Integer.parseInt(bufEntrada.readLine());
        division = numero1 / numero2;
        System.out.println("División: " + division);
    }

}
