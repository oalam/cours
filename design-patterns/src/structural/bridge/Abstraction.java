/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.bridge;

/**
 * Définit l'interface de l'abstraction
 */
public abstract class Abstraction {

    // Référence vers l'implémentation
    private Implementation implementation;
    
    protected Abstraction(Implementation pImplementation) {
        implementation = pImplementation;
    }

    public abstract void operation(); 

    /**
     * Lien vers la méthode operationImpl1() de l'implémentation
     * @param pMessage
     */
    protected void operationImpl1(String pMessage) {
        implementation.operationImpl1(pMessage);
    }
    
    /**
     * Lien vers la méthode operationImpl2() de l'implémentation
     * @param pMessage
     */
    protected void operationImpl2(Integer pNombre) {
        implementation.operationImpl2(pNombre);
    }
}
