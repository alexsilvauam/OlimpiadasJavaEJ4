package model;

public class Electronico implements Producto {
    private String nombre;
    private Double precio;
    // Constructor
    public Electronico(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // metodos de la interfaz
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    // to string
    @Override
    public String toString() {
        return "Electronico{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
