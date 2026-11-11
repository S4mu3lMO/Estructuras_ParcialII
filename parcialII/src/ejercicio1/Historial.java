package ejercicio1;

import Estructuras.Pila;

public class Historial {

    public static Pila<Operacion> obtenerUltimasConfirmadas(Pila<Operacion> historial, int n) {
        Pila<Operacion> resultado = new Pila<>();
        if (n <= 0) return resultado;

        Pila<Operacion> aux = new Pila<>();        // para restaurar el original
        Pila<Operacion> invertida = new Pila<>();  // confirmadas, la más reciente queda al fondo
        int contadas = 0;

        while (!historial.estaVacia()) {
            Operacion op = historial.pop();
            aux.push(op);
            if (contadas < n && op.getEstado() == EstadoOperacion.CONFIRMADA) {
                invertida.push(op);
                contadas++;
            }
        }

        // restaurar historial original (mismo orden)
        while (!aux.estaVacia()) historial.push(aux.pop());

        // invertir para dejar la más reciente en el tope
        while (!invertida.estaVacia()) resultado.push(invertida.pop());

        return resultado;
    }
}