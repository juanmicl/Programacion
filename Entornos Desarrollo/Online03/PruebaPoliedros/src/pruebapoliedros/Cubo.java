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
public class Cubo {
    private int arista;
    
    /**
     *
     * @param arista
     */
    public Cubo(int arista) {
        this.arista = arista;
    }
    
    /**
     *
     * @return
     */
    public double area() {
        int resultado = (int) (6 * (Math.pow(arista, 2)));
        return resultado;
    }
    
    /**
     *
     * @return
     */
    public double volumen() {
        double resultado = Math.pow(arista, 3);
        return resultado;
    }
}
