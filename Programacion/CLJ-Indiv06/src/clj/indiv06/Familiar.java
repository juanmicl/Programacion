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
    
    public Familiar(int numeroPlazas, boolean sillaBebe, String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo, cilindrada);
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

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    @Override
    public String toString() {
        return "Familiar{" + "numeroPlazas=" + numeroPlazas + ", sillaBebe=" + sillaBebe + '}';
    }
}
