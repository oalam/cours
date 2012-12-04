/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor;

/**
 * Sous-classe concrète d'un élément.
 * Contient un donnée texte
 */
public class ConcreteElementA implements Element {

    public String texte;

    /**
     * Constructeur initialisant la donnée texte
     * @param pTexte
     */
    public ConcreteElementA(String pTexte) {
        texte = pTexte;
    }

    /**
     * Méthode retournant la donnée texte
     * @return
     */
    public String getTexte() {
        return texte;
    }

    public void recevoirVisiteur(Visiteur pVisiteur) {
        pVisiteur.visiterElementA(this);
    }
}
