/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 * Définit l'interface des méthodes permettant  
 * de créer les différentes partie
 * de l'objet complexe.
 */
public abstract class Monteur {

    protected ObjetComplexe produit;
    
    /**
     * Crée un nouveau produit
     * Aucune des parties n'est créée
     * à ce moment là.
     */
    public void creerObjet() {
        produit = new ObjetComplexe();
    }
    
    /**
     * Retourne l'objet une fois fini.
     */
    public ObjetComplexe getObjet() {
        return produit;
    }
    
    // Les méthodes de création des parties 
    
    public abstract void creerAttribut1(String pAttribut1);
    public abstract void creerAttribut2(double pAttribut2);
}
