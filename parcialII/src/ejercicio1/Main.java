package ejercicio1;

import Estructuras.Pila;

public class Main {
    public static void main(String[] args) {
        Pila<Operacion> h = new Pila<>();
        h.push(new Operacion("O1", EstadoOperacion.ANULADA));
        h.push(new Operacion("O2", EstadoOperacion.CONFIRMADA));
        h.push(new Operacion("O3", EstadoOperacion.CONFIRMADA));
        h.push(new Operacion("O4", EstadoOperacion.ANULADA));
        h.push(new Operacion("O5", EstadoOperacion.CONFIRMADA));

        System.out.println("Original : " + h);
        System.out.println("n = 2    : " + Historial.obtenerUltimasConfirmadas(h, 2)); // O5 -> O3
        System.out.println("n = 10   : " + Historial.obtenerUltimasConfirmadas(h, 10));
        System.out.println("n = 0    : " + Historial.obtenerUltimasConfirmadas(h, 0));
        System.out.println("Original : " + h); // igual que al inicio
    }
}