
import java.io.*;

public class MinutosASegundos {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int minutos;
        int segundos;
        System.out.println("Introduce los minutos: ");
        minutos = Integer.parseInt(bufEntrada.readLine());
        System.out.println(minutos + " minutos son " + minutos * 60 + " segundos");
    }

}
