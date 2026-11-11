package ejercicio3;

import Estructuras.Cola;

public class Main {
    public static void main(String[] args) {
        Cola<Solicitud> c = new Cola<>();
        c.encolar(new Solicitud("S1", Prioridad.NORMAL, 10));
        c.encolar(new Solicitud("S2", Prioridad.ALTA, 30));
        c.encolar(new Solicitud("S3", Prioridad.ALTA, 15));
        c.encolar(new Solicitud("S4", Prioridad.NORMAL, 5));

        Cola<Solicitud> sel = Soporte.seleccionarSolicitudes(c, 25);
        System.out.println("Seleccionadas: " + sel); // S3 -> S1
        System.out.println("Pendientes   : " + c);   // S2 -> S4

        Cola<Solicitud> vacia = Soporte.seleccionarSolicitudes(c, 0);
        System.out.println("Con 0 min    : " + vacia + " | pendientes: " + c);
    }
}