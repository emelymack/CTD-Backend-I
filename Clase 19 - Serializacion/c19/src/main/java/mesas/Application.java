package mesas;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // preparing the Collection
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Joaquin", "Ibrahim","joaquinibrahim@gmail.com",3415468978L));
        contacts.add(new Contact("Chiara", "Ferro","chiaraferro@gmail.com",3415465258L));
        contacts.add(new Contact("Theo", "Topolovo","theotopolovo@gmail.com",3412563541L));
        contacts.add(new Contact("Fabiana", "Palome","fabipalome@gmail.com",3415621423L));
        contacts.add(new Contact("Jerry", "Seinfeld","jerryseinfeld@gmail.com",3416978985L));

        // saving the collection in a file
        FileManagement.saveCollectionTxt((ArrayList) contacts);
        FileManagement.recoverFileObjects();

    }
}
