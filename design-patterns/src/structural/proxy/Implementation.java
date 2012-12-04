/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.proxy;

/**
 * Implémentation de l'interface.
 * Définit l'objet représenté par le "Proxy"
 */
public class Implementation implements Abstraction {
    
    public void afficher() {
        System.out.println("Méthode afficher() de la classe d'implementation");
    }
}
