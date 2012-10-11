/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employe;

import java.util.Objects;

/**
 *
 * @author adminl
 */
public abstract class Employe implements Comparable {
    
    protected String nom;
    protected String prenom;
    protected int age;
    protected double salaireFixe;

    public Employe(String nom, String prenom, int age, double salaireFixe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.salaireFixe = salaireFixe;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nom);
        hash = 79 * hash + Objects.hashCode(this.prenom);
        hash = 79 * hash + this.age;
        return hash;
    }

 

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (this.calculSalaire() != other.calculSalaire()) {
            return false;
        }
        
        return true;
    }

 
    
    
    
    
    
    @Override
    public String toString() {
        return nom + ", " + prenom + " gagne " + calculSalaire() + " €";
    }
    
    @Override
    public int compareTo(Object o) {
        int result = 0;
  
        if (o instanceof Employe) {
            Employe e = (Employe) o;
            result = (int) (e.calculSalaire() - this.calculSalaire());
        }
        
        return result;
    }

    public abstract double calculSalaire();
}
