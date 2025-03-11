package Tarea_Salome;

public class Lapiz {
    public static final String MATERIAL = "Madera";
    public static final double LONGITUD = 17.5;

    public String color;
    private double grosor;
    private boolean tieneBorrador;
    private String tipoMina;
    private String marca;

    public Lapiz(String color, double grosor, boolean tieneBorrador, String tipoMina, String marca) {
        this.color = color;
        this.grosor = grosor;
        this.tieneBorrador = tieneBorrador;
        this.tipoMina = tipoMina;
        this.marca = marca;
    }

    public void escribir() {
        System.out.println("Escribiendo con un lápiz de color " + color);
    }

    public void borrar() {
        if (tieneBorrador) {
            System.out.println("Borrando con el lápiz.");
        } else {
            System.out.println("Este lápiz no tiene borrador.");
        }
    }
    public static void MaterialLapiz() {
        System.out.println("Material del Lapiz: "+MATERIAL);
    }
}
