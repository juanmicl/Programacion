/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author juanmi
 */
public class Alquiler {
    
    private final SimpleDateFormat FORMATO_FECHA;
    private final double PRECIO_DIA;
    private final int MILISEGUNDOS_DIA;
    public Date Fecha;
    public int dias;

    public Alquiler(Cliente cliente, Vehiculo vehiculo) {
        this.FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");
        this.PRECIO_DIA = 5.5;
        this.MILISEGUNDOS_DIA = (int) System.currentTimeMillis();
        this.Fecha = new Date();
        this.dias = 0;
    }

    public SimpleDateFormat getFORMATO_FECHA() {
        return FORMATO_FECHA;
    }

    public double getPRECIO_DIA() {
        return PRECIO_DIA;
    }

    public int getMILISEGUNDOS_DIA() {
        return MILISEGUNDOS_DIA;
    }

    public Date getFecha() {
        return Fecha;
    }

    public int getDias() {
        return dias;
    }
    
    public double precioAlquiler() {
        return 0;
    }
    
    // diferencia dias
    
    public void cerrar() {
        
    }

    @Override
    public String toString() {
        return "Alquiler{" + "FORMATO_FECHA=" + FORMATO_FECHA + ", PRECIO_DIA=" + PRECIO_DIA + ", MILISEGUNDOS_DIA=" + MILISEGUNDOS_DIA + ", Fecha=" + Fecha + ", dias=" + dias + '}';
    }
}
