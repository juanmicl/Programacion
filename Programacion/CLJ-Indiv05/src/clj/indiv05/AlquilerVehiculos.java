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
    
    private final int MAX_VEHICULOS;
    private final int MAX_CLIENTES;
    private final int MAX_ALQUILERES;
    static Vehiculo[] vehiculo;

    public AlquilerVehiculos() {
        this.MAX_VEHICULOS = 10;
        this.MAX_CLIENTES = 10;
        this.MAX_ALQUILERES = 10;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ES ES = new ES();
        System.out.println(ES.leerEntero("holi caracoli"));
    }
    
    /**
     * Nos devuelve si existe un cliente con dicho dni o null en caso contrario
     * @param dni
     * @return 
     */
    private static Cliente getCliente(String dni) {
        return null;
    }
    
    private static void anadirCliente(String dni) {
        
    }
    
    private static void borrarCliente(String dni) {
        
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
