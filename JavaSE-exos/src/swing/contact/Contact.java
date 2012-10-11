/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.contact;

/**
 *
 * @author adminl
 */
public class Contact {
    private String title;
    private String name;
    private String surname;
    private String address;

    public Contact(String title, String name, String surname, String address) {
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
