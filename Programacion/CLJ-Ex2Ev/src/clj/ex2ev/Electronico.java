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
public abstract class Electronico extends Producto {
    
    protected Enumerados.TipoDispositivo tipo;
    protected Enumerados.Corriente corriente;

    public Electronico(Enumerados.TipoDispositivo tipo, Enumerados.Corriente corriente, String codigo, String nombre, int altura, int anchura, int grosor) {
        super(codigo, nombre, altura, anchura, grosor);
        this.tipo = tipo;
        this.corriente = corriente;
    }

}
