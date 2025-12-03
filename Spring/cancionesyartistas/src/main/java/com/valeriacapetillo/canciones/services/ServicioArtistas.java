package com.valeriacapetillo.canciones.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valeriacapetillo.canciones.models.Artista;
import com.valeriacapetillo.canciones.repositories.ArtistaRepositorio;

@Service
public class ServicioArtistas {

    @Autowired
    private ArtistaRepositorio artistaRepositorio;
    
    public List<Artista> obtenerTodosLosArtistas() {
        return artistaRepositorio.findAll();
    }
    
    public Artista obtenerArtistaPorId(Long id) {
        return artistaRepositorio.findById(id).orElse(null);
    }
    
    public Artista agregarArtista(Artista artista) {
        return artistaRepositorio.save(artista);
    }
    
}