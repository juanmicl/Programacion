/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv06;

import clj.indiv06.Enumerados.Tamanio;

/**
 *
 * @author 0101001011
 */
public class Furgoneta extends Mercancias {
    private boolean refrigerado;
    private Tamanio tamanio;

    public Furgoneta(boolean refrigerado, Tamanio tamanio, int pma, int volumen, String matricula, String marca, String modelo, int cilindrada) {
        super(pma, volumen, matricula, marca, modelo, cilindrada);
        this.refrigerado = refrigerado;
        this.tamanio = tamanio;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }
    
    @Override
    public String toString() {
        return "refrigerado:" + refrigerado + ", tamanio:" + tamanio+", pma: "+getPma()+", volumen: "+getVolumen()+", matricula: "+getMatricula()+", marca: "+getMarca()+", modelo: "+getModelo()+", cilindrada: "+getCilindrada();
    }
}
