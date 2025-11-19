package org.example;

import model.*;

import java.util.ArrayList;
import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Se crea la coleccion de productos
        Collection productos = new ArrayList() {};
        // Se crea inventario
        Inventario invt = new Inventario(productos);

        // Se agregan productos
        Producto tv = new Electronico("tele", 50.0);
        // Se mandan los prodcutos al inventario
        invt.setProducto(tv);
        Producto camisa = new Ropa("shirt", 2.0);
        invt.setProducto(camisa);
        Producto pizza = new Comida("pizza", 10.0);
        invt.setProducto(pizza);
        Producto cel = new Electronico("celular", 200.0);
        invt.setProducto(cel);
        Producto pantalon = new Ropa("pantalon", 12.0);
        invt.setProducto(pantalon);

        // Se muestran los productos
        invt.getProductos();

    }
}