package Tarea_Salome;

public class Computadora {
    public static final String MARCA_DEFAULT ="Generica";
    public static final int RAM_DEFAULT = 8;

    public String marca;
    private String procesador;
    private int ram;
    private double almacenamiento;
    private boolean encendida;

    public Computadora(String marca, String procesador, int ram, double almacenamiento, boolean encendida) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.encendida = encendida;
    }
    public void encender(){
        encendida = true;
        System.out.println("Encendiendo computadora...");
    }
    public void apagar(){
        encendida = false;
        System.out.println("Apagando computadora...");
    }
    public static void mostrarMarca(){
        System.out.println("Marca computador: "+ MARCA_DEFAULT);
    }

}
