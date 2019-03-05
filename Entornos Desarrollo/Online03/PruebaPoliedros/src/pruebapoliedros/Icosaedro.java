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
public class Icosaedro {
    private int arista;
    
    public Icosaedro(int arista) {
        this.arista = arista;
    }
    
    /**
     *
     * @return
     */
    public double area() {
        double resultado = 5 * (Math.pow(arista, 2)) * Math.sqrt(3);
        return resultado;
    }
    
    /**
     *
     * @return
     */
    public double volumen() {
        double resultado = (float)5/12 * (3 + Math.sqrt(5)) * Math.pow(arista, 3);
        return resultado;
    }
}
