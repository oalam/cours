/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor;

/**
 * Définit l'interface d'un visiteur
 */
public interface Visiteur {

    public void visiterElementA(ConcreteElementA pElementA);
    public void visiterElementB(ConcreteElementB pElementB);
}
