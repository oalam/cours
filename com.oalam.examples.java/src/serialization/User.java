/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author bailett
 */
public class User implements Serializable {

    private String name = "";
    private String pwd = "";
    private Date dateCreation = new Date();

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return the dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public User() {
    }

    public static void main(String[] args) {
        try {
            // create user object
            User personne = new User();
            personne.setName("tom");
            personne.setPwd("xxx");

            // save object to file
            FileOutputStream fichier = new FileOutputStream("personne.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fichier);
            oos.writeObject(personne);
            oos.flush();
            oos.close();
            fichier.close();

            // load object from file
            FileInputStream fichier2 = new FileInputStream("personne.ser");
            ObjectInputStream ois = new ObjectInputStream(fichier2);
            User personne2 = (User) ois.readObject();
            System.out.println(personne2.toString());


        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", pwd=" + pwd + ", dateCreation=" + dateCreation + '}';
    }
}
