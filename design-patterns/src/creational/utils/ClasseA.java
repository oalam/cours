/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.utils;

import creational.utils.AbstractClasse;

/**
 *
 * @author bailett
 */
public class ClasseA implements AbstractClasse {

    /**
     * Implémentation de la méthode d'affichage
     */
    @Override
    public void afficherClasse() {
        System.out.println("Objet de classe 'ClasseA'");
    }
}
