package model;

public class Ropa implements Producto {
    // variables
    private String nombre;
    private Double precio;
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    // constructor
    public Ropa(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // to string
    @Override
    public String toString() {
        return "Ropa{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
