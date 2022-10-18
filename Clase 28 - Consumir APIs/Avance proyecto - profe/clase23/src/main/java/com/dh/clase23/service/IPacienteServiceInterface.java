package com.dh.clase23.service;

import com.dh.clase23.dominio.Paciente;

import java.util.List;

public interface IPacienteServiceInterface {
    List<Paciente> listarPacientes();
    Paciente buscarXEmail(String email);
    Paciente guardarPaciente(Paciente paciente);
    Paciente buscarPacienteXId(int id);
    void eliminarPaciente(int id);
    Paciente actualizarPaciente(Paciente paciente);
}
