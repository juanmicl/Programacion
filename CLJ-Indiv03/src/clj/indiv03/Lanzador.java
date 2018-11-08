/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;

/**
 *
 * @author 0101001011
 */
public class Lanzador {
    public static void main(String[] args) {
        // TODO code application logic here
        Object Pepe = new Usuario("Pepe", "Lopez", 20, "77777777N");
        Usuario Carlos = new Usuario("Carlos", "Perez", 25, "88777777N");
        
        System.out.println(Pepe);
        System.out.println(Carlos);
        System.out.println(Usuario.n);
    }
}
