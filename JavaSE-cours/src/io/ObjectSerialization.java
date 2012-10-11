/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author adminl
 */
public class ObjectSerialization implements Serializable {

    private String nom;
    private String prenom;
    private int taille;
    private transient int age;

    public ObjectSerialization(String nom, String prenom, int taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
    }

    public ObjectSerialization() {
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", taille=" + taille + ", age=" + age + '}';
    }

    // Constr
    // Getter/setters
    public static void main(String argv[]) {

        try {
            ObjectSerialization personne = new ObjectSerialization("Dupond", "Jean", 175);
            personne.age = 45;
            FileOutputStream fichier = new FileOutputStream("personne.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fichier);
            oos.writeObject(personne);
            oos.flush();
            oos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fichier = new FileInputStream("personne.ser");
            ObjectInputStream ois = new ObjectInputStream(fichier);
            ObjectSerialization personne = (ObjectSerialization) ois.readObject();
            System.out.println(personne);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}