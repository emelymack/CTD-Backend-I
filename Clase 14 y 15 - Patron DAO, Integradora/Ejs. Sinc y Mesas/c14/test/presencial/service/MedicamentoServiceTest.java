package presencial.service;

import org.junit.jupiter.api.Test;
import presencial.dao.MedicamentoDAOH2;
import presencial.model.Medicamento;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {
    @Test
    public void buscarMedicamentoOK(){
        MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDAOH2());

        Medicamento medicamento = medicamentoService.buscarMedicamento(1);
        assertNotNull(medicamento);
        assertEquals(medicamento.getNombre(), "Ibuprofeno");


    }

    @Test
    public void buscarMedicamentoNOTOK(){
        MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDAOH2());

        Medicamento medicamento = medicamentoService.buscarMedicamento(3);
        assertNull(medicamento);

    }
}