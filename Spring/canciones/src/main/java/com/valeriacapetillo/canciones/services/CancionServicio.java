package com.valeriacapetillo.canciones.services;

import com.valeriacapetillo.canciones.models.Cancion;
import com.valeriacapetillo.canciones.repositories.CancionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CancionServicio {

    @Autowired
    private CancionRepositorio repositorio;

    public List<Cancion> obtenerTodasLasCanciones() {
        return repositorio.findAll();
    }

    public Cancion obtenerCancionPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }
}
