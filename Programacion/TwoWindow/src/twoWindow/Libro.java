package twoWindow;

/**
 *
 * @author Antonio Ramos
 */
public class Libro {
    private String isbn;
    private String nombre;
    private String autor;

    public Libro(String isbn, String nombre, String autor) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
    }
    
    public Libro (Libro libro){
        this.isbn = libro.isbn;
        this.nombre = libro.nombre;
        this.autor = libro.autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }    
}
