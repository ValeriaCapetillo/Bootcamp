package com.valeriacapetillo.canciones.controllers;

import com.valeriacapetillo.canciones.services.CancionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorCanciones {

    @Autowired
    private CancionServicio servicio;

    @GetMapping("/canciones")
    public String desplegarCanciones(Model model) {
        model.addAttribute("canciones", servicio.obtenerTodasLasCanciones());
        return "canciones";
    }

    @GetMapping("/canciones/detalle/{id}")
    public String detalleCancion(@PathVariable("id") Long id, Model model) {
        model.addAttribute("cancion", servicio.obtenerCancionPorId(id));
        return "detalleCancion";
    }
}
