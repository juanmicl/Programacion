package Ejercicio2;

/**
 * Clase principal del ejercicio
 * @author Antonio Ramos
 * @version 1.0
 */
public class ClasePrincipal {

    private static Vehiculo[] taller= new Vehiculo[10];
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        int opcion, posicion;
        
        // Pruebas con 3 vehículos
        /*
        taller[0] = new Vehiculo("1234www", "ford", "fiesta", "motor", 45, "Juan", "34674123589");
        taller[1] = new Vehiculo("4567qqq", "vw", "polo", "todo", 23, "Pepe", "34987654321");
        taller[2] = new Vehiculo("7896ttt", "seat", "toledo", "ventana", 145, "Antonio", "34654123654");
        */
        do{
            opcion = ES.leerEntero("Menú:\n"
                    + "1. Dar de alta un vehículo\n"
                    + "2. Modicar un dato de un vehículo\n"
                    + "3. Mostrar un dato de un vehículo\n"
                    + "4. Mostrar todos los datos de un vehículo dando una posición del array\n"
                    + "5. Mostrar los datos de todos los vehículos\n"
                    + "6. Dar de baja un vehículo\n"
                    + "0. Salir\n"
                    + "Elija una opción: ", 0, 6);
            
            switch(opcion){
                case 0:
                    ES.escribirLn("Saliendo del programa...");
                    break;
                case 1:
                    for(posicion = 0; posicion < taller.length; posicion++){
                        if(taller[posicion] == null){
                            if(insertarVehiculo(posicion))
                                ES.escribirLn("Vehículo dado de alta correctamente.");
                            else
                                ES.escribirLn("¡¡Error!! El vehículo no se ha podido dar de alta");
                            break;
                        }
                    }
                    if(posicion == 10)
                        ES.escribirLn("¡¡Error!! El taller está lleno y no se puede dar de alta otro vehículo.");
                    break;
                case 2:
                case 3:
                    ES.escribirLn("Opción no disponible.");
                    break;
                case 4:
                    posicion = ES.leerEntero("Introduzca el número del vehículo que quiere mostrar: ", 1, 10);
                    // Para quedarnos en el intervalo de vehiculos que puede tener el array. 10 elementos -> de 0 a 9
                    posicion--;
                    if(taller[posicion] != null)
                        ES.escribirLn(taller[posicion].toString());
                    else
                        ES.escribirLn("No existe ningún vehículo en esa posición");
                    break;
                case 5:
                    for(Vehiculo vehiculo : taller){
                        if(vehiculo != null)
                            ES.escribirLn(vehiculo.toString());
                        else
                            break;
                    }
                    break;
                case 6:
                    String matricula;
                    do{
                        matricula = ES.leerCadena("Introduzca la matrícula del vehículo que quiere dar de alta: ");
                        if(!Utilidades.comprobarMatricula(matricula))
                            ES.escribirLn("¡¡Error!! La matrícula no tiene un formato correcto.");
                    }while(!Utilidades.comprobarMatricula(matricula));
                    
                    if(bajaVehiculo(matricula))
                        ES.escribirLn("Vehículo dado de baja correctamente.");
                    else
                        ES.escribirLn("¡¡Error!! No existe ningún vehículo con esta matrícula");
                    break;
            }
            ES.leerCadena("Pulse cualquier tecla para continuar...\n");
        }while(opcion != 0);
    }
    
    /**
     * Método que permite insertar un vehículo en una posición dada
     * @param posicion posición donde se va a insertar el vehículo
     * @return verdadero si se ha conseguido insertar el vehículo en el array. Falso en caso contrario.
     */
    private static boolean insertarVehiculo(int posicion){
        String matricula;
        String telefono;
        do{
            matricula = ES.leerCadena("Introduzca la matrícula del vehículo que quiere dar de alta: ");
            if(!Utilidades.comprobarMatricula(matricula))
                ES.escribirLn("¡¡Error!! La matrícula no tiene un formato correcto.");
        }while(!Utilidades.comprobarMatricula(matricula));
        
        for(int i = posicion-1; i >= 0; i--){
            if(matricula.equalsIgnoreCase(taller[i].getMatricula()))
                return false;
        }
        
        do{
            telefono = ES.leerCadena("Introduzca el teléfono del propietario del vehículo: ");
            if(!Utilidades.comprobarTelefonoEsp(telefono))
                ES.escribirLn("¡¡Error!! El teléfono no tiene un formato correcto.");
        }while(!Utilidades.comprobarTelefonoEsp(telefono));
        
        taller[posicion] = new Vehiculo(matricula, 
                ES.leerCadena("Introduzca la marca del vehículo: "), 
                ES.leerCadena("Introduzca el modelo del vehículo: "), 
                ES.leerCadena("Introduzca el problema del vehículo: "), 
                ES.leerReal("Introduzca la cantidad presupuestada por la reparación: ", 0),
                ES.leerCadena("Introduzca el nombre del propietario del vehículo: "), 
                telefono);
        return true;
    }
    
    /**
     * Método que permite dar de baja un vehículo a partir de una matrícula pasada por parámetro
     * @param matricula matrícula del vehículo que se quiere dar de baja
     * @return verdadero si se encuentra la matrícula en el array taller. Falso en caso contrario
     */
    private static boolean bajaVehiculo(String matricula){
        for(int i = 0; i < taller.length; i++){
            if(taller[i] != null){
                if(matricula.equalsIgnoreCase(taller[i].getMatricula())){
                    desplazarVehiculos(i);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
    
    /**
     * Método que desplaza los vehículos que hay después del vehículo que se quiere eliminar
     * @param posicion posición en el array del vehículo que se desea eliminar
     */
    private static void desplazarVehiculos(int posicion){
        for(int i = posicion; i < taller.length-1; i++){
            taller[i] = taller[i+1];
            if(taller[posicion] == null)
                break;
        }
        taller[taller.length-1] = null;
    }
    
}
