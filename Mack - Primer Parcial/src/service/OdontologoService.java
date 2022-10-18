package service;

import dao.IDao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> odontologoDao;

    public OdontologoService(IDao<Odontologo> odontologoDao){ this.odontologoDao = odontologoDao; }

    public Odontologo guardarOdontologo(Odontologo odontologo){ return odontologoDao.guardar(odontologo); }

    public List<Odontologo> buscarAllOdontologos(){ return odontologoDao.buscarTodos(); }

}
