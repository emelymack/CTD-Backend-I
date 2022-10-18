package presencial.service;

import presencial.dao.IDao;
import presencial.model.Medicamento;

public class MedicamentoService {
    //necesitamos el dao para acceder a la BD
    private IDao<Medicamento> medicamentoDao;

    public MedicamentoService(IDao<Medicamento> medicamentoDao){
        this.medicamentoDao=medicamentoDao;
    }

    public Medicamento guardarMedicamento(Medicamento medicamento){
        return medicamentoDao.guardar(medicamento);
    }

    public Medicamento buscarMedicamento(int id){ return medicamentoDao.buscar(id); }


}
