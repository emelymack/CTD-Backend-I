package com.dh.clase39.controller;

import com.dh.clase39.exceptions.BadRequestException;
import com.dh.clase39.model.Estado;
import com.dh.clase39.model.Paquete;
import com.dh.clase39.service.IParqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paquetes")
public class PaqueteController {
    @Autowired
    private IParqueteService paqueteService;

    @PostMapping
    public ResponseEntity<Paquete> registrarPaquete(@RequestBody Paquete paquete) throws BadRequestException {
        return ResponseEntity.ok(paqueteService.guardarPaquete(paquete));
    }

    @GetMapping
    public ResponseEntity<List<Paquete>> listarPaquetes(){
        return ResponseEntity.ok(paqueteService.buscarTodosLosPaquetes());
    }

    @GetMapping("/en-camino")
    public ResponseEntity<List<Paquete>> listarPaquetesEnCamino(){
        return ResponseEntity.ok(paqueteService.buscarTodosLosPaquetesPorEstado(Estado.EN_CAMINO));
    }
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> tratamientoBadRequest(BadRequestException bre){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bre.getMessage());
    }
}
