/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator;

/**
 * Sous-classe de l'interface "Compose".
 */
public class ConcreteCompose implements Compose {

    // Elements composants l'objet "Compose"
    private String[] elements = {
            "Bonjour" , "le", "monde"
    };

    /**
     * Retourne un objet "Iterateur" permettant 
     * de parcourir les éléments 
     */
    public Iterateur creerIterateur() {
        return new ConcreteIterateur(elements);
    }
}
