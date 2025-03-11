package Tarea_Salome;

public class Ventilador {
    public static final int VELOCIDAD_MAXIMA = 5;
    public static final String MARCA_DEFAULT = "Desconocida";

    public String marca;
    private int velocidad;
    private boolean encendido;
    private String color;
    private double tamano;

    public Ventilador(String marca, int velocidad, boolean encendido, String color, double tamano) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.encendido = encendido;
        this.color = color;
        this.tamano = tamano;
    }

    public void encender() {
        encendido = true;
        System.out.println("El ventilador está encendido.");
    }

    public void ajustarVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad <= VELOCIDAD_MAXIMA) {
            velocidad = nuevaVelocidad;
            System.out.println("Velocidad ajustada a " + velocidad);
        } else {
            System.out.println("Velocidad fuera de rango.");
        }
    }
    public static void velocidadMaxima(){
        System.out.println("Velocidad maxima a " + VELOCIDAD_MAXIMA);
    }
}
