package com.valeriacapetillo.canciones.controllers;

import com.valeriacapetillo.canciones.models.Artista;
import com.valeriacapetillo.canciones.services.ServicioArtistas;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorArtistas {
    @Autowired
    private ServicioArtistas servicioArtistas;
    
    // /artistas – lista de artistas
    @GetMapping("/artistas")
    public String desplegarArtistas(Model model) {
        model.addAttribute("artistas", servicioArtistas.obtenerTodosLosArtistas());
        return "artistas";
    }
    
    // /artistas/detalle/{idArtista} – detalle de un artista
    @GetMapping("/artistas/detalle/{idArtista}")
    public String desplegarDetalleArtista(@PathVariable("idArtista") Long idArtista, Model model) {
        Artista artista = servicioArtistas.obtenerArtistaPorId(idArtista);
        model.addAttribute("artista", artista);
        return "detalleArtista";
    }
    
    // /artistas/formulario/agregar/{idArtista} – mostrar formulario
    @GetMapping("/artistas/formulario/agregar/{idArtista}")
    public String formularioAgregarArtista(
            @PathVariable("idArtista") Long idArtista,
            @ModelAttribute("artista") Artista artista) {
        return "agregarArtista";
    }
    
    // /artistas/procesa/agregar – procesar formulario
    @PostMapping("/artistas/procesa/agregar")
    public String procesarAgregarArtista(
            @Valid @ModelAttribute("artista") Artista artista,
            BindingResult validaciones) {
    
        if (validaciones.hasErrors()) {
            return "agregarArtista";
        }
    
        servicioArtistas.agregarArtista(artista);
        return "redirect:/artistas";
    }
    
}