/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv06;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author 0101001011
 */
public class AlquilerVehiculos {
    
    private static ES ES = new ES();
    private static Utilidades Utilidades = new Utilidades();
    // ARRAY LISTS //
    private static ArrayList<Cliente> clientes = new ArrayList();
    private static ArrayList<Vehiculo> vehiculos = new ArrayList();
    private static ArrayList<Alquiler> alquileres = new ArrayList();
    // ARRAY LISTS FIN //
    
    public AlquilerVehiculos() {
    }
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int opcion;
        boolean salir = false;
        Cliente cliente;
        Vehiculo vehiculo;
        
        leerDatos();

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
                + "8. Cerrar Alquiler\n"
                + "9. Guardar Cambios\n"
                + "0. Salir"
            );
            opcion = ES.leerEntero("Introduce una opción: ");

            switch (opcion) {
                case 1:
                    anadirCliente(ES.leerCadena("Introduce el DNI: "));
                    break;
                case 2:
                    if (!clientes.isEmpty()) {
                        for(int i = 0; i< clientes.size(); i++) {
                            ES.escribirLn(clientes.get(i).toString());
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
                    if (!vehiculos.isEmpty()) {
                        for(int i = 0; i< vehiculos.size(); i++) {
                            ES.escribirLn(vehiculos.get(i).toString());
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
                    cliente = getCliente(ES.leerCadena("Introduce DNI del cliente: "));
                    vehiculo = getVehiculo(ES.leerCadena("Introduce Matrícula del cliente: "));
                    if (cliente != null && vehiculo != null) {
                            nuevoAlquiler(cliente, vehiculo);
                    } else {
                        ES.escribirLn("La matrícula o el DNI no se encuentran en el array");
                    }
                    break;
                case 8:
                    cliente = getCliente(ES.leerCadena("Introduce DNI del cliente: "));
                    vehiculo = getVehiculo(ES.leerCadena("Introduce Matrícula del cliente: "));
                    if (cliente != null && vehiculo != null) {
                            cerrarAlquiler(cliente, vehiculo);
                    } else {
                        ES.escribirLn("La matrícula o el DNI no se encuentran en el array");
                    }
                    break;
                case 9:
                    guardarDatos();
                    break;
                case 0:
                    if (ES.leerBooleano("Guardar cambios", "Descartar cambios")) {
                        guardarDatos();
                    }
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
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getDni().equalsIgnoreCase(dni)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == false) {
            //ES.escribirLn("Este DNI no está en el array.");
            return null;
        } else {
            return clientes.get(posicion);
        }
    }
    
    /**
     * Añadir cliente al array
     * @param dni 
     */
    private static void anadirCliente(String dni) {
        Cliente cliente;
        dni = Utilidades.comprobarDni(dni);
        cliente = getCliente(dni);
        if (cliente == null) {
            // Introducimos cliente
            clientes.add(new Cliente(
                dni,
                ES.leerCadena("Introducir Nombre: "),
                ES.leerCadena("Introducir Dirección: "),
                ES.leerCadena("Intrducir Localidad: "),
                Utilidades.comprobarCodigoPostal(ES.leerCadena("Introducir Codigo Postal"))
            ));
        } else {
            ES.escribirLn("Este DNI ya está en el array.");
        } 
    }
    
    private static void borrarCliente(String dni) {
        boolean esta = false;
        int posicion = 0;
        dni = Utilidades.comprobarDni(dni);
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getDni().equalsIgnoreCase(dni)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == true) {
            clientes.remove(posicion);
        } else {
            ES.escribirLn("Este DNI no está en el array.");
        }
    }
    
    private static Vehiculo getVehiculo(String matricula) {
        boolean esta = false;
        int posicion = 0;
        matricula = Utilidades.comprobarMatricula(matricula);
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == false) {
            //ES.escribirLn("Esta Matricula no está en el array.");
            return null;
        } else {
            return vehiculos.get(posicion);
        }
    }
    
    private static void anadirVehiculo(String matricula) {
        matricula = Utilidades.comprobarMatricula(matricula);
        Enumerados.CajaCambios cajaCambios;
        Enumerados.TipoCombustible tipoCombustible;
        Enumerados.Tamanio tamanio;
        
        if (getVehiculo(matricula) == null) {
            boolean anadido = false;
            while (anadido == false) {
                int tipoVehiculo = ES.leerEntero(
                    "Introduce tipo de vehiculo:\n"
                    + "1. Deportivo\n"
                    + "2. Familiar\n"
                    + "3. Furgoneta"
                );
                switch (tipoVehiculo) {
                    case 1:
                        // Introducimos Deportivo
                        if(ES.leerEntero("Introduce opción:\n1. Automática\n2. Manual",1, 2) == 1) {
                            cajaCambios = Enumerados.CajaCambios.AUTOMATICA;
                        } else {
                            cajaCambios = Enumerados.CajaCambios.MANUAL;
                        }
                        while (true) {
                            ES.escribirLn("Introduce opción:");
                            for (int i = 0; i < Enumerados.TipoCombustible.values().length; i++) {
                                ES.escribirLn(i+". "+Enumerados.TipoCombustible.values()[i]);
                            }
                            try {
                                tipoCombustible = Enumerados.TipoCombustible.values()[ES.leerEntero()];
                                break;
                            } catch (Exception e) {
                                ES.escribirLn("Elige un número de la lista.");
                            }
                        }
                        vehiculos.add(new Deportivo(
                            ES.leerBooleano("Descapotable", "Normal"),
                            cajaCambios,
                            ES.leerEntero("Introduce nº de puertas", 3, 5),
                            tipoCombustible,
                            matricula,
                            ES.leerCadena("Introduce marca:"),
                            ES.leerCadena("Introduce modelo:"),
                            ES.leerEntero("Introduce cilindrada:")
                        ));
                        anadido = true;
                        break;
                    case 2:
                        // Introducimos Familiar
                        while (true) {
                            ES.escribirLn("Introduce opción:");
                            for (int i = 0; i < Enumerados.TipoCombustible.values().length; i++) {
                                ES.escribirLn(i+". "+Enumerados.TipoCombustible.values()[i]);
                            }
                            try {
                                tipoCombustible = Enumerados.TipoCombustible.values()[ES.leerEntero()];
                                break;
                            } catch (Exception e) {
                                ES.escribirLn("Elige un número de la lista.");
                            }
                        }
                        vehiculos.add(new Familiar(
                            ES.leerEntero("Introduce nº plazas:", 4, 7),
                            ES.leerBooleano("Con silla bebé", "Sin silla bebé"),
                            ES.leerEntero("Introduce nº de puertas", 3, 10),
                            tipoCombustible,
                            matricula,
                            ES.leerCadena("Introduce marca:"),
                            ES.leerCadena("Introduce modelo:"),
                            ES.leerEntero("Introduce cilindrada:")
                        ));
                        anadido = true;
                        break;
                    case 3:
                        // Introducimos Furgoneta
                        while (true) {
                            ES.escribirLn("Introduce opción:");
                            for (int i = 0; i < Enumerados.Tamanio.values().length; i++) {
                                ES.escribirLn(i+". "+Enumerados.Tamanio.values()[i]);
                            }
                            try {
                                tamanio = Enumerados.Tamanio.values()[ES.leerEntero()];
                                break;
                            } catch (Exception e) {
                                ES.escribirLn("Elige un número de la lista.");
                            }
                        }
                        vehiculos.add(new Furgoneta(
                            ES.leerBooleano("Refrigerado", "Sin refrigerar"),
                            tamanio,
                            ES.leerEntero("Introduce pma:", 1),
                            ES.leerEntero("Introduce volumen:", 1),
                            matricula,
                            ES.leerCadena("Introduce marca:"),
                            ES.leerCadena("Introduce modelo:"),
                            ES.leerEntero("Introduce cilindrada:")
                        ));
                        anadido = true;
                        break;
                    default:
                        ES.escribirLn("Elige una opción válida.");
                        break;
                }
            }
        } else {
            ES.escribirLn("Esta Matricula ya está en el array.");
        }     
    }
    
    private static void borrarVehiculo(String matricula) {
        boolean esta = false;
        int posicion = 0;
        matricula = Utilidades.comprobarMatricula(matricula);
        for (int i = 0; i < vehiculos.size(); i++) {
            if(vehiculos.get(i).getMatricula().equalsIgnoreCase(matricula)) {
                esta = true;
                posicion = i;
                break;
            }
        }
        if (esta == true) {
            vehiculos.remove(posicion);
        } else {
            ES.escribirLn("Esta Matrícula no está en el array.");
        }
    }
    
    private static void nuevoAlquiler(Cliente cliente, Vehiculo vehiculo) {
        try {
            if (vehiculo.isDisponible() == true) {
                alquileres.add(new Alquiler(cliente, vehiculo));
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
            
            for (int i = 0; i < alquileres.size(); i++) {
                if (matricula.equals(alquileres.get(i).getVehiculo().getMatricula())) {
                    alquilerPos = i;
                }
            }

            for (int i = 0; i < alquileres.size(); i++) {
                if (dni.equals(alquileres.get(i).getCliente().getDni())) {
                    if (alquileres.get(i).getCliente().getDni().equals(alquileres.get(alquilerPos).getCliente().getDni())) {
                       coincide = true;
                    }
                }
            }

            if (coincide == true) {
                ES.escribirLn(alquileres.get(alquilerPos).getCliente().getDni());
                //alquileres.remove(alquilerPos);
                vehiculo.setDisponible(true);
            } else {
                ES.escribirLn("Esta matrícula y DNI no se encuentran en el mismo alquiler");
            }
        } catch (Exception e) {
            ES.escribirLn("Datos incorrectos.");
        }
    }
    
    private static void guardarDatos(){
        String ruta = "C:\\Repos\\Programacion\\Programacion\\CLJ-Indiv07\\";
        String texto = "";
        
        // Clientes
        ES.escribirArchivo(ruta+"clientes.txt", "", true);
        for (Cliente cliente : clientes) {
            texto = cliente.getDni()+"#"+cliente.getNombre()+"#"+cliente.getDireccion()+"#"+cliente.getLocalidad()+"#"+cliente.getCodigoPostal();
            ES.escribirArchivo(ruta+"clientes.txt", texto, false);
        }
        
        // Vehiculos
        ES.escribirArchivo(ruta+"vehiculos.txt", "", true);
        for (Vehiculo vehiculo : vehiculos) {
            texto = vehiculo.getClass()+"#"+vehiculo.getMatricula()+"#"+vehiculo.getMarca()+"#"+vehiculo.getModelo()+"#"+vehiculo.getCilindrada();
            ES.escribirArchivo(ruta+"vehiculos.txt", texto, false);
        }
        
        // Alquileres
        ES.escribirArchivo(ruta+"alquileres.txt", "", true);
        for (Alquiler alquiler : alquileres) {
            texto = alquiler.getCliente()+"#"+alquiler.getVehiculo()+"#"+alquiler.getDias()+"#"+alquiler.getFecha();
            ES.escribirArchivo(ruta+"alquileres.txt", texto, false);
        }
    }
    
    private static void leerDatos() throws IOException{
        String ruta = "C:\\Repos\\Programacion\\Programacion\\CLJ-Indiv07\\";
        String[] txt;
        String[] elemento;
        
        // Clientes
        txt = ES.leerArchivo(ruta+"clientes.txt").split("\n");
        for (String linea : txt) {
            if (linea.matches("^(.*)#(.*)#(.*)#(.*)#(.*)$")) {
                elemento = linea.split("#");
                clientes.add(new Cliente(
                    elemento[0],
                    elemento[1],
                    elemento[2],
                    elemento[3],
                    elemento[4]
                ));
            } 
        }
        // Vehiculos
        txt = ES.leerArchivo(ruta+"vehiculos.txt").split("\n");
        for (String linea : txt) {
            if (linea.matches("^(.*)#(.*)#(.*)#(.*)#(.*)$")) {
                elemento = linea.split("#");
                switch(elemento[0].toLowerCase()){
                    case "deportivo":
                        // pongo por defecto estos valores como ejemplo
                        vehiculos.add(new Deportivo(true, Enumerados.CajaCambios.MANUAL, 3, Enumerados.TipoCombustible.DIESEL, elemento[1], elemento[2], elemento[3], Integer.valueOf(elemento[4])));
                        break;
                    case "familiar":
                        // pongo por defecto estos valores como ejemplo
                        vehiculos.add(new Familiar(7, true, 5, Enumerados.TipoCombustible.DIESEL, elemento[1], elemento[2], elemento[3], Integer.valueOf(elemento[4])));
                        break;
                    case "furgoneta":
                        // pongo por defecto estos valores como ejemplo
                        vehiculos.add(new Furgoneta(false, Enumerados.Tamanio.GRANDE, 10, 10, elemento[1], elemento[2], elemento[3], Integer.valueOf(elemento[4])));
                        break;
                    default:
                        ES.escribirLn("Se han encontrado datos corruptos!");
                        break;
                }
            } 
        }
        // Alquileres
        txt = ES.leerArchivo(ruta+"alquileres.txt").split("\n");
        for (String linea : txt) {
            if (linea.matches("^(.*)#(.*)#(.*)#(.*)$")) {
                elemento = linea.split("#");
                // la idea es añadir dni y matricula... y aquí luego crear la "relación" con su nuvo objeto
                //alquileres.add(new Alquiler(elemento[0], elemento[1]));
            } 
        }
    }
}
