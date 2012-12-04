/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 * Implémente les méthodes permettant 
 * de créer les parties de l'objet complexe.
 */
public class ConcreteMonteurA extends Monteur {

    /**
     * Méthode de création de l'attribut attribut1
     * Précise que l'attibut2 représente une dimention en centimètres
     */
    @Override
    public void creerAttribut1(String pAttribut1) {
        produit.setAttribut1(pAttribut1 + " (avec dimension en centimètre)");
    }

    /**
     * Méthode de création de l'attribut attribut2
     * Stocke la valeur dans un Float sans modification
     */
    @Override
    public void creerAttribut2(double pAttribut2) {
        produit.setAttribut2(new Float(pAttribut2));
    }
}
