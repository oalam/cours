/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factoryMethod;

import creational.utils.AbstractClasse;
import creational.utils.ClasseB;

/**
 * Substitue la méthode "creerClasse".
 * Instancie un objet "ClasseB".
 */
public class FabriqueB extends Fabrique {

    /**
     * Méthode de création
     * La méthode ne tient pas compte du paramètre
     * et instancie toujours un objet "ClasseB"
     * @return Un objet de classe ClasseB.
     */
    @Override
    public AbstractClasse creerClasse(boolean pIsClasseA) {
        return new ClasseB();
    }
}
