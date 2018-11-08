/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;

/**
 * Hace cosas.
 * @author 0101001011
 */
public class Usuario {
    // Declaramos ATRIBUTOS
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    public static int n = 0;

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
    
    @Override
    public String toString(){
        this.n++;
        return "Usuario "+nombre+" "+apellidos+" edad: "+edad+" dni: "+dni;
        
    }
    
    // esto es un metodo
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        nombre = this.nombre;
    }
    
}
