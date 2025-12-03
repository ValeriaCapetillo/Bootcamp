package com.valeriacapetillo.canciones.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.valeriacapetillo.canciones.models.Artista;

@Repository
public interface ArtistaRepositorio extends CrudRepository<Artista, Long> {
    List<Artista> findAll();
}
