/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.presen06;

/**
 *
 * @author juanmi
 */
public final class Ave extends Animal{
    private String color;
    private boolean puedeVolar;

    public Ave(String color, boolean puedeVolar, String nombre, float peso, int edad) {
        super(nombre, peso, edad);
        this.color = color;
        this.puedeVolar = puedeVolar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    } 
}
