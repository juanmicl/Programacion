/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre08;

import java.util.*;

/**
 *
 * @author 0101001011
 */
public class CLJPre08 {
    
    private static ES ES = new ES();
    private static Random rand = new Random();
    private static ArrayList<Integer> lista = new ArrayList();
    
    private static int numero;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // generamos 5 aleatorios
        for (int i = 0; i < 5; i++) {
            lista.add(rand.nextInt(100));
        }
        
        while (!lista.isEmpty()) {
            Collections.sort(lista); // ordenamos
            // print array
            for (Integer numerico : lista) {
                ES.escribirLn(""+numerico);
            }
            numero = ES.leerEntero("Introduce un número entre el 0 y el 100: ", 0, 100);
            if (lista.contains(numero)) {
                lista.remove(Integer.valueOf(numero));
            } else if (numero != 0) {
                lista.add(numero);
            } else {
                lista.clear();
            }
        }
    }
}
