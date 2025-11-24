package com.clases;

public class Televisor extends ProductoElectrodomestico {
    private int tamañoPantalla;
    private String resolucion;

    public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.tamañoPantalla = tamañoPantalla;
        this.resolucion = resolucion;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n📺 TELEVISOR");
        super.mostrarInformacion();
        System.out.println("Tamaño de Pantalla: " + tamañoPantalla + " pulgadas");
        System.out.println("java com.AplicacionResolución: " + resolucion);
    }
}