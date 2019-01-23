/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author juanmi
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ES ES = new ES();
        Utilidades Utilidades = new Utilidades();
        //Vehiculo a = new Vehiculo("", "", "", "", 0, "", 0);
        Vehiculo[] v = new Vehiculo[10];
        int opcion;
        int id;
        // datos vehiculos
        String matricula;
        String marca;
        String modelo;
        String descripcion;
        String propietario;
        float presupuesto;
        long telefono;

        boolean salir = false;

        while (salir == false) {
            System.out.println("======== MENU ========");
            System.out.println(
                    "1. Dar de alta nuevo vehículo\n"
                    + "2. Modificar vehículo\n"
                    + "3. Mostrar dato vehículo\n"
                    + "4. Mostrar todos los datos de un vehículo\n"
                    + "5. Mostrar datos de todos los vehículos\n"
                    + "6. Dar de baja un vehículo.\n"
                    + "0. Salir"
            );
            opcion = ES.leerEntero(0, 5, "Introduce opción: ");

            switch (opcion) {
                case 1:
                    id = ES.leerEntero(0, 10, "Introducir posición en el array: ");
                    v[id] = new Vehiculo("", "", "", "", 0, "", 0);
                    matricula = Utilidades.comprobarMatricula(ES.leerCadena("Insertar matrícula: "));
                    v[id].setMatricula(matricula);
                    marca = ES.leerCadena("Insertar marca: ");
                    v[id].setMarca(marca);
                    modelo = ES.leerCadena("Insertar modelo: ");
                    v[id].setModelo(modelo);
                    descripcion = ES.leerCadena("Insertar descripción: ");
                    v[id].setDescripcion(descripcion);
                    propietario = ES.leerCadena("Insertar propietario: ");
                    v[id].setPropietario(propietario);
                    telefono = ES.leerEnteroLargo("Introduce teléfono: ");
                    v[id].setTelefono(telefono);
                    presupuesto = ES.leerDecimal(0, "Insertar presupuesto: ");
                    v[id].setPresupuesto(presupuesto);
                    System.out.println("VEHÍCULO INSERTADO:");
                    System.out.println(v[id]);
                    break;
                case 3:
                    System.out.println("Lo sentimos, esta función todavía no está disponible.");
                    break;
                case 4:
                    id = ES.leerEntero(0, 10, "Introducir posición en el array: ");
                    System.out.println(v[id]);
                    break;
                case 5:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("VEHÍCULO Nº " + i);
                        System.out.println(v[i]);
                    }
                    break;
                case 6:
                    id = ES.leerEntero(0, 10, "Introducir posición en el array: ");
                    v[id] = new Vehiculo("", "", "", "", 0, "", 0);
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

}
