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
public class Mamifero extends Animal{
    
    private TipoAlimentacion tipoAlimentacion;
    private TipoMamifero tipoMamifero;
    
    public enum TipoAlimentacion {
        CARNIVORO,HERVIVORO,OMNIVORO;
    }
    
    public enum TipoMamifero {
        ACUATICO,TERRESTRE,VOLADOR;
    }

    public Mamifero(TipoAlimentacion tipoAlimentacion, TipoMamifero tipoMamifero, String nombre, float peso, int edad) {
        super(nombre, peso, edad);
        this.tipoAlimentacion = tipoAlimentacion;
        this.tipoMamifero = tipoMamifero;
    }

    public TipoMamifero getTipo() {
        return tipoMamifero;
    }

    public void setTipo(TipoMamifero tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }
    
    public TipoAlimentacion getAlimentacion() {
        return tipoAlimentacion;
    }

    public void setAlimentacion(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + getNombre()+ ", " + "peso=" + getPeso() + ", " + "edad=" + getEdad()+ ", " + "tipoAlimentacion=" + getAlimentacion() + ", tipoMamifero=" + getTipo() + '}';
    }
}
