/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factoryMethod;

import creational.utils.AbstractClasse;

/**
 * Déclare la méthode de création.
 */
public abstract class Fabrique {
    
    private boolean pIsClasseA = false;

    /**
     * Méthode de création
     */
    public abstract AbstractClasse creerClasse(boolean pIsClasseA);
    
    /**
     * Méthode appelant la méthode de création.
     * Puis, effectuant une opération.
     */
    public void operation() {
        // Change la valeur afin de varier le paramètre
        // de la méthode de création
        pIsClasseA = !pIsClasseA;
        
        // Récupère une instance de classe "AbstractClasse"
        AbstractClasse lClasse = creerClasse(pIsClasseA);
        
        // Appel la méthode d'affichage de la classe
        // afin de savoir la classe concrète
        lClasse.afficherClasse();
    }
}
