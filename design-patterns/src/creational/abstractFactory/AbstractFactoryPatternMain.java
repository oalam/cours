/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractFactory;

import creational.utils.AbstractClasse;

/**
 *
 * @author bailett
 */
public class AbstractFactoryPatternMain {

    public static void main(String[] args) {
        // Création des fabriques
        AbstractFabrique lFactory1 = new ConcreteFabriqueA();
        AbstractFabrique lFactory2 = new ConcreteFabriqueB();
        
        // Création de deux "AbstractClasse" à partir de chaque fabrique
        AbstractClasse lClasse1 = lFactory1.creerClasse(); //new ClasseA()
        AbstractClasse lClasse2 = lFactory2.creerClasse(); //new ClasseB()
        
        // Appel d'une méthode d'"AbstractClasse" qui affiche un message
        // Ce message permet de vérifier que chaque "AbstractClasse"
        // est en fait une classe différente
        lClasse1.afficherClasse();
        lClasse2.afficherClasse();
        
        // --------------------------
        // Affichage : 
        // Objet de classe 'ClasseA'
        // Objet de classe 'ClasseB'
    }
}

