/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv05;

import java.util.Objects;

/**
 *
 * @author juanmi
 */
public class Cliente {
    
    private String dni;
    private String nombre;
    private String direccion;
    private String localidad;
    private String codigoPostal;

    public Cliente(String dni, String nombre, String direccion, String localidad, String codigoPostal) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
    }
    
    // Constructor copia
    public Cliente(Cliente cliente) {
        dni = cliente.dni;
        nombre = cliente.nombre;
        direccion = cliente.direccion;
        localidad = cliente.localidad;
        codigoPostal = cliente.codigoPostal;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", codigoPostal=" + codigoPostal + '}';
    }
    
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        else if (!(obj instanceof Cliente)) return false;
        return this.cliente == obj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.cliente);
        return hash;
    }
}
