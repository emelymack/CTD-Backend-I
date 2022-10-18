package com.dh.clase23.service;

import com.dh.clase23.dominio.Turno;

import java.util.List;

public interface ITurnoService {
    Turno guardarTurno(Turno turno);
    List<Turno> listarTurnos();
}
