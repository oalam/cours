/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator;

public class IteratorPatternMain {

    public static void main(String[] args) {
        // Création de l'objet "Compose"
        Compose lCompose = new ConcreteCompose();
        // Création de l'objet "Iterateur"
        Iterateur lIterateur = lCompose.creerIterateur();
        
        // Parcours les éléments de l'objet "Compose"
        // grâce à l'objet "Iterateur"
        while(!lIterateur.fini()) {
            System.out.println(lIterateur.suivant());
        }
        
        // Affichage : 
        // Bonjour
        // le
        // monde
    }
}
