/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv09;

import clj.indiv09.Enumerados.TipoCombustible;

/**
 *
 * @author 0101001011
 */
public abstract class Turismo extends Vehiculo {
    
    protected int numeroPuertas;
    protected TipoCombustible combustible;

    public Turismo(int numeroPuertas, TipoCombustible combustible, String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo, cilindrada);
        this.numeroPuertas = numeroPuertas;
        this.combustible = combustible;
    }

    // falta por mostrar datos Vehiculo
    @Override
    public String toString() {
        return "Turismo: {" + "numeroPuertas=" + numeroPuertas + "}";
    }
}
