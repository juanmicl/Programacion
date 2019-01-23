/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 * Clase Vehiculo
 * @author juanmi
 */
public class Vehiculo {
    // Declaramos ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private String descripcion;
    private float presupuesto;
    private String propietario;
    private long telefono;

    /**
     *  CONSTRUCTOR
     * @param matricula
     * @param marca
     * @param modelo
     * @param descripcion
     * @param presupuesto
     * @param propietario
     * @param telefono
     */
    public Vehiculo(String matricula, String marca, String modelo, String descripcion, float presupuesto, String propietario, int telefono) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.presupuesto = presupuesto;
        this.propietario = propietario;
        this.telefono = telefono;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public float getPresupuesto(){
        return presupuesto;
    }
    
    public void setPresupuesto(float presupuesto){
        this.presupuesto = presupuesto;
    }
    
    public String getPropietario(){
        return propietario;
    }
    
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    
    public long getTelefono(){
        return telefono;
    }
    
    public void setTelefono(long telefono){
        this.telefono = telefono;
    }
    
    public float totalACobrar(){
        float resultado;
        resultado = (float) (presupuesto + (10 * 0.21));
        return resultado;
    }
    
    /**
     * Método: Los string que tengan este formato.
     * @return
     */
    @Override
    public String toString(){
        return "Matrícula: "+matricula+"\n"
                + "Marca: "+marca+"\n"
                + "Modelo: "+modelo+"\n"
                + "Descripción: "+descripcion+"\n"
                + "Presupuesto: "+totalACobrar()+"\n"
                + "Propietario: "+propietario+"\n"
                + "Teléfono: "+telefono+"\n";
    }
}
