package model;

import java.util.Collection;

public class Inventario <T extends Producto>{
    // Se crea la coleccion de prodcutos
    private Collection<T> productos;
    // Metodo para agregar
    public void setProducto(T producto) {
        productos.add(producto);
    }

    // Meotodo para imprimir
    public void getProductos() {
        productos.forEach(producto -> System.out.println(producto));
    }

    // Constructor
    public Inventario(Collection<T> productos) {
        this.productos = productos;
    }
}
