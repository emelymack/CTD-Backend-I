package presencial;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        // 1.1 - Crear la colección de empleados
        List<Empleado> listaDeEmpleados=new ArrayList<>();
        // 1.2 - Cargar la colección con empleados
        listaDeEmpleados.add(new Empleado(1,"Quito","Esteban",10000));
        listaDeEmpleados.add(new Empleado(2,"Nitario","Elsa",15000));
        listaDeEmpleados.add(new Empleado(3,"Paredes","Armando",20000));
        listaDeEmpleados.add(new Empleado(4,"Gallo","Elba",25000));
        listaDeEmpleados.add(new Empleado(5,"Horia","Susana",30000));
        listaDeEmpleados.add(new Empleado(6,"Perez","Juan",35000));
        listaDeEmpleados.add(new Empleado(7,"Perez","Jose",40000));
        // 2 - Guardar la colección creada en un archivo
        FileOutputStream fos=null;
        try{
            fos= new FileOutputStream("empleados.txt");
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            //recordar que debemos guardar
            //ver el formato
            for (Empleado empleado:listaDeEmpleados) {
                //prepara la línea para su guardado, siguiendo el formato
                String linea=empleado.getNombre()+";"+empleado.getApellido()+";"+
                        empleado.getLegajo()+";"+empleado.getSueldo()+"\n";
                //ordernar la escritura al buffer
                bos.write(linea.getBytes());
            }
            bos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3 - Verificar que se cumpla con el formato mediante la apertura del archivo
    }
}
