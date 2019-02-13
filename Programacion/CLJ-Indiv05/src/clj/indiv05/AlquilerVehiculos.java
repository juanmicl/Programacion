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
    
    static final int MAX_VEHICULOS = 50;
    static final int MAX_CLIENTES = 50;
    static final int MAX_ALQUILERES = 50;
    
    private static ES ES = new ES();
    private static Utilidades Utilidades = new Utilidades();
    private static Cliente[] clientes = new Cliente[MAX_CLIENTES];
    private static Vehiculo[] vehiculos = new Vehiculo[MAX_VEHICULOS];
    private static Alquiler[] alquileres = new Alquiler[MAX_ALQUILERES];
    
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
            ES.escribirLn("======== MENU ========");
            ES.escribirLn(
                "1. Añadir Cliente\n"
                + "2. Listar Clientes\n"
                + "3. Borrar Cliente\n"
                + "4. Añadir Vehículo\n"
                + "5. Listar Vehículos.\n"
                + "6. Borrar Vehículo\n"
                + "7. Añadir Alquiler\n"
                + "8 Cerrar Alquiler\n"
                + "0. Salir"
            );
            opcion = ES.leerEntero("Introduce una opción: ");

            switch (opcion) {
                case 1:
                    anadirCliente(ES.leerCadena("Introduce el DNI: "));
                    break;
                case 2:
                    if (posClientes != 0) {
                        for (int i = 0; i < posClientes; i++) {
                            ES.escribirLn(clientes[i].toString());
                            ES.escribirLn("----------------------");
                        }
                    } else {
                        ES.escribirLn("Todavía no se ha introducido ningún cliente en el array.");
                    }
                    
                    break;
                case 3:
                    borrarCliente(ES.leerCadena("Introduce el DNI: "));
                    break;
                case 4:
                    anadirVehiculo(ES.leerCadena("Introduce Matrícula: "));
                    break;
                case 5:
                    if (posVehiculos != 0) {
                        for (int i = 0; i < posVehiculos; i++) {
                            ES.escribirLn(vehiculos[i].toString());
                            ES.escribirLn("----------------------");
                        }
                    } else {
                        ES.escribirLn("Todavía no se ha introducido ningún vehículo en el array.");
                    }
                    break;
                case 6:
                    borrarVehiculo(ES.leerCadena("Introduce Matrícula: "));
                    break;
                case 7:
                    nuevoAlquiler(
                        getCliente(ES.leerCadena("Introduce DNI del cliente: ")),
                        getVehiculo(ES.leerCadena("Introduce Matrícula del cliente: "))
                    );
                    break;
                case 8:
                    cerrarAlquiler(
                        getCliente(ES.leerCadena("Introduce DNI del cliente: ")),
                        getVehiculo(ES.leerCadena("Introduce Matrícula del cliente: "))
                    );
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
        if (esta == false) {
            return null;
        }
        return clientes[posicion]; 
    }
    
    /**
     * Añadir cliente al array
     * @param dni 
     */
    private static void anadirCliente(String dni) {
        Cliente cliente;
        dni = Utilidades.comprobarDni(dni);
        if (posClientes < MAX_CLIENTES) {
            cliente = getCliente(dni);
            if (cliente == null) {
                // Introducimos cliente
                clientes[posClientes] = new Cliente(
                    dni,
                    ES.leerCadena("Introducir Nombre: "),
                    ES.leerCadena("Introducir Dirección: "),
                    ES.leerCadena("Intrducir Localidad: "),
                    Utilidades.comprobarCodigoPostal(ES.leerCadena("Introducir Codigo Postal"))
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
            desplazarClientes(posicion);
        } else {
            ES.escribirLn("Este DNI no está en el array.");
        }
    }
    
    private static Vehiculo getVehiculo(String matricula) {
        boolean esta = false;
        int posicion = 0;
        matricula = Utilidades.comprobarMatricula(matricula);
        for (int i = 0; i < posVehiculos; i++) {
            if(vehiculos[i].getMatricula().equals(matricula)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == false) {
            //ES.escribirLn("Esta Matricula no está en el array.");
            return null;
        }
        return vehiculos[posicion];
    }
    
    private static void anadirVehiculo(String matricula) {
        Vehiculo vehiculo;
        matricula = Utilidades.comprobarMatricula(matricula);
        if (posVehiculos < MAX_CLIENTES) {
            vehiculo = getVehiculo(matricula);
            if (vehiculo == null) {
                // Introducimos Vehiculo
                vehiculos[posVehiculos] = new Vehiculo(
                    matricula,
                    ES.leerCadena("Introducir Marca: "),
                    ES.leerCadena("Introducir Modelo: "),
                    ES.leerEntero("Intrducir Cilindrada: ")
                );
                posVehiculos++;
            } else {
                ES.escribirLn("Esta Matricula ya está en el array.");
            }     
        } else {
            ES.escribirLn("No se pueden añadir más vehiculos, array completo.");
        }
    }
    
    private static void borrarVehiculo(String matricula) {
        boolean esta = false;
        int posicion = 0;
        matricula = Utilidades.comprobarMatricula(matricula);
        for (int i = 0; i < posVehiculos; i++) {
            if(vehiculos[i].getMatricula().equals(matricula)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == true) {
            desplazarVehiculos(posicion);
        } else {
            ES.escribirLn("Esta Matrícula no está en el array.");
        }
    }
    
    private static void nuevoAlquiler(Cliente cliente, Vehiculo vehiculo) {
        try {
            if (vehiculo.isDisponible() == true) {
                alquileres[posAlquileres] = new Alquiler(cliente, vehiculo);
                posAlquileres++;
                ES.escribirLn("Alquiler creado correctamente.");
            } else {
                ES.escribirLn("Este vehículo no está disponible.");
            }
        } catch (Exception e) {
            ES.escribirLn("Datos incorrectos.");
        }
    }
    
    private static void cerrarAlquiler(Cliente cliente, Vehiculo vehiculo) {
        boolean coincide = false;
        int alquilerPos = 0;
        
        try {
            
            String matricula = vehiculo.getMatricula();
            String dni = cliente.getDni();
            
            for (int i = 0; i < posAlquileres; i++) {
                if (matricula.equals(alquileres[i].getVehiculo().getMatricula())) {
                    alquilerPos = i;
                }
            }

            for (int i = 0; i < posAlquileres; i++) {
                if (dni.equals(alquileres[i].getCliente().getDni())) {
                    if (alquileres[i].getCliente().getDni().equals(alquileres[alquilerPos].getCliente().getDni())) {
                       coincide = true;
                    }
                }
            }

            if (coincide == true) {
                ES.escribirLn(alquileres[alquilerPos].getCliente().getDni());
                desplazarAlquileres(alquilerPos);
                vehiculo.setDisponible(true);
            } else {
                ES.escribirLn("Esta matrícula y DNI no se encuentran en el mismo alquiler");
            }
        } catch (Exception e) {
            ES.escribirLn("Datos incorrectos.");
        }
        
    }
    
    private static void desplazarClientes(int posicion){
        for(int i = posicion; i < clientes.length-1; i++){
            clientes[i] = clientes[i+1];
            if(clientes[posicion] == null)
                break;
        }
        clientes[clientes.length-1] = null;
    }
    
    private static void desplazarVehiculos(int posicion){
        for(int i = posicion; i < vehiculos.length-1; i++){
            vehiculos[i] = vehiculos[i+1];
            if(vehiculos[posicion] == null)
                break;
        }
        vehiculos[vehiculos.length-1] = null;
    }
    
    private static void desplazarAlquileres(int posicion){
        for(int i = posicion; i < alquileres.length-1; i++){
            alquileres[i] = alquileres[i+1];
            if(alquileres[posicion] == null)
                break;
        }
        alquileres[alquileres.length-1] = null;
    }
    
}
