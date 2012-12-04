/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractFactory;

import creational.utils.ClasseB;
import creational.utils.AbstractClasse;

/**
 * Implémente l'interface "AbstractFabrique".
 */
public class ConcreteFabriqueB implements AbstractFabrique {
    
    /**
     * La méthode de création instancie un objet "ClasseB".
     * @return Un objet "ClasseB" qui vient d'être créé.
     */
    @Override
    public AbstractClasse creerClasse() {
        return new ClasseB();
    }
}

