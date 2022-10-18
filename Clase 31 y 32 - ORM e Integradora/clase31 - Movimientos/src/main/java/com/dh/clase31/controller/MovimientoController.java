package com.dh.clase31.controller;

import com.dh.clase31.entity.Movimiento;
import com.dh.clase31.service.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {

    @Autowired
    private IMovimientoService service;

    @PostMapping
    public ResponseEntity<String> registrarMovimiento(@RequestBody Movimiento movimiento){
        return ResponseEntity.ok(service.registrarMovimiento(movimiento));
    }

    @GetMapping
    public ResponseEntity<List<Movimiento>> listarMovimientos(){
        return ResponseEntity.ok(service.listarMovimientos());
    }

}
