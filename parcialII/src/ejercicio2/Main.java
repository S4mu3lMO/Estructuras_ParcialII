package ejercicio2;

import Estructuras.Pila;

public class Main {
    public static void main(String[] args) {
        Pila<Accion> p = new Pila<>();
        for (int i = 1; i <= 6; i++) p.push(new Accion("A" + i));

        System.out.println("Original      : " + p);                              // A6..A1
        System.out.println("inicio=2,fin=4: " + Editor.obtenerSegmento(p, 2, 4)); // A5 -> A4 -> A3
        System.out.println("inicio=3,fin=3: " + Editor.obtenerSegmento(p, 3, 3)); // A4
        System.out.println("inicio=0,fin=3: " + Editor.obtenerSegmento(p, 0, 3)); // vacía
        System.out.println("inicio=4,fin=2: " + Editor.obtenerSegmento(p, 4, 2)); // vacía
        System.out.println("inicio=2,fin=9: " + Editor.obtenerSegmento(p, 2, 9)); // vacía
        System.out.println("Original      : " + p);                              // igual
    }
}