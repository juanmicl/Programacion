/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv04;

/**
 * Clase Usuario, nos permite crear usuarios, modificar su contenido y verlo.
 * @author 0101001011
 */
public class Usuario {
    // Declaramos ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private static String[][] array = new String[10][4];

    /**
     *  CONSTRUCTOR
     * @param nombre
     * @param apellidos
     * @param edad
     * @param dni
     */
    public Usuario(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }
    
    // Métodos get
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public String getDni(){
        return dni;
    }
    
    // Métodos set
    public void setNombre(String a){
        a = this.nombre;
    }
    public void setApellidos(String a){
        a = this.apellidos;
    }
    public void setEdad(int a){
        a = this.edad;
    }
    public void setDni(String a){
        a = this.dni;
    }
    
    public void insertUsuario(int n){
        boolean repe = false;
        for (int i = 0; i < 10; i++) {
            if (dni.equals(array[i][3])) {
                repe = true;
            }      
        }
        if (repe == false) {
            try {
                array[n][0] = nombre;
                array[n][1] = apellidos;
                array[n][2] = Integer.toString(edad);
                array[n][3] = dni;
            } catch (Error e){
                System.out.println("Error al Introducir el usuario.");
            }
            System.out.println("Usuario insertado correctamente.");
        } else {
            System.out.println("Ya existe un usuario con el mismo DNI en el array.");
        }
    }
    
    /**
     * Método: Los string que tengan este formato.
     * @return
     */
    @Override
    public String toString(){
        return "Usuario: "+nombre+" "+apellidos+" | Edad: "+edad+" | DNI: "+dni;
    }
}
