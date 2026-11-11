package ejercicio2;

import Estructuras.Pila;

public class Editor {

    public static Pila<Accion> obtenerSegmento(Pila<Accion> pila, int inicio, int fin) {
        Pila<Accion> resultado = new Pila<>();
        Pila<Accion> aux = new Pila<>();
        int total = 0;

        while (!pila.estaVacia()) {
            aux.push(pila.pop());
            total++;
        }

        boolean invalido = inicio < 1 || inicio > fin || fin > total;

        int posicion = total;  // el primero que sale de aux es el fondo
        while (!aux.estaVacia()) {
            Accion a = aux.pop();
            pila.push(a);      // restaura el original
            if (!invalido && posicion >= inicio && posicion <= fin) {
                resultado.push(a);
            }
            posicion--;
        }
        return resultado;
    }
}