/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

public class BuilderPatternMain {

    public static void main(String[] args) {
        // Instancie les objets directeur et monteur
        Monteur lMonteurA = new ConcreteMonteurA();
        Directeur lDirecteurA = new Directeur(lMonteurA);
        Monteur lMonteurB = new ConcreteMonteurB();
        Directeur lDirecteurB = new Directeur(lMonteurB);
        
        // Appel des différentes méthodes de création
        ObjetComplexe lProduitA = lDirecteurA.creerObjet();
        ObjetComplexe lProduitB = lDirecteurB.creerObjet();
        
        // Demande l'affichage des valeurs des objets
        // pour visualiser les différences de composition
        lProduitA.afficher();
        lProduitB.afficher();
        
        // Affichage : 
        // Objet Complexe : 
        //         - attribut1 : libelle de l'objet (avec dimension en centimètre)
        //         - attribut2 : 12.0
        //         - classe de l'attribut2 : class java.lang.Float
        // Objet Complexe : 
        //         - attribut1 : libelle de l'objet (avec dimension en pouces)
        //         - attribut2 : 30.48
        //         - classe de l'attribut2 : class java.lang.Double
    }
}
