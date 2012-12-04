/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.adapter;

public class AdapterPatternMain {

    public static void main(String[] args) {
        // Création d'un adaptateur
        final Standard lImplAdapte = new Adaptateur();
        // Création d'une implémentation standard
        final Standard lImplStandard = new ImplStandard();

        // Appel de la même méthode sur chaque instance
        lImplAdapte.operation(2, 4);
        lImplStandard.operation(2, 4);
        
        // Affichage : 
        // Adapte : Le nombre est : 8
        // Standard : Le nombre est : 8
    }
}
