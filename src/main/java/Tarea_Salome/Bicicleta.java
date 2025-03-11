package Tarea_Salome;

public class Moto {
    public static final int NUMERO_RUEDAS = 2;
    public static final String CLASE = "Deportiva";

    public String ensamblador;
    private String modeloMotor;
    public String acabado;
    private int anioFabricacion;
    private boolean esHibrida;

    public Moto(String ensamblador, String modeloMotor, String acabado, int anioFabricacion, Boolean esHibrida) {
        this.ensamblador = ensamblador;
        this.modeloMotor = modeloMotor;
        this.acabado = acabado;
        this.anioFabricacion = anioFabricacion;
        this.esHibrida = esHibrida;
    }

    public void acelerar() {
        System.out.println("Acelerando la moto: " + modeloMotor);
    }

    public static void mostrarClase() {
        System.out.println("Clase de moto: " + CLASE);
    }

    public void mostrarAcabado() {
        System.out.println("Acabado de la moto: " + acabado);
    }
}