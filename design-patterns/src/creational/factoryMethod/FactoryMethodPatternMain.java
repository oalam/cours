/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factoryMethod;

public class FactoryMethodPatternMain {

    public static void main(String[] args) {
        // Création des fabriques
        Fabrique lFactoryA = new FabriqueA();
        Fabrique lFactoryB = new FabriqueB();
    
        // L'appel de cette méthode avec FabriqueA provoquera 
        // l'instanciation de deux classes différentes
        System.out.println("Avec la FabriqueA : ");
        lFactoryA.operation();
        lFactoryA.operation();
        lFactoryA.operation();
        // L'appel de cette méthode avec FabriqueB provoquera 
        // toujours l'instanciation de la même classe
        System.out.println("Avec la FabriqueB : ");
        lFactoryB.operation();
        lFactoryB.operation();
        lFactoryB.operation();
        
        // Affichage : 
        // Avec la FabriqueA : 
        // Objet de classe 'ClasseA'
        // Objet de classe 'ClasseB'
        // Objet de classe 'ClasseA'
        // Avec la FabriqueB : 
        // Objet de classe 'ClasseB'
        // Objet de classe 'ClasseB'
        // Objet de classe 'ClasseB'
    }
}
