/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarectangulo;

/**
 * Un objeto Punto queda definido por dos valores double:
 * <ul>
 * <li>Un valor x double sobre el eje X</li>
 * <li>Un valor y double sobre el eje Y</li>
 * </ul>
 * @see #Punto(int, int) 
 * @author Alberto
 */
public class Punto {
    /**
     * Coordenadas x e y de un objeto Punto en el eje de coordenadas XY
     */
    private double x, y;
    
    /**
     * Constructor de la clase.
     * Crea un objeto Punto a partir de las coordenadas x e y
     * @param x int define la coordenada x del punto
     * @param y int define la coordenada y del punto
     */

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * 
     * @return double devuelve el valor de la coordenada x
     */

    public double getX() {
        return x;
    }
    
    /**
     * 
     * @param x int establece el valor de la coordenada x
     */

    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * 
     * @return double devuelve el valor de la coordendana y
     */

    public double getY() {
        return y;
    }
    
    /**
     * 
     * @param y int etablece el valor de la coordenada y
     */

    public void setY(int y) {
        this.y = y;
    }
}
