package com.valeriacapetillo.peliculas_y_directores.controllers;

import java.util.HashMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class controladorPeliculas {

    private static final HashMap<String, String> listaPeliculas = new HashMap<>();

    public controladorPeliculas() {
        listaPeliculas.put("Winnie the Pooh", "Don Hall");
        listaPeliculas.put("El zorro y el sabueso", "Ted Berman");
        listaPeliculas.put("Tarzán", "Kevin Lima");
        listaPeliculas.put("Mulán", "Barry Cook");
        listaPeliculas.put("Oliver", "Kevin Lima");
        listaPeliculas.put("Big Hero 6", "Don Hall");
    }

    @RequestMapping(value = "/peliculas", method = RequestMethod.GET)
    public String obtenerTodasLasPeliculas() {
        String resultado = "Películas disponibles:<br>";
        for (String nombre : listaPeliculas.keySet()) {
            resultado += nombre + "<br>";
        }
        return resultado;
    }

    @RequestMapping(value = "/peliculas/{nombre}", method = RequestMethod.GET)
    public String obtenerPeliculaPorNombre(@PathVariable String nombre) {
        for (String nombrePeli : listaPeliculas.keySet()) {
            if (nombrePeli.equalsIgnoreCase(nombre)) {
                return "Película: " + nombrePeli + ", Director: " + listaPeliculas.get(nombrePeli);
            }
        }
        return "La película no se encuentra en nuestra lista.";
    }

    @RequestMapping(value = "/peliculas/director/{nombre}", method = RequestMethod.GET)
    public String obtenerPeliculasPorDirector(@PathVariable String nombre) {
        String resultado = "Películas dirigidas por " + nombre + ":<br>";
        boolean encontrado = false;
        for (String nombrePeli : listaPeliculas.keySet()) {
            String director = listaPeliculas.get(nombrePeli);
            if (director.equalsIgnoreCase(nombre)) {
                resultado += nombrePeli + "<br>";
                encontrado = true;
            }
        }
        if (!encontrado) {
            return "No contamos con películas con ese director en nuestra lista.";
        }
        return resultado;
    }
}
