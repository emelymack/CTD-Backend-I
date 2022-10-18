package mesas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagement {
    public static void saveCollectionTxt(ArrayList collection){
        FileOutputStream fos = null;

        try{

            fos = new FileOutputStream("contactsFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(collection);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void recoverFileObjects(){
        List<Contact> contactsList = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("contactsFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            contactsList = (ArrayList)ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Contact c : contactsList ) {
            System.out.println(c.toString());
        }
    }
}
