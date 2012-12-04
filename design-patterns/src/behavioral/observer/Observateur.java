/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer;

/**
 * Définit l'inteface d'un observateur
 */
public interface Observateur {

    /**
     * Méthode appelée par l'objet observé
     * pour notifier une mise à jour
     */
    public void miseAJour();
}
