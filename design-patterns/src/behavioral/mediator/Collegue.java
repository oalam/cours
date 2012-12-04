/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.mediator;

/**
 * Définit l'interface d'un collègue.
 */
public abstract class Collegue {

    protected Mediateur mediateur;
    
    /**
     * Constructeur permettant de fixer le médiateur
     * @param pMediateur
     */
    public Collegue(Mediateur pMediateur) {
        mediateur = pMediateur;
    }
    
    public abstract void recevoirMessage(String pMessage);
}
