package com.dh.clase31.service;

import com.dh.clase31.entity.Movimiento;
import com.dh.clase31.repository.IMovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoServiceImpl implements IMovimientoService{

    @Autowired
    private IMovimientoRepository movimientoRepository;

    @Override
    public List<Movimiento> listarMovimientos() {
        return movimientoRepository.findAll();
    }

    @Override
    public String registrarMovimiento(Movimiento movimiento) {
        if(movimientoRepository.save(movimiento)!=null){
            return "Se registró el movimiento de forma correcta.";
        }
        else{
            return "Error al momento de registrar el movimiento.";
        }
    }
}
