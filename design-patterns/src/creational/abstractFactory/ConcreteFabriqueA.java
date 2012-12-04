/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractFactory;

import creational.utils.ClasseA;
import creational.utils.AbstractClasse;

/**
 * Implémente l'interface "AbstractFabrique".
 */
public class ConcreteFabriqueA implements AbstractFabrique {
    
    /**
     * La méthode de création instancie un objet "ClasseA".
     * @return Un objet "ClasseA" qui vient d'être créé.
     */
    @Override
    public AbstractClasse creerClasse() {
        return new ClasseA();
    }
}

