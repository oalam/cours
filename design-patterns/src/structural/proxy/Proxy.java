/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.proxy;

/**
 * Intermédiaire entre la partie cliente et l'implémentation
 */
public class Proxy implements Abstraction {

    /**
     * Instancie l'objet "Implementation", pour appeler
     * la vraie implémentation de la méthode.
     */
    @Override
    public void afficher() {
        System.out.println("--> Méthode afficher() du Proxy : ");
        System.out.println("--> Création de l'objet Implementation au besoin");
        Implementation lImplementation = new Implementation();
        System.out.println("--> Appel de la méthode afficher() de l'objet Implementation");
        lImplementation.afficher();
    }
}
