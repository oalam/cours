/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.bridge;

/**
 * Sous-classe concrète de l'abstraction
 */
public class AbstractionA extends Abstraction {

    public AbstractionA(Implementation pImplementation) {
        super(pImplementation);
    }
    
    public void operation() {
        System.out.println("--> Méthode operation() de AbstractionA");
        operationImpl1("A");
        operationImpl2(1);
        operationImpl1("B");
    }
}
