package Estructuras;

import Estructuras.Nodo;

public class Cola<T> {
    private Nodo<T> primero, ultimo;
    private int tamanio;

    public void encolar(T dato) {
        Nodo<T> n = new Nodo<>(dato);
        if (estaVacia()) primero = n; else ultimo.siguiente = n;
        ultimo = n;
        tamanio++;
    }

    public T desencolar() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        T dato = primero.dato;
        primero = primero.siguiente;
        if (primero == null) ultimo = null;
        tamanio--;
        return dato;
    }

    public T verFrente() {
        if (estaVacia()) throw new RuntimeException("Cola vacía");
        return primero.dato;
    }

    public boolean estaVacia() { return primero == null; }
    public int getTamanio() { return tamanio; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Nodo<T> a = primero; a != null; a = a.siguiente) {
            sb.append(a.dato);
            if (a.siguiente != null) sb.append(" -> ");
        }
        return sb.length() == 0 ? "(vacía)" : sb.toString();
    }
}