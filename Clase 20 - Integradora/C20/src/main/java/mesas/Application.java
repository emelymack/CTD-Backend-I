package mesas;

import presencial.Empleado;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1,"Quito","Esteban",10000));
        empleados.add(new Empleado(2,"Nitario","Elsa",15000));
        empleados.add(new Empleado(3,"Paredes","Armando",20000));
        empleados.add(new Empleado(4,"Gallo","Elba",25000));

        Empresa globant = new Empresa(2316542456L,"Sociedad Anónima",empleados);

        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("Empresa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(globant.getCuit());
            oos.writeObject(globant.getRazonSocial());
            oos.writeObject(globant.getEmpleados());
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<Empleado> empleadosRec = null;
        FileInputStream fis =null;
        try {
            fis= new FileInputStream("Empresa.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("CUIT: "+ois.readObject());
            System.out.println("Razón social: "+ois.readObject());
            empleadosRec = (ArrayList)ois.readObject();
            // cada vez que se ejecuta readObject() va leyendo una línea
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Empleados de Globant: ");
        for(Empleado empleado : empleadosRec){
            System.out.println("Legajo: "+empleado.getLegajo()+"\n" +
                    "Nombre: "+empleado.getNombre()+"\n"+
                    "Apellido:"+empleado.getApellido()+"\n"+
                    "Sueldo: $"+empleado.getSueldo() + "\n"+
                    "------------------------------------");
        }
    }
}
