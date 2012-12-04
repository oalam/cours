/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.templateMethod;

/**
 * Sous-classe concrète de AbstractClasse
 * Implémente les méthodes utilisées par l'algorithme
 * de la méthode operationTemplate() de AbstractClasse
 */
public class ConcreteClasse extends AbstractClasse {
    
    public void operationAbs1() {
        System.out.println("operationAbs1");
    }

    public void operationAbs2(int pNombre) {
        System.out.println("\toperationAbs2 : " + pNombre);
    }
}
