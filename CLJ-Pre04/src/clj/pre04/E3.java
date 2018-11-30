/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre04;

/**
 *
 * @author juanmi
 */
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "abdacbb";
        int validos = 0;
        String subcadena = "";
        // Convertimos String a array
        char[] cadenaArray = s.toCharArray();
        
        for(int i = 0; i < s.length()-3; i++){
            for(int e=1; e < 2; e++){
                subcadena = "";
                subcadena += cadenaArray[i];
                subcadena += cadenaArray[i+e];
                subcadena += cadenaArray[i+e+1];
                subcadena += cadenaArray[i+e+2];
                if (subcadena.matches("abcd|abdc|acbd|acdb|adbc|adcb|")){
                    validos++;
                } else if (subcadena.matches("bacd|badc|bcad|bcda|bdac|bdca")) {
                    validos++;
                } else if (subcadena.matches("cabd|cadb|cbad|cbda|cdab|cdba")){
                    validos++;
                } else if (subcadena.matches("dabc|dacb|dbac|dbca|dcab|dcba")){
                    validos++;
                }
            }
            //System.out.println(subcadena);
        }
        System.out.println(validos);
    }
    
}
