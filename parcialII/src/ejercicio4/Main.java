package ejercicio4;

public class Main {
    public static void main(String[] args) {
        ArbolEquipos a = new ArbolEquipos();
        int[] datos = {50, 30, 70, 20, 40, 60, 80, 55, 65};
        for (int d : datos) a.insertar(d);

        System.out.println(ArbolEquipos.contarEquiposEnRango(a.getRaiz(), 30, 60)); // 30,40,50,60,55 = 5
        System.out.println(ArbolEquipos.contarEquiposEnRango(a.getRaiz(), 61, 100)); // 65,70,80 = 3
        System.out.println(ArbolEquipos.contarEquiposEnRango(a.getRaiz(), 60, 30));  // 0
        System.out.println(ArbolEquipos.contarEquiposEnRango(null, 1, 100));         // 0
    }
}