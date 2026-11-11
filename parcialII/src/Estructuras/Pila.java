package Estructuras;

public class Pila<T> {
    private Nodo<T> tope;
    private int tamanio;

    public void push(T dato) {
        Nodo<T> n = new Nodo<>(dato);
        n.siguiente = tope;
        tope = n;
        tamanio++;
    }

    public T pop() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        T dato = tope.dato;
        tope = tope.siguiente;
        tamanio--;
        return dato;
    }

    public T peek() {
        if (estaVacia()) throw new RuntimeException("Pila vacía");
        return tope.dato;
    }

    public boolean estaVacia() { return tope == null; }
    public int getTamanio() { return tamanio; }

    @Override
    public String toString() {           // de tope a fondo, sin modificar la pila
        StringBuilder sb = new StringBuilder();
        for (Nodo<T> a = tope; a != null; a = a.siguiente) {
            sb.append(a.dato);
            if (a.siguiente != null) sb.append(" -> ");
        }
        return sb.length() == 0 ? "(vacía)" : sb.toString();
    }
}