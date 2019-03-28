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
public class Periferico extends Electronico {
    
    private int peso;
    private String tipoConexion;

    public Periferico(int peso, String tipoConexion, Enumerados.TipoDispositivo tipo, Enumerados.Corriente corriente, String codigo, String nombre, int altura, int anchura, int grosor) {
        super(tipo, corriente, codigo, nombre, altura, anchura, grosor);
        this.peso = peso;
        this.tipoConexion = tipoConexion;
    }

    public int getPeso() {
        return peso;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public Enumerados.TipoDispositivo getTipo() {
        return tipo;
    }

    public Enumerados.Corriente getCorriente() {
        return corriente;
    }
    
    @Override
    public String formatoGuardado() {
        return "P|"+"|"+peso+"|"+tipoConexion+"|"+tipo+"|"+corriente+"|"+getCodigo()+"|"+getNombre()+"|"+getAltura()+"|"+getAnchura()+"|"+getGrosor();
    }
    
}
