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
public class Dodecaedro {
    private int arista;
    
    public Dodecaedro(int arista) {
        this.arista = arista;
    }
    
    /**
     *
     * @return
     */
    public double area() {
        double resultado = (3 * (Math.pow(arista, 2))) * (Math.sqrt(25 + (10 * Math.sqrt(5))));
        return resultado;
    }
    
    /**
     *
     * @return
     */
    public double volumen() {
        double resultado = Math.pow(arista, 3) * 7.663;
        return resultado;
    }
}
