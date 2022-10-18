package presencial;

import presencial.auxbd.BDAux;
import presencial.dao.MedicamentoDAOH2;
import presencial.model.Medicamento;
import presencial.service.MedicamentoService;

public class Programa {
    public static void main(String[] args) {
        BDAux.crearBD();

        //preparar un medicamento
        Medicamento med1=new Medicamento(1,"A548","Ibuprofeno","Lab123",
                5,125);
        Medicamento med2=new Medicamento(2,"E54E","Paracetamol","Lab123",
                20,100);
        Medicamento med3=new Medicamento(3,"EJ543","Tafirol","Lab123",
                150,70);


        //necesitamos el servicio para resolver el guardado
        MedicamentoService medicamentoService= new MedicamentoService(new MedicamentoDAOH2());

        //usar el servicio
        medicamentoService.guardarMedicamento(med1);
        medicamentoService.guardarMedicamento(med2);
    }
}
