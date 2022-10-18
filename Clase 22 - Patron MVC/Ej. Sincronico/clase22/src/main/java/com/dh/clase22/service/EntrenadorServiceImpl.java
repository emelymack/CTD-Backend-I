package com.dh.clase22.service;

import com.dh.clase22.dao.EntrenadorDAOH2;
import com.dh.clase22.dao.IDao;
import com.dh.clase22.dominio.Entrenador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorServiceImpl implements IEntrenadorService{

    @Override
    public List<Entrenador> listarEntrenadores() {
        IDao<Entrenador> dao=new EntrenadorDAOH2();
        return dao.listarTodos();
    }
}
