/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.bridge;

/**
 * Sous-classe concrète de l'implémentation
 */
public class ImplementationB implements Implementation {

    @Override
    public void operationImpl1(String pMessage) {
        System.out.println("operationImpl1 de ImplementationB : " + pMessage);
    }
    
    @Override
    public void operationImpl2(Integer pNombre) {
        System.out.println("operationImpl2 de ImplementationB : " + pNombre);
    }
}
