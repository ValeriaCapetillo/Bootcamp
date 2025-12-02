package com.valeriacapetillo.canciones.repositories;

import com.valeriacapetillo.canciones.models.Cancion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CancionRepositorio extends CrudRepository<Cancion, Long> {
    List<Cancion> findAll();
}
