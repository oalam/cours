/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator;

public class DecoratorPatternMain {

    public static void main(String[] args) {
        // Création de l'implementation et des décorateurs
        final Implementation toDecorate = new Implementation();
        final ImplDecorateurB decoB = new ImplDecorateurB(toDecorate);
        final ImplDecorateurA decoA = new ImplDecorateurA(decoB);
        
        
     //  new ImplDecorateurA(new ImplDecorateurB(new Implementation()));
        // Appel de la méthode du décorateur "conteneur"
        decoA.operation();

        // Affichage :
        // ImplDecorateurA avant
        // ImplDecorateurB avant
        // Implementation
        // ImplDecorateurB apres
        // ImplDecorateurA apres
    }
}
