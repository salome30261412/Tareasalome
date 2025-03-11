package Tarea_Salome;

public class Vehiculo {
    public static final  int RUEDAS = 4;
    public static final  String  TIPO = "Automovil";

    public String marca;
    private String modelo;
    public int año;
    private double velocidad;
    private boolean electrico;

    public Vehiculo(String marca, String modelo, int año,double velocidad,boolean electrico) {
       this.marca = marca;
       this.modelo = modelo;
       this.año = año;
       this.velocidad = velocidad;
       this.electrico = electrico;
    }
    public void acelerar(){
        velocidad += 10;
        System.out.println("Velocidad actual: " + velocidad);
    }
    public void desacelerar(){
        velocidad -= 10;
        System.out.println("Velocidad reducida: " + velocidad);
    }
    public static void mostrarTipo(){
        System.out.println("Tipo de vehiculo: "+TIPO);
    }
}
