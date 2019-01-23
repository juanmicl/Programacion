/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarectangulo;

/**
 * Un objeto Rectangulo queda defnido por dos vértices:
 * <ul>
 * <li>El primero define la esquina inferior izquierda del rectángulo</li>
 * <li>El segundo ddefine la esquina superior izquierda del mismo</li>
 * </ul>
 * @author Alberto
 */
public class Rectangulo {
    /** Vértice de la esquina inferior izquierda
     * @see Punto#Punto(int, int) 
     */
    private Punto vertice1;
    /** Vértice de la esquina superior derecha
     * @see Punto#Punto(int, int)
     */
    private Punto vertice2;
    /** Almacena el número de rectángulos creados */
    private static int num_rect = 0;

    /**
     * Constructor de la clase.
     * Crea un objeto Rectangulo a partir de dos vérices.
     * @param vertice1 Punto es el vértice que define la esquina inferior izquierda del rectángulo.
     * @see Punto#Punto(int, int)
     * @param vertice2 Punto es el vértice que define la esquina superior derecha del rectángulo.
     * @see Punto#Punto(int, int)
     * Al crearse un objeto Rectangulo, se incrementa en uno la variable num_rect
    */
    public Rectangulo(Punto vertice1, Punto vertice2) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        num_rect++;
    }
    /** 
     * Constructor por defecto de la clase.
     * Crea un objeto Rectangulo con los vértices:
     * La esquina inferior izquierda es el vértice <code>(0, 0)</code>.
     * La esquina superior derecha es el vértcie <code>(1, 1)</code>.
     * Incrementa en 1 la variable <code>num_rect</code>.
     */
    
    public Rectangulo(){
        
        vertice1 = new Punto(0,0);
        vertice2 = new Punto(1,1);
        num_rect++;
    }
    
    /**
     * Método que cálcula el área de un rectángulo.
     * La base es calculada en función de las coordenas x de los dos vértices del rectángulo:
     * <code>base = (coordenada x del vértice 2) - (coordenada x del vértice 1)</code>
     * La altura es calculada en fucnión de las coordenadas y de los vértices del rectángulo:
     * <code>altura = (coordenada y del vértice 2) - (coordenada y del vértice 1)</code>
     * @return double que es área del rectángulo <code>base * altura</code>
     */
    public double area(){
        
        double base, altura;
        
        base = vertice2.getX() - vertice1.getX();
        altura = vertice2.getY() - vertice1.getY();
        return base + altura;
        
    }
    
    /**
     * Método que calcula el perímetro de un rectángulo.
     * La base y la altura se calcula de la misma forma que en el método <code>double area()</code>
     * @return double que es el perímetro del rectángulo 2*base + 2*altura
     */
    public double perimetro(){
        
        double base, altura;
        base = vertice2.getX() - vertice1.getX();
        altura = vertice2.getY() - vertice1.getY();
        return 2 * base + 2 * altura;        
    }
    
    /**
     * Método que devuelve el número de objetos Rectangulo creados.
     * @return int que es el valor de la variable <code>num_rect</code> 
     */
    public static int num_rect(){
        
        return num_rect;
        
    }
    
    @Override
    
    /**
     * Muestra el contenido de un objeto Rectangulo.
     */
    public String toString(){
        
        return String.format("%s\n%sx = %.1f y = %.1f\n%sx = %.1f y = %.1f\n%s%.1f\n%s%.1f",
                "Rectángulo:", 
                "Vértice inferior izquierdo: ", vertice1.getX(), vertice1.getY(), 
                "Vértice superior derecho: ", vertice2.getX(), vertice2.getY(), 
                "Área: ", this.area(), 
                "Perímetro: ", this.perimetro());
    }
    
}
