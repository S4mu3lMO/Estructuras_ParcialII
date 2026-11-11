package Estructuras;

public class Nodo<T> {
    public T dato;
    public Nodo<T> siguiente;
    public Nodo(T dato) { this.dato = dato; }
}