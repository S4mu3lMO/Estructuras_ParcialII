package ejercicio2;

public class Accion {
    private String descripcion;
    public Accion(String descripcion) { this.descripcion = descripcion; }
    public String getDescripcion() { return descripcion; }
    @Override
    public String toString() { return descripcion; }
}