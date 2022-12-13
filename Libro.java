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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro, boolean libroTexto){
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
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
     * Devuelve el número de páginas del libro
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
     * Devuelve las veces que el libro ha sido prestado
     */
    public int getvecesLibroPrestado(){
        return vecesPrestado;
    }

    /**
     * Devuelve si es un libro de texto
     */
    public boolean getesLibroTexto(){
        return esLibroDeTexto; 
    }

    /**
     * Devuelve la referencia del libro
     */
    public void setNumeroDeReferencia(String numeroDeLaReferencia) {
        if (numeroDeLaReferencia.length() >= 3) {
            numeroReferencia = numeroDeLaReferencia;
        }
        else{
            System.out.println("No se puede realizar esta acción, debe contener al menos 3 carácteres");
        } 
    }

    /**
     * Modifica las veces que el libro ha sido prestado
     */
    public void prestar(){
        vecesPrestado = +1;
    }

    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() { 
        String referencia = "" ;
        if (numeroReferencia.length() == 0) {
            referencia = "--";
        }
        else{
            referencia = numeroReferencia;
        }

        String texto = null;
        if(esLibroDeTexto == true){
            texto = "Si";
        }
        else{
            texto = "No";
        }

        return ( "Título: " + titulo + ", "+ "Autor: " + autor + ", " + "Páginas: " + numeroPaginas+ ", " + "Numero de la Referencia: " + referencia + " Veces que el libro ha sido prestado: " + vecesPrestado + ", ¿Es un libro de texto? " + texto);   
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
        System.out.println( "Título: " + titulo + ". ");   
    }

    /**
     * Imprime por pantalla los detalles del libro
     */
    public void imprimirDetalles() {
        String referencia = "" ;
        if (numeroReferencia.length() == 0) {
            referencia = "--";
        }
        else{
            referencia = numeroReferencia;
        }

        String texto = null;
        if(esLibroDeTexto == true){
            texto = "Si";
        }
        else{
            texto = "No";
        }

        System.out.println( "Título: " + titulo + ", "+ "Autor: " + autor + ", " + "Páginas: " + numeroPaginas+ ", " + "Numero de la Referencia: " + referencia + " Veces que el libro ha sido prestado: " + vecesPrestado + ", ¿Es un libro de texto? " + texto);   
    }   
}

