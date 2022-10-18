package com.dh.clase39.service;

import com.dh.clase39.exceptions.BadRequestException;
import com.dh.clase39.model.Destino;
import com.dh.clase39.model.Estado;
import com.dh.clase39.model.Paquete;
import com.dh.clase39.repository.IPaqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaqueteServiceImpl implements IParqueteService{
    private IPaqueteRepository paqueteRepository;
    @Autowired
    public PaqueteServiceImpl(IPaqueteRepository paqueteRepository) {
        this.paqueteRepository = paqueteRepository;
    }

    @Override
    public List<Paquete> buscarTodosLosPaquetes() {
        return paqueteRepository.findAll();
    }

    @Override
    public Paquete guardarPaquete(Paquete paquete) throws BadRequestException {

        // tenemos que agregar la parte de la exception
        // pensemos la condición: que venga nulo
        if (Destino.isDestinoCompleto(paquete.getDestino())){
            return paqueteRepository.save(paquete);
        }
        else{
            throw new BadRequestException("Destino sin cargar, Error.");
        }


    }

    @Override
    public List<Paquete> buscarTodosLosPaquetesPorEstado(Estado estado) {
        return paqueteRepository.findAllByEstado(estado);
    }
}
