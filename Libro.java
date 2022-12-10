
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
    private int numeroPaginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro){
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasLibro;
        numeroReferencia = "--";
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

    /**
     * Devuelve el n�mero de p�ginas del libro
     */
    public int getNumeroPaginasLibro() {
        return numeroPaginas;
    }

    /**
     * Devuelve el titulo del libro
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Devuelve el nombre completo del animal
     */
    public void setNumeroDeReferencia(String numeroReferencia) {
        if (numeroReferencia.length() >= 3) {
            numeroReferencia = numeroReferencia;
        }
        else{
            System.out.println("No se puede realizar esta acci�n, debe contener al menos 3 car�cteres");
        }
    }

    /**
     * Devuelve el n�mero de p�ginas del libro
     */
    public String getDetalles() {
        return "T�tulo: " + titulo + ", "+ "Autor: " + autor + ", " + "P�ginas: " + numeroPaginas + ", " + "Numero de la Referencia:" + numeroReferencia  ;
    }

    /**
     * Imprime por pantalla el nombre completo del autor
     */
    public void imprimirAutor() {
        System.out.println( "Autor: " + autor + ". ");   
    }

    /**
     * Imprime por pantalla el titulo del libro
     */
    public void imprimirTitulo() {
        System.out.println( "T�tulo: " + titulo + ". ");   
    }

    /**
     * Imprime por pantalla el titulo del libro
     */
    public void imprimirDetalles() {
        System.out.println( "T�tulo: " + titulo + ", "+ "Autor: " + autor + ", " + "P�ginas: " + numeroPaginas+ ", " + "Numero de la Referencia:" + numeroReferencia );   
    }

}

