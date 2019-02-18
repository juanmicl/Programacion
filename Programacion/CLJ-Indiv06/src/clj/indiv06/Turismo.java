/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv06;

/**
 *
 * @author 0101001011
 */
public abstract class Turismo extends Vehiculo {
    
    public int numeroPuertas;

    public Turismo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo, cilindrada);
    }

    // falta por mostrar datos Vehiculo
    @Override
    public String toString() {
        return "Turismo: {" + "numeroPuertas=" + numeroPuertas + "}";
    }
}
