package com.bootcamp.tiendaVideojuegos.controllers;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation;


@RestController

public class ControladorVideojuegos implements ManejoDeFechas{

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public ControladorVideojuegos(ArrayList<videoJuego> videoJuegos) {
        this.videoJuegos = videoJuegos;
    }

    private ArrayList<videoJuego> videoJuegos;

    public ControladorVideojuegos () {
    this.videoJuegos = new ArrayList<>();
            Videojuego v1 = new Videojuego("Silent Hill 2",
                        "Having received a letter from his deceased wife, James heads to where they shared so many memories, in the hope of seeing her one more time: Silent Hill.",
                        "", formatearFecha("2024-10-08"), 4.8, new ArrayList(Arrays.asList("Adventure", "Action")),
                        new ArrayList(Arrays.asList("PC", "PlayStation")));
            Videojuego v2 = new Videojuego("Outlast",
                        "Outlast follows the story of investigative journalist Miles Upshur, that got the lead on the inhuman experiments, performed on the asylum patients.",
                        "", formatearFecha("2013-09-03"), 4.5, new ArrayList(Arrays.asList("Indie", "Action")),
                        new ArrayList(Arrays.asList("PC", "PlayStation", "Xbox", "Nintendo")));
            Videojuego v3 = new Videojuego("Resident Evil",
                        "The story follows the survivors of a zombie virus outbreak in the fictional Raccoon City.", "",
                        formatearFecha("2019-01-25"), 4.3, new ArrayList(Arrays.asList("Shooter", "Action", "Adventure")),
                        new ArrayList(Arrays.asList("PC", "PlayStation", "Xbox", "Nintendo")));
    this.Videojuego.add(v1);
    this.Videojuego.add(v2);
    this.Videojuego.add(v3);
    }           

    @RequestMapping(value = "/saludo", method = RequestMethod.GET)
    public String inicio() {
        return "Hola Spring Boot!";
    } 
    @GetMapping("/getAll")
    public String getvideoJuegos(){
        String str = "";
        for(Videojuego v ; this.videoJuegos){
            str += v.toString();
        }
        return str;
    }

    public ArrayList<videoJuego> getVideoJuegos() {
        return videoJuegos;
    }

    public void setVideoJuegos(ArrayList<videoJuego> videoJuegos) {
        this.videoJuegos = videoJuegos;
    }

}