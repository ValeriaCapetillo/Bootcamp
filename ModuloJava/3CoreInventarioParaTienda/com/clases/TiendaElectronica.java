package com.clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica() {
        this.listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
        System.out.println(" Producto agregado: " + producto.getNombre());
    }

    public void mostrarTodosLosProductos() {
        System.out.println("\n🏪 ===== INVENTARIO DE LA TIENDA =====");
        if (listaDeProductos.isEmpty()) {
            System.out.println("❌ No hay productos en el inventario.");
        } else {
            for (ProductoElectrodomestico producto : listaDeProductos) {
                producto.mostrarInformacion();
                System.out.println("-----------------------------------");
            }
        }
    }

    public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void realizarVenta(String nombreProducto, int cantidad) {
        ProductoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);
        
        if (producto == null) {
            System.out.println("❌ Producto no encontrado: " + nombreProducto);
            return;
        }

        if (producto.getCantidadDisponible() == 0) {
            System.out.println("⚠️  Producto agotado: " + nombreProducto);
            return;
        }

        if (producto.getCantidadDisponible() < cantidad) {
            System.out.println("⚠️  Stock insuficiente. Disponibles: " + producto.getCantidadDisponible());
            return;
        }

        producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
        System.out.println("Venta realizada: " + cantidad + " unidad(es) de " + nombreProducto);
        System.out.println("Stock restante: " + producto.getCantidadDisponible());
    }

    public ArrayList<ProductoElectrodomestico> getListaDeProductos() {
        return listaDeProductos;
    }
}
