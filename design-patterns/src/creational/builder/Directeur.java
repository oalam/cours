/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

/**
 * Contruit un objet en appelant les méthodes d'un "Monteur".
 */
public class Directeur {
    private Monteur monteur;
    
    Directeur(Monteur pMonteur) {
        monteur = pMonteur;
    }
    
    /**
     * Crée un objet.
     * Appelle les méthodes de création 
     * des parties du "Monteur".
     */
    public ObjetComplexe creerObjet() {
        monteur.creerObjet();
        
        monteur.creerAttribut1("libelle de l'objet");
        monteur.creerAttribut2(12);
        
        return monteur.getObjet();
    }
}
