
import java.io.*;

public class MetrosPorSegundo {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int kilometrosh;
        System.out.println("Introduce km/h: ");
        kilometrosh = Integer.parseInt(bufEntrada.readLine());
        System.out.println("El vehículo va a una velocidad de " + kilometrosh * 0.27777777777778 + " metros por segundo.");
    }

}
