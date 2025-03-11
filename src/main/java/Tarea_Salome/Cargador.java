package Tarea_Salome;

public class Cargador {
    public static final String COMPATIBILIDAD = "Universal";
    public static final int VOLTAJE = 220;

    public String marca;
    private boolean cargaRapida;
    private int potencia;
    private String tipo;
    private double peso;

    public Cargador(String marca, boolean cargaRapida, int potencia, String tipo, double peso) {
        this.marca = marca;
        this.cargaRapida = cargaRapida;
        this.potencia = potencia;
        this.tipo = tipo;
        this.peso = peso;
    }

    public void cargar() {
        System.out.println("Cargando dispositivo con " + potencia + "W de potencia.");
    }

    public void mostrarCompatibilidad() {
        System.out.println("Este cargador es compatible con: " + COMPATIBILIDAD);
    }
    public static void voltajeCarga(){
        System.out.println("Cargando dispositivo con " + VOLTAJE + "V");
    }
}
