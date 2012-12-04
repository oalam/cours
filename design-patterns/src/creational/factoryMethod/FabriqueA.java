/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factoryMethod;

import creational.utils.AbstractClasse;
import creational.utils.ClasseA;
import creational.utils.ClasseB;

/**
 * Substitue la méthode "creerClasse".
 * Instancie un objet "ClasseA".
 */
public class FabriqueA extends Fabrique {

    /**
     * Méthode de création
     * La méthode retourne un objet ClasseA, si le paramètre est true.
     * La méthode retourne un objet ClasseB, sinon.
     * @return Un objet de classe ClasseA ou ClasseB.
     */
    @Override
    public AbstractClasse creerClasse(boolean pIsClasseA) {
        if(pIsClasseA) {
            return new ClasseA();
        }
        else {
            return new ClasseB();
        }
    }
}
