package com.dh.clase31.service;

import com.dh.clase31.entity.Movimiento;

import java.util.List;

public interface IMovimientoService {
    List<Movimiento> listarMovimientos();
    String registrarMovimiento(Movimiento movimiento);
}
