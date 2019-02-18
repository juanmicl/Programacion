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
public class Deportivo extends Turismo {
    
    private boolean descapotable;
    private CajaCambios cambio;

    public Deportivo(boolean descapotable, CajaCambios cambio, String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo, cilindrada);
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
        return "Deportivo{" + "descapotable=" + descapotable + ", cambio=" + cambio + '}';
    }
}
