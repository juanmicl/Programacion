/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarectangulo;

/**
 *
 * @author Alberto
 */
public class PruebaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rect1 = new Rectangulo();
        Rectangulo rect2 = new Rectangulo(new Punto(2,2), new Punto(5,7));
        
        System.out.println(rect1.toString());
        System.out.println();
        System.out.println(rect2.toString() + "\n\nNúmero de rectángulos creados: " +  
                Rectangulo.num_rect());
    }
    
}
