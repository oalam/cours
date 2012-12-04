/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.templateMethod;

/**
 * Définit l'algorithme
 */
public abstract class AbstractClasse {

    /**
     * Algorithme
     * La méthode est final afin que l'algorithme
     * ne puisse pas être redéfini par une classe fille
     */
    public final void operationTemplate() {
        operationAbs1();
        for(int i=0;i<5;i++) {
            operationAbs2(i);
        }
    }

    // Méthodes utilisées par l'algorithme
    // Elles seront implémentées par une sous-classe concrète
    public abstract void operationAbs1();
    public abstract void operationAbs2(int pNombre);
}
