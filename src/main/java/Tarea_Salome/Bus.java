package Tarea_Salome;

public class Bus {
    public static final int CAPACIDAD_MAXIMA=50;
    public static final String TIPO="Transporte Publico";

    public String empresa;
    private int pasajeros;
    private String ruta;
    public double velocidad;
    private boolean enServicio;

    public Bus(String empresa, int pasajeros, String ruta,double velocidad, boolean enServicio) {
        this.empresa=empresa;
        this.pasajeros=pasajeros;
        this.ruta=ruta;
        this.velocidad=velocidad;
        this.enServicio=enServicio;
    }

    public void recogerPasajeros(){
        System.out.println("Recogiendo pasajeros en la ruta: "+ruta);
    }
    public void detenerse(){
        System.out.println("El bus se ha detenido");
    }
    public static void MostrarTipo(){
        System.out.println("Tipo de bus: "+TIPO);
    }
}
