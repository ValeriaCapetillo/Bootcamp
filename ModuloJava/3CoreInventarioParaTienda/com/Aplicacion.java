package com;

import com.clases.ProductoElectrodomestico;
import com.clases.Televisor;
import com.clases.ComputadoraPortatil;
import com.clases.TiendaElectronica;

public class Aplicacion {
    public static void main(String[] args) {
        
        // Crear la tienda
        TiendaElectronica tienda = new TiendaElectronica();
        
        System.out.println("🏪 SISTEMA DE INVENTARIO PARA TIENDA ELECTRÓNICA\n");
        
        // Crear productos
        Televisor tv1 = new Televisor("Samsung Smart TV 55", 12999.99, 15, 55, "4K UHD");
        Televisor tv2 = new Televisor("LG OLED 65", 25999.99, 8, 65, "8K");
        Televisor tv3 = new Televisor("Sony Bravia 43", 8499.99, 0, 43, "Full HD");
        
        ComputadoraPortatil laptop1 = new ComputadoraPortatil("MacBook Pro", 45999.99, 10, 
                                                               "Apple", 16, "MBP2023-001");
        ComputadoraPortatil laptop2 = new ComputadoraPortatil("Dell XPS 15", 32999.99, 5, 
                                                               "Dell", 32, "DXPS-2023-002");
        ComputadoraPortatil laptop3 = new ComputadoraPortatil("HP Pavilion", 15999.99, 20, 
                                                               "HP", 8, "HPP-2023-003");
        
        // Agregar productos al inventario
        System.out.println("➕ AGREGANDO PRODUCTOS AL INVENTARIO\n");
        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(tv3);
        tienda.agregarProducto(laptop1);
        tienda.agregarProducto(laptop2);
        tienda.agregarProducto(laptop3);
        
        // Mostrar todos los productos
        tienda.mostrarTodosLosProductos();
        
        // Realizar ventas
        System.out.println("\n💳 REALIZANDO VENTAS\n");
        tienda.realizarVenta("Samsung Smart TV 55", 3);
        System.out.println();
        tienda.realizarVenta("MacBook Pro", 2);
        System.out.println();
        tienda.realizarVenta("Dell XPS 15", 1);
        System.out.println();
        
        // Intentar vender un producto agotado
        tienda.realizarVenta("Sony Bravia 43", 1);
        System.out.println();
        
        // Intentar vender más de lo disponible
        tienda.realizarVenta("LG OLED 65", 10);
        System.out.println();
        
        // Mostrar inventario actualizado
        tienda.mostrarTodosLosProductos();
    }
}
