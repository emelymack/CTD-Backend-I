package com.dh.clase23.controller;

import com.dh.clase23.dao.OdontologoDAOH2;
import com.dh.clase23.dao.PacienteDAOH2;
import com.dh.clase23.dao.TurnoDAO;
import com.dh.clase23.dominio.Turno;
import com.dh.clase23.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    private ITurnoService turnoService=new TurnoServiceImpl(new TurnoDAO());
    private IPacienteServiceInterface pacienteService= new PacienteServiceImpl(new PacienteDAOH2());
    private IOdontologoService odontologoService=new OdontologoServiceImpl(new OdontologoDAOH2());
    @GetMapping
    public ResponseEntity<List<Turno>> traerTurnos(){
        return ResponseEntity.ok(turnoService.listarTurnos());
    }
    @PostMapping
    public ResponseEntity<Turno> registrarTurno(@RequestBody Turno turno){
        ResponseEntity<Turno> respuesta;
        if (pacienteService.buscarPacienteXId(turno.getPaciente().getId())!=null && odontologoService
                .buscarXId(turno.getOdontologo().getId())!=null){
            respuesta=ResponseEntity.ok(turnoService.guardarTurno(turno));
        }
        else{
            respuesta=ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return respuesta;
    }
}
