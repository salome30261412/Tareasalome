package Tarea_Salome;

public class Television {
    public static final String TIPO = "LED";
    public static final int MAX_VOLUMEN = 100;

    public String marca;
    private int volumen;
    private int tamaño;
    public boolean encendida;
    public String resolucion;

    public Television(String marca, int tamaño, int volumen, String resolucion, boolean encendida) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.volumen = volumen;
        this.resolucion = resolucion;
        this.encendida = encendida;
    }
    public void encender(){
        encendida = true;
        System.out.println("Television encendida");
    }
    public void apagar(){
        encendida = false;
        System.out.println("Television apagada");
    }
    public static void volumen(){
        System.out.println("Volumen maximo: "+MAX_VOLUMEN);
    }
}
