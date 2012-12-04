/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer;

/**
 * Implémentation d'un objet observé
 */
public class ConcreteObserve extends Observe {

    int valeur = 0;
    
    /**
     * Modifie une valeur de l'objet 
     * et notifie la nouvelle valeur
     * @param pValeur
     */
    public void setValeur(int pValeur) {
        valeur = pValeur;
        notifier();
    }
    
    /**
     * Retourne la valeur de l'objet
     * @return La valeur
     */
    public int getValeur() {
        return valeur;
    }
}
