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
public class Familiar extends Turismo {
    
    private int numeroPlazas;
    private boolean sillaBebe;

    public Familiar(int numeroPlazas, boolean sillaBebe, int numeroPuertas, Enumerados.TipoCombustible combustible, String matricula, String marca, String modelo, int cilindrada) {
        super(numeroPuertas, combustible, matricula, marca, modelo, cilindrada);
        this.numeroPlazas = numeroPlazas;
        this.sillaBebe = sillaBebe;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public boolean isSillaBebe() {
        return sillaBebe;
    }

    public void setSillaBebe(boolean sillaBebe) {
        this.sillaBebe = sillaBebe;
    }

    public Enumerados.TipoCombustible getCombustible() {
        return combustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return "numeroPlazas:" + numeroPlazas + ", sillaBebe:" + sillaBebe +", numeroPuertas: "+getNumeroPuertas()+", TipoCombustible: "+getCombustible()+", matricula: "+getMatricula()+", marca: "+getMarca()+", modelo: "+getModelo()+", cilindrada: "+getCilindrada();
    }
}
