/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator;

/**
 * Définit l'interface de l'itérateur.
 */
public interface Iterateur {

    /**
     * Retourne l'élément suivant
     */
    public String suivant();
    
    /**
     * Retourne si l'itérateur
     * est arrivé sur le dernier élément 
     */
    public boolean fini();
}
    