package Tarea_Salome;

public class Restaurante {
    public static final String TIPO_COMIDA ="Peruana";
    public static final int CAPACIDAD_MAXIMA=100;

    public String nombre;
    private String ubicacion;
    private int capacidad;
    public double calificacion;
    public boolean abierto;

    public Restaurante(String nombre, String ubicacion, int capacidad, double calificacion, boolean abierto) {

        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.capacidad=capacidad;
        this.calificacion= calificacion;
    }

    public void abrir(){
        abierto= true;
        System.out.println(nombre +" esta abierto.");
    }
    public void cerrar(){
        abierto= false;
        System.out.println(nombre +" esta cerrado.");
    }
    public static void capacidad(){
        System.out.println("Capacidad del restaurante: "+CAPACIDAD_MAXIMA);
    }
}
