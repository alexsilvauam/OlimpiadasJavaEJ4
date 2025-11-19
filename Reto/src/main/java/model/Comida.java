package model;

public class Comida implements Producto{
    // atributos
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
    public Comida(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //to string
    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
