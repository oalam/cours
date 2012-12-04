/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.adapter;

/**
 * Définit une interface qui est identifiée 
 * comme standard dans la partie cliente. 
 */
public interface Standard {

    /**
     * L'opération doit multiplier les deux nombres,
     * puis afficher le résultat de l'opération
     */
    public void operation(int pNombre1, int pNombre2);
}

