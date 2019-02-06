/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author juanmi
 */
public class Alquiler {
    
    private final SimpleDateFormat FORMATO_FECHA;
    private final double PRECIO_DIA;
    private final int MILISEGUNDOS_DIA;
    private Date Fecha;
    private int dias;
    
    private Cliente cliente; // Esto no salía en el diagrama, https://i.imgur.com/sMyOb6C.png
    private Vehiculo vehiculo; // Esto no salía en el diagrama, https://i.imgur.com/sMyOb6C.png
    
    public Alquiler(Cliente cliente, Vehiculo vehiculo) {
        this.FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");
        this.PRECIO_DIA = 30;
        this.MILISEGUNDOS_DIA = (int) System.currentTimeMillis();
        this.Fecha = new Date();
        this.dias = 0;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        vehiculo.setDisponible(false);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
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
        return (PRECIO_DIA * diferenciaDias(Fecha) + vehiculo.getCilindrada() / 100);
    }
    
    private int diferenciaDias(Date fecha) {
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Date resultdate = new Date(System.currentTimeMillis());
        //System.out.println(sdf.format(resultdate));
        TimeUnit tu = TimeUnit.DAYS;
        return (int) tu.convert((fecha.getTime() - System.currentTimeMillis()),TimeUnit.MILLISECONDS);
    }
    
    public void cerrar() {
        dias = diferenciaDias(Fecha);
        if (dias == 0) {
            dias = 1;
        }
        vehiculo.setDisponible(true);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "FORMATO_FECHA=" + FORMATO_FECHA + ", PRECIO_DIA=" + PRECIO_DIA + ", MILISEGUNDOS_DIA=" + MILISEGUNDOS_DIA + ", Fecha=" + Fecha + ", dias=" + dias + '}';
    }
}
