package Tarea_Salome;

public class Libro {
    public static final String CATEGORIA = "Literatura";
    public static final int MAX_PAGINAS = 1000;

    public String titulo;
    private String autor;
    public int paginas;
    public String genero;
    private boolean mejorvendido;

    public Libro(String titulo, String autor, int paginas, String genero,boolean mejorvendido) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
        this.mejorvendido = mejorvendido;
    }

    public void leer (){
        System.out.println("Leyendo"+ titulo + " de "+ autor);
    }
    public void resumir (){
        System.out.println("Resumen del libro: " + titulo);
    }
    public static void mostrarCategoria(){
        System.out.println("Categoria del libro: "+CATEGORIA);

    }
}
