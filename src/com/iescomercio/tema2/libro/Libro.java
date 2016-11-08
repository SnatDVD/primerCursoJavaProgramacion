package com.iescomercio.tema2.libro;

/**
 *
 * @author chiqui
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;
    private String numeroDeReferencia;
    private int prestado;

    public Libro(String autorDelLibro, String tituloDelLibro, int numeroPaginas) {
        autor = autorDelLibro;
        titulo = tituloDelLibro;
        paginas = numeroPaginas;
        numeroDeReferencia = "";
        prestado = 0;
    }
    
    public Libro(String autorDelLibro, String tituloDelLibro, int numeroPaginas, String numRef) {
        autor = autorDelLibro;
        titulo = tituloDelLibro;
        paginas = numeroPaginas;
        numeroDeReferencia = numRef;
        prestado = 0;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setNumeroDeReferencia(String numRef) {
        if(numeroDeReferencia.length()>2){
            numeroDeReferencia = numRef;
        }else{
            System.out.println("ERROR¡");
        }
        
    }

    public String getNumeroDeReferencia() {
        return numeroDeReferencia;
    }
    
    public int getPrestado() {
        return prestado;
    }

    public void imprimirAutor() {

        System.out.println("Autor del libro = " + getAutor());
    }

    public void imprimirTitulo() {

        System.out.println("Titulo del libro = " + getTitulo());

    }

    public void imprimirDetalles() {
        if(numeroDeReferencia.length()!=0){
        System.out.println("Autor: " + getAutor() + "// Titulo: " + getTitulo() + "// Paginas: " + getPaginas() + "// Numero de referencia: " 
        + getNumeroDeReferencia() + "// Prestado: " + getPrestado());
        }else{
        System.out.println("Autor: " + getAutor() + "// Titulo: " + getTitulo() + "// Paginas: " + getPaginas() + "// Numero de referencia: ZZZ" 
        + "// Prestado: " + getPrestado());  
        }
    }
    
    public void prestar(){
        prestado++;
        
    }
}