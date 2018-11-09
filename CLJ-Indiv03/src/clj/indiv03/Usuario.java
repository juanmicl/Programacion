/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;

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
    
    /**
     * Método: Los string que tengan este formato.
     * @return
     */
    @Override
    public String toString(){
        return "Usuario: "+nombre+" "+apellidos+" | Edad: "+edad+" | DNI: "+dni;
    }  
}
