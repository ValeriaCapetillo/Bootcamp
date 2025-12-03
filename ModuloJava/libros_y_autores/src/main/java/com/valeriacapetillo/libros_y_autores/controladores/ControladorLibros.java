package com.valeriacapetillo.libros_y_autores.controladores;

import java.util.HashMap;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorLibros {

    private static HashMap<String, String> listaLibros = new HashMap<>();

    public ControladorLibros() {
        listaLibros.put("Odisea", "Homero");
        listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
        listaLibros.put("El Código Da Vinci", "Dan Brown");
        listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
        listaLibros.put("El Hobbit", "J.R.R. Tolkien");
        listaLibros.put("El alquimista", "Paulo Coelho");
    }

    // /libros -> lista
    @GetMapping("/libros")
    public String obtenerTodosLosLibros(Model model) {
        Set<String> titulos = listaLibros.keySet();
        model.addAttribute("libros", titulos);
        return "libros";
    }

    // /libros/{nombre} -> detalle
    @GetMapping("/libros/{nombre}")
    public String obtenerInformacionDeLibro(@PathVariable String nombre, Model model) {
        String autorEncontrado = null;
        String tituloNormalizado = null;

        for (String titulo : listaLibros.keySet()) {
            if (titulo.equalsIgnoreCase(nombre)) {
                autorEncontrado = listaLibros.get(titulo);
                tituloNormalizado = titulo;
                break;
            }
        }

        if (autorEncontrado == null) {
            model.addAttribute("mensaje", "El libro no se encuentra en nuestra lista.");
        } else {
            model.addAttribute("nombreLibro", tituloNormalizado);
            model.addAttribute("nombreAutor", autorEncontrado);
        }
        return "detalleLibro";
    }

    // /libros/formulario -> formulario para agregar
    @GetMapping("/libros/formulario")
    public String formularioLibro() {
        return "formularioLibros";
    }

    // /procesa/libro -> recibe POST del formulario
    @PostMapping("/procesa/libro")
    public String procesaLibro(@RequestParam("nombreLibro") String nombreLibro,
                               @RequestParam("nombreAutor") String nombreAutor) {
                                listaLibros.put(nombreLibro, nombreAutor);
                                return "redirect:/libros";
    }
}
