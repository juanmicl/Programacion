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

    public Mamifero(TipoMamifero tipoMamifero, TipoAlimentacion tipoAlimentacion, String nombre, float peso, int edad) {
        super(nombre, peso, edad);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
