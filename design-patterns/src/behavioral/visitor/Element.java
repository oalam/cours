/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor;

/**
 * Définit l'interface d'un élément
 */
public interface Element {

    public void recevoirVisiteur(Visiteur pVisiteur);
}
