package model;

public class Comida implements Producto{
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
