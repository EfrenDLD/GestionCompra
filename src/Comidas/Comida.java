package Comidas;

public class Comida{
    private String descripcion;
    private String nombre;
    private int precio;

    public Comida(String descripcion, String nombre, int precio) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tdescripcion de la bebida: " + descripcion + " Precio de la bebida: " + precio;
    }
}