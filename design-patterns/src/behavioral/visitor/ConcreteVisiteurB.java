/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor;

/**
 * Sous-classe concrète d'un visiteur.
 */
public class ConcreteVisiteurB implements Visiteur {

    public void visiterElementA(ConcreteElementA pElementA) {
        System.out.println("Visiteur B : ");
        System.out.println("   Texte de l'element A : " + pElementA.getTexte());
    }

    public void visiterElementB(ConcreteElementB pElementB) {
        System.out.println("Visiteur B : ");
        System.out.println("   Valeur de l'element B : " + pElementB.getValeur());
    }
}
    