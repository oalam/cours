/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator;

/**
 * Implémente un décorateur
 */
public class ImplDecorateurB extends Decorateur {
    
    public ImplDecorateurB(final Abstraction pAbstraction) {
        super(pAbstraction);
    }

    /**
     * Implémentation de la méthode
     * pour la décoration de "ImplDecorateurA".
     * Des opérations sont effectuées avant et après 
     * l'appel à la méthode de l'objet "Abstraction"
     * passé au constructeur.
     * La méthode ignore si cet objet est un autre décorateur
     * ou l'implémentation
     */
    public void operation() {
        System.out.println("ImplDecorateurB avant");
        abstraction.operation();
        System.out.println("ImplDecorateurB apres");
    }
}
