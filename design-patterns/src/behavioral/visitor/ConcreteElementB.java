/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor;

/**
 * Sous-classe concrète d'un élément.
 * Contient un donnée numérique
 */
public class ConcreteElementB implements Element {

    public Long valeur;

    /**
     * Constructeur initialisant la donnée numérique
     * @param pValeur
     */
    public ConcreteElementB(Long pValeur) {
        valeur = pValeur;
    }

    /**
     * Méthode retournant la donnée numérique
     * @return
     */
    public Long getValeur() {
        return valeur;
    }

    public void recevoirVisiteur(Visiteur pVisiteur) {
        pVisiteur.visiterElementB(this);
    }
}
