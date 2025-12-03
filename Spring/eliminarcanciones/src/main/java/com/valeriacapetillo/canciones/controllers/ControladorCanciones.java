package com.valeriacapetillo.canciones.controllers;

import com.valeriacapetillo.canciones.models.Cancion;
import com.valeriacapetillo.canciones.services.CancionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

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

    // AQUÍ el cambio para usar /canciones/formulario/agregar/{idCancion}
    @GetMapping("/canciones/formulario/agregar/{idCancion}")
    public String formularioAgregarCancion(
            @PathVariable("idCancion") Long idCancion,
            @ModelAttribute("cancion") Cancion cancion) {
        return "agregarCancion";
    }


    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(
            @Valid @ModelAttribute("cancion") Cancion cancion,
            BindingResult validaciones) {

        if (validaciones.hasErrors()) {
            return "agregarCancion";
        }

        servicio.agregarCancion(cancion);
        return "redirect:/canciones";
    }

    @GetMapping("/canciones/formulario/editar/{idCancion}")
    public String formularioEditarCancion(@PathVariable("idCancion") Long idCancion, Model model) {
        Cancion cancion = servicio.obtenerCancionPorId(idCancion);
        model.addAttribute("cancion", cancion);
        return "editarCancion"; 
    }

    @PostMapping("/canciones/procesa/editar/{idCancion}")
    public String procesarEditarCancion(
            @Valid @ModelAttribute("cancion") Cancion cancion,
            BindingResult validaciones,
            @PathVariable("idCancion") Long idCancion) {

        if (validaciones.hasErrors()) {
            return "editarCancion";
        }

        cancion.setId(idCancion);
        servicio.actualizaCancion(cancion);
        return "redirect:/canciones";
    }
    @GetMapping("/canciones/eliminar/{idCancion}")
    public String procesarEliminarCancion(@PathVariable("idCancion") Long idCancion) {
        servicio.eliminaCancion(idCancion);
        return "redirect:/canciones";
    }

}
