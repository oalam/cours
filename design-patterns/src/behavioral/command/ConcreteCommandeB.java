/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command;

/**
 * Implémente une commande.
 * Appelle la méthode action2() lorsque la commande est exécutée.
 */
public class ConcreteCommandeB implements Commande {

    private Recepteur recepteur;
    
    public ConcreteCommandeB(Recepteur pRecepteur) {
        recepteur = pRecepteur;
    }
    
    public void executer() {
        recepteur.action2();
    }
}
