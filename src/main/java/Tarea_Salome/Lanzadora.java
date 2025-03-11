/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea_Salome;

/**
 *
 * @author Salome
 */
public class Lanzadora {
    public static void main(String[] args) {
        Cargador cargador = new Cargador("Samsung", true, 25, "USB-C", 0.2);
        cargador.cargar();

        Control control = new Control("Sony", "TV", true, 2, "Televisor");
        control.encender();

        Ventilador ventilador = new Ventilador("Oster", 3, false, "Blanco", 1.5);
        ventilador.encender();

        Bombillo bombillo = new Bombillo("Philips", 10, "Blanco", false, 50000);
        bombillo.encender();

        SerVivo animal = new SerVivo("León", 5, 1.5, "salvaje","Libre");
        animal.alimentarse();

        Pajaro ave = new Pajaro("Loro", 3, "Verde", true,2);
        ave.desplazarse();

        Aeronave avion = new Aeronave("Avianca", "747", 900, 416,false);
        avion.disminuirVelocidad(0);

        Bicicleta bicicleta = new Bicicleta("Venzo", "Montaña", "Negro", 2019,false);
        bicicleta.pedalear();

        Vehiculo vehiculo = new Vehiculo("chevrolet","Logan",2018,170,true);
        vehiculo.acelerar();
    } 
}
