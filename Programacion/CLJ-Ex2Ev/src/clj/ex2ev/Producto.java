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
public abstract class Producto {
    
    private String codigo;
    private String nombre;
    private int altura;
    private int anchura;
    private int grosor;

    public Producto(String codigo, String nombre, int altura, int anchura, int grosor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.altura = altura;
        this.anchura = anchura;
        this.grosor = grosor;
    }

    public Producto (Producto producto) {
        this.codigo = producto.codigo;
        this.nombre = producto.nombre;
        this.altura = producto.altura;
        this.anchura = producto.anchura;
        this.grosor = producto.grosor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public int getGrosor() {
        return grosor;
    }
    
    public abstract String formatoGuardado();
    
}
