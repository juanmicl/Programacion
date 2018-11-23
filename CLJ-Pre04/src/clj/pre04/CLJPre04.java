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
public class CLJPre04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "abdacbb";
        int validos = 0;
        int v = 0;
        // Convertimos String a array
        char[] cadenaArray = s.toCharArray();
        
        for(int i = 0; i < s.length()-3; i++){
            for(int e=1; e < 4; e++){
                if(cadenaArray[i] == cadenaArray[i+e]){
                    System.out.println("-> "+cadenaArray[i]+" = "+cadenaArray[i+e]);
                    v++;
                }else{
                    System.out.println("-> "+cadenaArray[i]+" != "+cadenaArray[i+e]);
                }
                //System.out.println("1");
            }
            System.out.println("-----");
            if(v==0){
                validos++;
            }else{
                v = 0;
            }
        }
        System.out.println(validos);
    }
    
}
