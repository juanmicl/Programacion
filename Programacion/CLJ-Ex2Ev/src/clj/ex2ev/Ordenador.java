/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.ex2ev;

/**
 *
 * @author juanmi
 */
public class Ordenador extends Electronico {
    
    private String procesador;
    private int memoriaRAM;
    private int capacidadHDD;

    public Ordenador(String procesador, int memoriaRAM, int capacidadHDD, Enumerados.TipoDispositivo tipo, Enumerados.Corriente corriente, String codigo, String nombre, int altura, int anchura, int grosor) {
        super(tipo, corriente, codigo, nombre, altura, anchura, grosor);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.capacidadHDD = capacidadHDD;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getCapacidadHDD() {
        return capacidadHDD;
    }

    public Enumerados.TipoDispositivo getTipo() {
        return tipo;
    }

    public Enumerados.Corriente getCorriente() {
        return corriente;
    }
    
    @Override
    public String formatoGuardado(){
        return "O|"+procesador+"|"+memoriaRAM+"|"+capacidadHDD+"|"+tipo+"|"+corriente+"|"+getCodigo()+"|"+getNombre()+"|"+getAltura()+"|"+getAnchura()+"|"+getGrosor();
    }
    
}
