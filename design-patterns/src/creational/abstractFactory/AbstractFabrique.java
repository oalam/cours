/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractFactory;

import creational.utils.AbstractClasse;

/**
 * Définit l'interface de la méthode de création.
 * @author bailett
 */
public interface AbstractFabrique {
    
    /**
     * Méthode de création d'un objet de classe AbstractClasse.
     * @return L'objet créé.
     */
    public AbstractClasse creerClasse();
}

