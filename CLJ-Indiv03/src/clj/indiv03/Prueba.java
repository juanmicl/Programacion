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
public class Prueba {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Usuario pepe = new Usuario("Pepe", "Lopez", 20, "77777777N");
            Producto impresora = new Producto(1314, "Impresora HP-360", 25);
            
            System.out.println(pepe);
            System.out.println(impresora);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
