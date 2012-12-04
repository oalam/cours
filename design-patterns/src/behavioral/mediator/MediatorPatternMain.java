/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.mediator;

public class MediatorPatternMain {

    public static void main(String[] args) {
        // Création du médiateur
        Mediateur lMediateur = new ConcreteMediateur();
        // Création des collègues
        ConcreteCollegueA lCollegueA = new ConcreteCollegueA(lMediateur);
        ConcreteCollegueB lCollegueB = new ConcreteCollegueB(lMediateur);
        
        // Déclenchement de méthodes qui demande
        // au médiateur de transmettre un message
        lCollegueA.envoyerMessageFromA("Coucou");
        lCollegueB.envoyerMessageFromB("Salut");
        
        // Affichage :
        // ConcreteCollegueB a reçu : Coucou
        // ConcreteCollegueA a reçu : Salut
    }
}
