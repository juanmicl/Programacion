
package clj.indiv02;

/**
 *  https://github.com/juanmicl/Programacion/tree/master/CLJ-Indiv02
 * @author Juanmi
 */
public class Ejercicio07 {
    // Muestra los números pares que hay entre el 50 y el 97
    public static void main(String[] args) {
        //ejecutamos desde 51 hasta 97
        for(int i = 51; i < 97; i++){
            //filtramos pares con resto 0
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
