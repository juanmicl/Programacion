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
public class Octaedro {
    private int arista;
    
    /**
     *
     * @param arista
     */
    public Octaedro(int arista) {
        this.arista = arista;
    }
    
    /**
     *
     * @return
     */
    public double area() {
        double resultado = (2 * (Math.pow(arista, 2))) * Math.sqrt(3);
        return resultado;
    }
    
    /**
     *
     * @return
     */
    public double volumen() {
        double resultado = (float)1/3 * Math.sqrt(2) * Math.pow(arista, 3);
        return resultado;
    }
}
