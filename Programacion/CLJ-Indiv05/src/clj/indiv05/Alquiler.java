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
    
    private SimpleDateFormat FORMATO_FECHA;
    private double PRECIO_DIA;
    private int MILISEGUNDOS_DIA;
    private Date Fecha;
    private int dias;

    public Alquiler(String Cliente, String Vehiculo) {
        this.FORMATO_FECHA = FORMATO_FECHA;
        this.PRECIO_DIA = PRECIO_DIA;
        this.MILISEGUNDOS_DIA = MILISEGUNDOS_DIA;
        this.Fecha = Fecha;
        this.dias = 0;
    }
    
    
}
