package com.dh.clase39.service;

import com.dh.clase39.exceptions.BadRequestException;
import com.dh.clase39.model.Estado;
import com.dh.clase39.model.Paquete;

import java.util.List;

public interface IParqueteService {
    List<Paquete> buscarTodosLosPaquetes();
    Paquete guardarPaquete(Paquete paquete) throws BadRequestException;
    List<Paquete> buscarTodosLosPaquetesPorEstado(Estado estado);
}
