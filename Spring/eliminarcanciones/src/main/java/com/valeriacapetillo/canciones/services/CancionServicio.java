package com.valeriacapetillo.canciones.services;

import com.valeriacapetillo.canciones.models.Cancion;
import com.valeriacapetillo.canciones.repositories.CancionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CancionServicio {

    @Autowired
    private CancionRepositorio cancionRepositorio;

    public List<Cancion> obtenerTodasLasCanciones() {
        return cancionRepositorio.findAll();
    }

    public Cancion obtenerCancionPorId(Long id) {
        return cancionRepositorio.findById(id).orElse(null);
    }

    // +Agregar Canciones
    public Cancion agregarCancion(Cancion cancion) {
        return cancionRepositorio.save(cancion);
    }

    //Actualizar canciones
    public Cancion actualizaCancion(Cancion cancion) {
        return cancionRepositorio.save(cancion);
    }
    //borrar las canciones 
    public void eliminaCancion(Long id) {
        cancionRepositorio.deleteById(id);
    }
    
}
