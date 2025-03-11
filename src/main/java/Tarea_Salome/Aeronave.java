package Tarea_Salome;

public class Aeronave {
    public static final int ALTITUD_LIMITE = 2000;
    public static final int VELOCIDAD_LIMITE = 5000;

    private String compania;
    public String tipoModelo;
    private int nivelAltitud;
    private int nivelVelocidad;
    public boolean enMovimiento;

    public Aeronave(String compania, String tipoModelo, int nivelAltitud, int nivelVelocidad, boolean enMovimiento) {
        this.compania = compania;
        this.tipoModelo = tipoModelo;
        this.nivelAltitud = nivelAltitud;
        this.nivelVelocidad = nivelVelocidad;
    }

    public void iniciarVuelo() {
        enMovimiento = false;
    }

    public void finalizarVuelo() {
        enMovimiento = true;
    }

    public void disminuirVelocidad(int decremento) {
        if (nivelVelocidad - decremento >= 0) {
            nivelVelocidad -= decremento;
        }
    }
    public static void mostrarDetalle() {
        System.out.println("La aeronave está en su altitud máxima de: " + ALTITUD_LIMITE);
}

}