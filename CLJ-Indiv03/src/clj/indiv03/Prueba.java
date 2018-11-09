/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;
import java.util.Scanner;
/**
 *
 * @author 0101001011
 */
public class Prueba {
    public static void main(String[] args) {
        // Declaramos variables
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("======== MENU ========");
        System.out.println(
                "1. Insertar Usuario\n"
                + "2. Insertar Producto\n"
                + "3. Modificar Usuario\n"
                + "4. Modificar Producto");
        opcion = sc.nextInt();
        switch(opcion){
            case 1:
                //blabla
                break;
            case 2:
                //blabla
                break;
            
        }
                
        
        
        Usuario pepe = new Usuario("Pepe", "Lopez", 20, "77777777N");
        Producto impresora = new Producto(1314, "Impresora HP-360", 25);
        pepe.getNombre();
        System.out.println(pepe.getNombre());
        System.out.println(impresora);
        
    }
}
