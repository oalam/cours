/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.proxy;

public class ProxyPatternMain {

    public static void main(String[] args) {
        // Création du "Proxy"
        Abstraction lProxy = new Proxy();
        
        // Appel de la méthode du "Proxy"
        lProxy.afficher();
        
        // Affichage : 
        // --> Méthode afficher() du Proxy : 
        // --> Création de l'objet Implementation au besoin
        // --> Appel de la méthode afficher() de l'objet Implementation
        // Méthode afficher() de la classe d'implementation
    }
}
