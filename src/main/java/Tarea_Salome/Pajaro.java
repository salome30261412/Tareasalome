package Tarea_Salome;

public class Pajaro {
    public static final String TIPO = "Loro";
    public static final boolean ES_VOLADOR = true;

    public String raza;
    private double tamanoAlas;
    private String tonalidadPlumas;
    private boolean esMigratorio;
    private int anios;

    public Pajaro(String raza, double tamanoAlas, String tonalidadPlumas, boolean esMigratorio, int anios) {
        this.raza = raza;
        this.tamanoAlas = tamanoAlas;
        this.tonalidadPlumas = tonalidadPlumas;
        this.esMigratorio = esMigratorio;
        this.anios = anios;
    }

    public void desplazarse() {
        System.out.println("El pájaro " + raza + " está volando.");
    }

    public void trinar() {
        System.out.println("El pájaro está cantando.");
    }

    public static void categoria() {
        System.out.println("Clasificación: " + TIPO);
    }
}