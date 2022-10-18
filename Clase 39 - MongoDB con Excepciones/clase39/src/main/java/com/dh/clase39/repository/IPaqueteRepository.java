package com.dh.clase39.repository;

import com.dh.clase39.model.Estado;
import com.dh.clase39.model.Paquete;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IPaqueteRepository extends MongoRepository<Paquete,Long> {
    //para agregar un nuevo paquete usamos .save
    //para listar todos los paquetes usamos .findAll
    //para listar todos los paquetes que están en camino
    List<Paquete> findAllByEstado(Estado estado);
}
