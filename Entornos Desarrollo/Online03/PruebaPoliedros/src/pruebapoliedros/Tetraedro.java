/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapoliedros;


/**
 *
 * @author 0101001011
 */
public class Tetraedro {
    private int arista;
    
    public Tetraedro(int arista) {
        this.arista = arista;
    }
    
    /**
     *
     * @return
     */
    public double area() {
        double resultado = (Math.pow(arista, 2)) * Math.sqrt(3);
        return resultado;
    }
    
    /**
     *
     * @return
     */
    public double volumen() {
        double resultado = ((float)Math.sqrt(2) / 12) * Math.pow(arista, 2);
        return resultado;
    }
}
