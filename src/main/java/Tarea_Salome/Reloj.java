package Tarea_Salome;

public class Reloj {
    public static final String FORMATO_HORA ="24H";
    public static final int MAX_ALARMAS =5;

    public String marca;
    public boolean digital;
    private int hora;
    private int minutos;
    public boolean alarmaActiva;

    public Reloj(String marca, boolean digital, int hora, int minutos, boolean alarmaActiva){
        this.marca = marca;
        this.digital = digital;
        this.hora = hora;
        this.minutos = minutos;
        this.alarmaActiva = alarmaActiva;
    }

    public void mostrarHora(){
        System.out.println("Hora actual: "+hora+":"+minutos);
    }
    public void activarAlarma(){
        alarmaActiva = true;
        System.out.println("Alarma activada");
    }
    public static void mostrarMaxAlarmas(){
        System.out.println("Maximo de alarmas: "+MAX_ALARMAS);
    }
}
