/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.classes;

import java.sql.Date;

/**
 *
 * @author adminl
 */
public class Personne {

    // variable de classe 
    private static int count = 0;
    
    // récupère le compteur de classe
    public static int getCount(){ return count;}
    
    private String nom;
    private String prenom;
    private String addresse;
    private String sexe;
    private int age;

    
    
    // incrémente le compteur de classe
    // à chaque nouvel objet instancié
    public Personne(String nom) {
        this.nom = nom;
        count++;
    }

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        count++;
    }

    public Personne(String nom, String prenom, String addresse, String sexe, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.sexe = sexe;
        this.age = age;
        count++;
    }
        

    public void anniversaire(){
        this.age++;
    } 
    
    public void presenteToi(){
        System.out.println( this.toString());
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", addresse=" + addresse + ", sexe=" + sexe + ", age=" + age + '}';
    }
    
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




    
    
    
    
}
