package Tarea_Salome;

public class Bolso {
    public static final String MATERIAL = "Cuero";
    public static final int COMPARTIMENTOS = 5;

    public String marca;
    private String color;
    private String tamano;
    public boolean impermeable;
    private int capacidad;

    public Bolso(String marca, String color, String tamano, boolean impermeable, int capacidad) {
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
        this.impermeable = impermeable;
        this.capacidad = capacidad;
    }

    public void abrir() {
        System.out.println("Abriendo el bolso de marca " + marca);
    }

    public void cerrar() {
        System.out.println("Cerrando el bolso.");
    }
    public static void TipoMaterial(){
        System.out.println("Material: "+MATERIAL);
    }
}
