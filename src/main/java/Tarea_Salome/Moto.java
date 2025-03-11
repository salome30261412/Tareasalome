package Tarea_Salome;

public class Moto {
    public static final int RUEDAS = 4;
    public static final String TIPO = "Alto cilindraje";

    public String marca;
    public String modelo;
    public int año;
    private double velocidad;
    private boolean electrico;

    public Moto(String marca, String modelo, int año, double velocidad, boolean electrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidad = velocidad;
        this.electrico = electrico;
    }
    public void acelerarMoto(){
        velocidad += 30;
        System.out.println("Velocidad actual: "+velocidad);
    }
    public void desacelerarMoto(){
        velocidad -= 30;
        System.out.println("Velocidad reducida: "+velocidad);
    }
    public static void mostrarTipo(){
       System.out.println("Tipo del vehiculo: "+TIPO);
    }
}
