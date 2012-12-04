/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.bridge;

/**
 * Sous-classe concrète de l'implémentation
 */
public class ImplementationA implements Implementation {

    @Override
    public void operationImpl1(String pMessage) {
        System.out.println("operationImpl1 de ImplementationA : " + pMessage);
    }
    
    @Override
    public void operationImpl2(Integer pNombre) {
        System.out.println("operationImpl2 de ImplementationA : " + pNombre);
    }
}
