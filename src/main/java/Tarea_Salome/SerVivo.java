package Tarea_Salome;

public class SerVivo {
    public static final String CLASIFICACION = "Animalia";
    public static final int VIDA_PROMEDIO = 10;

    public String apodo;
    public int anios;
    public double masa;
    private String tipo;
    private String domesticado;

    public SerVivo(String apodo, int anios, double masa, String tipo, String domesticado) {
        this.apodo = apodo;
        this.anios = anios;
        this.masa = masa;
        this.tipo = tipo;
        this.domesticado = domesticado;
    }
    public void alimentarse(){
        System.out.println(apodo + " está comiendo.");
    }
    public void descansar(){
        System.out.println(apodo + " está durmiendo.");
    }
    public static void mostrarClasificacion(){
        System.out.println("Clasificación: " + CLASIFICACION);
}
}