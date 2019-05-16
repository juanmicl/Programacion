/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author juanmi
 */
public class Alquiler {
    
    private Date fecha;
    private int dias;
    
    private Cliente cliente; // Esto no salía en el diagrama, https://i.imgur.com/sMyOb6C.png
    private Vehiculo vehiculo; // Esto no salía en el diagrama, https://i.imgur.com/sMyOb6C.png
    
    private final SimpleDateFormat FORMATO_FECHA;
    private final double PRECIO_DIA;
    private final int MILISEGUNDOS_DIA;
    
    public Alquiler(Cliente cliente, Vehiculo vehiculo) {
        this.FORMATO_FECHA = new SimpleDateFormat("dd/MM/yyyy");
        this.PRECIO_DIA = 30;
        this.MILISEGUNDOS_DIA = (int) System.currentTimeMillis();
        this.fecha = new Date();
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

    public Date getFecha() {
        return fecha;
    }

    public int getDias() {
        return dias;
    }
    
    public double precioAlquiler() {
        return (PRECIO_DIA * dias + vehiculo.getCilindrada() / 100);
    }
    
    private int diferenciaDias(Date fecha) {
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Date resultdate = new Date(System.currentTimeMillis());
        //System.out.println(sdf.format(resultdate));
        //return (int) tu.convert((fecha.getTime() - System.currentTimeMillis()),TimeUnit.MILLISECONDS);
        TimeUnit tu = TimeUnit.DAYS;
        return (int) tu.convert((MILISEGUNDOS_DIA - fecha.getTime()), TimeUnit.MILLISECONDS);
    }
    
    public void cerrar() {
        dias = diferenciaDias(fecha);
        if (dias == 0) {
            dias = 1;
        }
        vehiculo.setDisponible(true);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "FORMATO_FECHA=" + FORMATO_FECHA + ", PRECIO_DIA=" + PRECIO_DIA + ", MILISEGUNDOS_DIA=" + MILISEGUNDOS_DIA + ", Fecha=" + fecha + ", dias=" + dias + '}';
    }
}
