package ev3;

public class Utilidades {
    public static boolean comprobarDni(String dni){
        dni = dni.toUpperCase();
        return dni.matches("^[0-9]{8}[A-Z]$");
    }
}
