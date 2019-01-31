/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv05;


/**
 *
 * @author 0101001011
 */
public class AlquilerVehiculos {
    
    private static final int MAX_VEHICULOS = 10;
    private static final int MAX_CLIENTES = 10;
    private static final int MAX_ALQUILERES = 10;
    //private static Vehiculo[] vehiculo;
    
    private static ES ES = new ES();
    private static Utilidades Utilidades = new Utilidades();
    static Cliente[] clientes = new Cliente[MAX_CLIENTES];
    Vehiculo[] vehiculos = new Vehiculo[MAX_VEHICULOS];
    Alquiler[] alquileres = new Alquiler[MAX_ALQUILERES];
    
    private static int posClientes = 0;
    private static int posVehiculos = 0;
    private static int posAlquileres = 0;
    
    public AlquilerVehiculos() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        while (salir == false) {
            System.out.println("======== MENU ========");
            System.out.println(
                "1. Añadir Cliente\n"
                + "2. Ver Cliente\n"
                + "3. Borrar Cliente\n"
                + "4. Añadir Vehículo\n"
                + "5. Ver Vehículo.\n"
                + "6. Borrar Vehículo\n"
                + "0. Salir"
            );
            opcion = ES.leerEntero("Introduce una opción: ");

            switch (opcion) {
                case 1:
                    anadirCliente(ES.leerCadena("Introduce el DNI: "));
                    break;
                case 2:
                    getCliente(ES.leerCadena("Introduce el DNI: "));
                    break;
                case 3:
                    borrarCliente(ES.leerCadena("Introduce el DNI: "));
                    break;
                case 4:
                    
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    ES.escribirLn("Debes de introducir una de las opciones listadas arriba.");
                    break;
            }
        }
    }
    
    /**
     * Nos devuelve si existe un cliente con dicho dni o null en caso contrario
     * @param dni
     * @return 
     */
    private static Cliente getCliente(String dni) {
        boolean esta = false;
        int posicion = 0;
        dni = Utilidades.comprobarDni(dni);
        for (int i = 0; i < posClientes; i++) {
            if(clientes[i].getDni().equals(dni)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == true) {
            ES.escribirLn(clientes[posicion].toString());           
        } else {
            ES.escribirLn("Este DNI no está en el array.");
        }
        return null;
    }
    
    /**
     * Añadir cliente al array
     * @param dni 
     */
    private static void anadirCliente(String dni) {
        boolean esta = false;
        dni = Utilidades.comprobarDni(dni);
        if (posClientes < MAX_CLIENTES) {
            for (int i = 0; i < posClientes; i++) {
                if(clientes[i].getDni().equals(dni)) {
                    esta = true;
                    break;
                }
            }
            if (esta == false) {
                // Introducimos cliente
                clientes[posClientes] = new Cliente(
                    dni,
                    ES.leerCadena("Introducir Nombre: "),
                    ES.leerCadena("Introducir Dirección: "),
                    ES.leerCadena("Intrducir Localidad: "),
                    ES.leerCadena("Introducir Codigo Postal")
                );
                posClientes++;
            } else {
                ES.escribirLn("Este DNI ya está en el array.");
            }     
        } else {
            ES.escribirLn("No se pueden añadir más clientes, array completo.");
        }
    }
    
    private static void borrarCliente(String dni) {
        boolean esta = false;
        int posicion = 0;
        dni = Utilidades.comprobarDni(dni);
        for (int i = 0; i < posClientes; i++) {
            if(clientes[i].getDni().equals(dni)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == true) {
            clientes[posicion] = null;
        } else {
            ES.escribirLn("Este DNI no está en el array.");
        }
    }
    
    private static Vehiculo getVehiculo(String matricula) {
        return null;
    }
    
    private static void anadirVehiculo(String matricula) {
        
    }
    
    private static void borrarVehiculo(String matricula) {
        
    }
    
    private static void nuevoAlquiler(Cliente cliente, Vehiculo vehiculo) {
        
    }
    
    private static void cerrarAlquiler(Cliente cliente, Vehiculo vehiculo) {
        
    }
    
}
