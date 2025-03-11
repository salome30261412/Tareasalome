package Tarea_Salome;

public class Bombillo {
    public static final int VOLTAJE_ESTANDAR = 110;
    public static final String TIPO = "LED";

    public String marca;
    private int potencia;
    private String color;
    private boolean encendido;
    private int duracion;

    public Bombillo(String marca, int potencia, String color, boolean encendido, int duracion) {
        this.marca = marca;
        this.potencia = potencia;
        this.color = color;
        this.encendido = encendido;
        this.duracion = duracion;
    }

    public void encender() {
        encendido = true;
        System.out.println("El bombillo está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El bombillo está apagado.");
    }
    public static void voltaje(){
        System.out.println("Voltaje del bombillo: " + VOLTAJE_ESTANDAR);
    }
}
