
import java.io.*;

public class EurosADolares {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int dolares;
        int euros;
        System.out.println("Introduce euros: ");
        euros = Integer.parseInt(bufEntrada.readLine());
        System.out.println(euros + " euros son " + euros * 1.0831 + " dolares");
    }

}
