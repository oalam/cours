/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.memento;

import java.util.LinkedList;
import java.util.List;

/**
 * Conserve les "Memento".
 * Retourne un "Memento" conservé
 */
public class Gardien {

    // Liste de "Memento"
    private List<Createur.Memento> liste = new LinkedList<Createur.Memento>();
    
    /**
     * Ajouter un "Memento" à la liste
     * @param pMemento
     */
    public void ajouterMemento(Createur.Memento pMemento) {
        liste.add(pMemento);
    }
    
    /**
     * Retourne le "Memento" correspondant à l'index
     * @param pIndex
     * @return
     */
    public Createur.Memento getMemento(int pIndex) {
        return liste.get(pIndex);
    }
}
