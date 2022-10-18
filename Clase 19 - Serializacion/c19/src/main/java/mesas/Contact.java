package mesas;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String surname;
    private String email;
    private Long cellphone;

    public Contact(String name, String surname, String email, Long cellphone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cellphone = cellphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCellphone() {
        return cellphone;
    }

    public void setCellphone(Long cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString() {
        return "Contact{" + '\n' +
                "  name: " + name + '\n' +
                "  surname: " + surname + '\n' +
                "  email: " + email + '\n' +
                "  cellphone: " + cellphone + '\n'+
                '}';
    }
}
