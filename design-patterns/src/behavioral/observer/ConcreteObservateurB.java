/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer;

/**
 * Sous-classe concrète de "Observateur"
 */
public class ConcreteObservateurB implements Observateur {

    private int valeur = 0;
    private ConcreteObserve observe;
    
    /**
     * Fixe l'objet observé
     * @param pObserve
     */
    public void setObserve(ConcreteObserve pObserve) {
        observe = pObserve;
    }
    
    /**
     * Méthode appelée par l'objet observé
     * pour notifier une mise à jour
     */
    public void miseAJour() {
        valeur = observe.getValeur();
    }

    /**
     * Affiche la valeur
     */
    public void afficher() {
        System.out.println("ConcreteObservateurB contient " + valeur);
    }
}
