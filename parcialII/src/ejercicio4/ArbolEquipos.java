package ejercicio4;

public class ArbolEquipos {
    private NodoEquipo raiz;

    public void insertar(int codigo) { raiz = insertar(raiz, codigo); }

    private NodoEquipo insertar(NodoEquipo n, int codigo) {
        if (n == null) return new NodoEquipo(codigo);
        if (codigo < n.codigo) n.izq = insertar(n.izq, codigo);
        else if (codigo > n.codigo) n.der = insertar(n.der, codigo);
        return n; // códigos únicos: ignora repetidos
    }

    public NodoEquipo getRaiz() { return raiz; }

    public static int contarEquiposEnRango(NodoEquipo raiz, int inf, int sup) {
        if (raiz == null || inf > sup) return 0;
        if (raiz.codigo < inf) return contarEquiposEnRango(raiz.der, inf, sup);
        if (raiz.codigo > sup) return contarEquiposEnRango(raiz.izq, inf, sup);
        return 1 + contarEquiposEnRango(raiz.izq, inf, sup)
                + contarEquiposEnRango(raiz.der, inf, sup);
    }
}