/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.indiv03;
import java.util.Scanner;
import java.util.Random;
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
                //int rand = (int )(Math.random() * 999999 + 1);
                Usuario rand = new Usuario("", "", 0, "");
                System.out.println("Insertar Nombre: ");
                rand.setNombre(sc.next());
                System.out.println("Insertar Apellidos: ");
                rand.setApellidos(sc.next());
                System.out.println("Insertar Edad: ");
                rand.setEdad(sc.nextInt());
                System.out.println("Insertar DNI: ");
                rand.setDni(sc.next());
                System.out.println(rand);
                break;
            case 2:
                Producto produsto = new Producto(0, "", 0);
                System.out.println("Insertar Referencia: ");
                produsto.setReferencia(sc.nextInt());
                System.out.println("Insertar Nombre: ");
                produsto.setNombre(sc.next());
                System.out.println("Insertar Unidades: ");
                produsto.setUnidades(sc.nextInt());
                System.out.println(produsto);
                break;  
        }
    }
}
