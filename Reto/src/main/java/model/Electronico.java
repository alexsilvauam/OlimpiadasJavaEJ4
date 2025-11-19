package model;

public class Electronico implements Producto {
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
