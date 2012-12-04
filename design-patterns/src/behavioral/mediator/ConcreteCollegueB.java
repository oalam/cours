/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.mediator;

/**
 * Sous-classe concrète de "Collegue"
 */
public class ConcreteCollegueB extends Collegue {

    public ConcreteCollegueB(Mediateur pMediateur) {
        super(pMediateur);
        pMediateur.setCollegueB(this);
    }

    /**
     * Méthode demandant de transmettre un message
     * provenant de cette classe
     * @param pMessage
     */
    public void envoyerMessageFromB(String pMessage) {
        mediateur.transmettreMessageFromB(pMessage);
    }

    /**
     * Méthode recevant un message
     */
    public void recevoirMessage(String pMessage) {
        System.out.println("ConcreteCollegueB a reçu : " + pMessage);
    }
}
