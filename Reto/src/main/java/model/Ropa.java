package model;

public class Ropa implements Producto {
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
}
