/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv09;

import clj.indiv09.Enumerados.CajaCambios;

/**
 *
 * @author 0101001011
 */
public class Deportivo extends Turismo {
    
    private boolean descapotable;
    private CajaCambios cambio;

    public Deportivo(boolean descapotable, CajaCambios cambio, int numeroPuertas, Enumerados.TipoCombustible combustible, String matricula, String marca, String modelo, int cilindrada) {
        super(numeroPuertas, combustible, matricula, marca, modelo, cilindrada);
        this.descapotable = descapotable;
        this.cambio = cambio;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public CajaCambios getCambio() {
        return cambio;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    
    @Override
    public String toString() {
        return "descapotable: " + descapotable + ", cambio: " + cambio + ", numeroPuertas: "+getNumeroPuertas()+", combustible: "+combustible+", matricula: "+getMatricula()+", marca: "+getMarca()+", modelo: "+getModelo()+", cilindrada: "+getCilindrada();
    }
}
