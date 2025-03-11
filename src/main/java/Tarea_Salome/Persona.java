package Tarea_Salome;

public class Persona {
    public static final String SER_VIVO = "Humano";
    public static final int ESPERANZA_VIDA = 70;

    public String nombre;
    private String ocupacion;
    public int edad;
    private double altura;
    private double peso;

    public Persona(String nombre, String ocupacion, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    public void trabajar(){
        System.out.println(nombre + "esta trabajando...");
    }
    public void descansar(){
        System.out.println(nombre + "esta descansando...");
    }
    public static void mostrarSerVivo(){
        System.out.println("Tipo de ser vivo: "+SER_VIVO);
    }
}
