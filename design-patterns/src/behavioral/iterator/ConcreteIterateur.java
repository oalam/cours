/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator;

/**
 * Sous-classe de l'inteface "Iterateur".
 */
public class ConcreteIterateur implements Iterateur {

    private String[] elements;
    private int index = 0;
    
    public ConcreteIterateur(String[] pElements) {
        elements = pElements;
    }
    
    /**
     * Retourne l'élément
     * puis incrémente l'index
     */
    public String suivant() {
        return elements[index++];
    }
    
    /**
     * Si l'index est supérieur ou égal
     * à la taille du tableau,
     * on considère que l'on a fini
     * de parcourir les éléments
     */
    public boolean fini() {
        return index >= elements.length;
    }
}
