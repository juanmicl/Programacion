package twoWindow;

import java.util.ArrayList;

/**
 *
 * @author Antonio Ramos
 */
public class OldMain {
    private static ArrayList<Libro> libros = new ArrayList<Libro>();
    private static int posicion = -1;
    
    public static void anadirLibro(Libro nuevoLibro){
        libros.add(nuevoLibro);
    }
    
    public static Libro siguienteLibro(){
        return datosLibro(posicion+1);
    }
    
    public static Libro anteriorLibro(){
        return datosLibro(posicion-1);
    }
            
    private static Libro datosLibro(int posicion){
        if(posicion > -1 && posicion < libros.size()){
            OldMain.posicion = posicion;
            return libros.get(posicion);
        }
        else
            return null;
    }
}
