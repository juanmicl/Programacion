/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv05;

/**
 *
 * @author juanmi
 */
public class Vehiculo {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrada;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.disponible = true;
    }

    public Vehiculo(Vehiculo vehiculo){
        matricula = vehiculo.matricula;
        marca = vehiculo.marca;
        modelo = vehiculo.modelo;
        cilindrada = vehiculo.cilindrada;
        disponible = vehiculo.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", disponible=" + disponible + '}';
    }
    
}
