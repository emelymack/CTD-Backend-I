package presencial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        // 1 - Preparar nuestra colección de perritos
        List<Perro> perros=new ArrayList<>();
        perros.add(new Perro("Thor",5));
        perros.add(new Perro("Loki",3));
        perros.add(new Perro("Carlitos",7));
        perros.add(new Perro("Odin",10));
        perros.add(new Perro("Sombra",12));
        perros.add(new Perro("Bruno",2));
        perros.add(new Perro("Manchas",4));

        // 2 - Guardar la colección en un determinado archivo
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream("PerrosFile.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(perros);
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // 3 - Recuperar la colección desde el archivo creado en 2
        List<Perro> perrosRecuperados= null;
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("PerrosFile.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            perrosRecuperados=(ArrayList)ois.readObject();

            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // 3 bis - Mostrar la colección recuperada desde el archivo
        for (Perro perro:perrosRecuperados) {
            System.out.println(perro.getNombre()+" -Edad: "+perro.getEdad());
        }
    }
}
