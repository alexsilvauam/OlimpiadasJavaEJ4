package model;

import java.util.Collection;

public class Inventario <T extends Producto>{
    private Collection<T> productos;
    public void setProducto(T producto) {
        productos.add(producto);
    }

    public void getProductos() {
        productos.forEach(producto -> System.out.println(producto));
    }
}
