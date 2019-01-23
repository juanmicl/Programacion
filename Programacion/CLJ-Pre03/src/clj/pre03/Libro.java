/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clj.pre03;

/**
 *
 * @author 0101001011
 */
public class Libro {
    // Declaramos propiedades de la clase
    private String nombre;
    private String autor;
    private String descripcion;
    private int paginas;

    public Libro(String nombre, String autor, String descripcion, int paginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.paginas = paginas;
    }
    
    // Métodos get
    public String getNombre(){
        return nombre;
    }
    public String getAutor(){
        return autor;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getPaginas(){
        return paginas;
    }
    
    // Métodos set
    public void setNombre(String a){
        a = this.nombre;
    }
    public void setAutor(String a){
        a = this.autor;
    }
    public void setDescripcion(String a){
        a = this.descripcion;
    }
    public void setPaginas(int a){
        a = this.paginas;
    }
    

    /**
     * Método toString 
     * @return
     */
    @Override
    public String toString(){
        return "Nombre: "+nombre+" | Autor: "+autor+" | Descripción: "+descripcion+" | Páginas: "+paginas;
    }
}
