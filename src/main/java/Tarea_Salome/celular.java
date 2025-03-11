package Tarea_Salome;

public class celular {
    public static final String MARCA = "Iphone";
    public static final int GB = 64;

    public String marca;
    private String color;
    private int capacidad;
    public String modelo;
    private int resolucionCamaraPrincipal = 108;

    public celular(String marca, String color, int capacidad, String modelo,int resolucionCamaraPrincipal) {
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.resolucionCamaraPrincipal = resolucionCamaraPrincipal;
    }

    public void vender(){
        System.out.println("Vendiendo celular "+ marca);
    }
    public void describir(){
        System.out.println("Describir celular "+ marca+"Color: "+color+"Capacidad: "+capacidad+"Modelo: "+modelo);
    }
    public static void mostrarMemoria(){
        System.out.println("Memoria del celular: "+ GB);
    }
}
