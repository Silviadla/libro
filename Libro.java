
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
    }
    
    /**
     * Devuelve el nombre completo del autor
     */
    public String getAutorLibro() {
        return autor;
    }
    
    /**
     * Devuelve el titulo del libro
     */
    public String getTituloLibro() {
        return titulo;
    }
}
