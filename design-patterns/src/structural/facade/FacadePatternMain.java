/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.facade;

public class FacadePatternMain {

    public static void main(String[] args) {
        // Création de l'objet "Facade" puis appel des méthodes
        Facade lFacade = new Facade();        
        lFacade.operation2();
        lFacade.operation41();
        
        // Affichage :
        // --> Méthode operation2() de la classe Facade : 
        // Methode operation2() de la classe ClasseA
        // --> Méthode operation41() de la classe Facade : 
        // Methode operation4() de la classe ClasseB
        // Methode operation1() de la classe ClasseA
    }
}
