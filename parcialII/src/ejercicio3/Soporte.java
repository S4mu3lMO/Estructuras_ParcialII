package ejercicio3;

import Estructuras.Cola;

public class Soporte {

    public static Cola<Solicitud> seleccionarSolicitudes(Cola<Solicitud> pendientes, int minutos) {
        Cola<Solicitud> seleccionadas = new Cola<>();
        if (minutos <= 0) return seleccionadas;

        int restante = minutos;
        Cola<Solicitud> resto = new Cola<>();

        // Pasada 1: prioridad ALTA
        while (!pendientes.estaVacia()) {
            Solicitud s = pendientes.desencolar();
            if (s.getPrioridad() == Prioridad.ALTA && s.getDuracion() <= restante) {
                seleccionadas.encolar(s);
                restante -= s.getDuracion();
            } else {
                resto.encolar(s);
            }
        }

        // Pasada 2: prioridad NORMAL (lo que no se elige vuelve a pendientes)
        while (!resto.estaVacia()) {
            Solicitud s = resto.desencolar();
            if (s.getPrioridad() == Prioridad.NORMAL && s.getDuracion() <= restante) {
                seleccionadas.encolar(s);
                restante -= s.getDuracion();
            } else {
                pendientes.encolar(s);
            }
        }
        return seleccionadas;
    }
}