package com.dh.clase23.dao;

import com.dh.clase23.dominio.Turno;

import java.util.ArrayList;
import java.util.List;

public class TurnoDAO implements IDao<Turno>{

    /*
    Se utiliza una lista para guardar los diferentes turnos
    Queda pendiente el tratamiento con base de datos
    Vamos a utilizar un atributo para trabajar
     */
    private List<Turno> turnos;
    public TurnoDAO(){
        turnos=new ArrayList<>();
    }
    @Override
    public List<Turno> listarElementos() {
        return turnos;
    }

    @Override
    public Turno buscarXCriterio(String criterio) {
        return null;
    }

    @Override
    public Turno buscarXId(int id) {
        Turno turnoBuscado=null;
        for (Turno turno:turnos) {
            if (turno.getId()==id){
                turnoBuscado=turno;
            }
        }
        return turnoBuscado;
    }

    @Override
    public void eliminar(int id) {
        Turno turnoBuscado=buscarXId(id);
        turnos.remove(turnoBuscado);
    }

    @Override
    public Turno actualizar(Turno turno) {
        turnos.set(turnos.indexOf(buscarXId(turno.getId())),turno);
        return turno;
        /*eliminar(turno.getId());
        guardar(turno);
        return turno;
         */
    }

    @Override
    public Turno guardar(Turno turno) {
        turnos.add(turno);
        return turno;
    }
}
