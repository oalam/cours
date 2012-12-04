/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.mediator;

/**
 * Sous-classe concrète de Mediateur
 */
public class ConcreteMediateur implements Mediateur {

    private ConcreteCollegueA collegueA;
    private ConcreteCollegueB collegueB;

    // Méthodes permettant les collègues
    public void setCollegueA(ConcreteCollegueA pCollegueA) {
        collegueA = pCollegueA;
    }
    
    public void setCollegueB(ConcreteCollegueB pCollegueB) {
        collegueB = pCollegueB;
    }
    
    /**
     * Si le message provient de A, on le transmet à B
     */
    public void transmettreMessageFromA(String pMessage) {
        collegueB.recevoirMessage(pMessage);
    }
    
    /**
     * Si le message provient de B, on le transmet à A
     */
    public void transmettreMessageFromB(String pMessage) {
        collegueA.recevoirMessage(pMessage);
    }
}
