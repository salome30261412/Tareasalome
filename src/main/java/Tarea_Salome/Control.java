package Tarea_Salome;

public class Control {
    public static final String MARCA = "LG";
    public static final int BOTONES = 12;

    public String marca;
    private String tipo;
    private boolean inalambrico;
    private int bateria;
    private String compatibilidad;

    public Control(String marca, String tipo, boolean inalambrico, int bateria, String compatibilidad) {
        this.marca = marca;
        this.tipo = tipo;
        this.inalambrico = inalambrico;
        this.bateria = bateria;
        this.compatibilidad = compatibilidad;
    }

    public void encender() {
        System.out.println("Encendiendo dispositivo con el control.");
    }

    public void cambiarCanal(int canal) {
        System.out.println("Cambiando al canal " + canal);
    }
    public static void TipoControl(){
        System.out.println("Marca control: " +MARCA);
    }
}
