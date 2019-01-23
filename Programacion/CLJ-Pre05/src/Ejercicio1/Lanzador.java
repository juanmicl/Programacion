/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author juanmi
 */
public class Lanzador {
    
    static ES ES = new ES(); //Instancia de la clase ES
    
    /**
     * Introducir números reales desde teclado y que realice operaciones con ellos
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int salir = 0;
        int nIntroduc = 0;
        int nSumas = 0;
        int nMult = 0;
        float numero = 0;
        float valor;
        
        while (salir == 0) {
            valor = ES.leerDecimal(0, "Introduce un número: ");
            nIntroduc++;
            if (valor > 10) {
                numero += valor;
                nSumas++;
            } else if (valor <= 10 && valor >= 1) {
                numero *= valor;
                nMult++;
            } else if (valor == 0) {
                salir = 1;
            }
        }
        System.out.println(
                "Resultado: "+numero+"\n"
                + "Cantidad números introducidos: "+nIntroduc+"\n"
                + "Nº sumas: "+nSumas+"\n"
                + "Nº multiplicaciones: "+nMult);
    }
}
