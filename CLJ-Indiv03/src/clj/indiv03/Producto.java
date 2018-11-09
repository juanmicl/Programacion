/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;

/**
 * Clase Producto, nos permite crear productos, modificar su contenido y verlo .
 * @author 0101001011
 */
public class Producto {
    // Declaramos atributos
    private int referencia;
    private String nombre;
    private int unidades;

    /**
     *
     * @param referencia
     * @param nombre
     * @param unidades
     */
    public Producto(int referencia, String nombre, int unidades) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.unidades = unidades;
    }
    
    // Métodos get
    public int getReferencia(){
        return referencia;
    }
    public String getNombre(){
        return nombre;
    }
    public int getUnidades(){
        return unidades;
    }
    
    // Métodos set
    public void setReferencia(int a){
        a = this.referencia;
    }
    public void setNombre(String a){
        a = this.nombre;
    }
    public void setUnidades(int a){
        a = this.unidades;
    }
    
    // Método toString

    /**
     * Método: Los string que tengan este formato.
     * @return
     */
    @Override
    public String toString(){
        return "Referencia: "+referencia+" | Nombre: "+nombre+" | Unidades: "+unidades;
    }
}
