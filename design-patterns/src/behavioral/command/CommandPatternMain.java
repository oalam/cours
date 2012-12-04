/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command;

public class CommandPatternMain {

    public static void main(String[] args) {
        // Création d'un récepteur
        Recepteur lRecepteur = new Recepteur();
        
        // Création des commandes
        Commande lCommandeA = new ConcreteCommandeA(lRecepteur);
        Commande lCommandeB = new ConcreteCommandeB(lRecepteur);

        // Création et initialisation de l'invoqueur
        Invoqueur lInvoqueur = new Invoqueur();
        lInvoqueur.setCommandeA(lCommandeA);
        lInvoqueur.setCommandeB(lCommandeB);
        
        // Appel des méthodes d'invocation
        // NB : Cette classe représente la partie cliente.
        // Donc, normalement l'invocation 
        // ne se passe pas dans la partie cliente
        // Dans l'exemple, elle est ici par souci de concision
        lInvoqueur.invoquerA();
        lInvoqueur.invoquerB();
        
        // Affichage :
        // Traitement numero 1 effectué.
        // Traitement numero 2 effectué.
    }
}
