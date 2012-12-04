/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.memento;

/**
 * Objet dont on souhaite conserver l'état.
 */
public class Createur {

    // Etat à sauvegarder
    private int etat = 2;

    /**
     * Contient la sauvegarde d'un état d'un objet.
     * Ses méthodes sont privées, afin que seul le "Createur"
     * accéde aux informations stockées
     */
    public class Memento {

        // Etat sauvegardé
        private int etat;
        
        private Memento(int pEtat) {
            etat = pEtat;
        }
        
        /**
         * Retourne l'état sauvegardé
         * @return
         */
        private int getEtat() {
            return etat;
        }
    }

    /**
     * Fait varier l'état de l'objet
     */
    public void suivant() {
        etat = etat * etat;
    }
    
    /**
     * Sauvegarde son état dans un "Memento"
     * @return
     */
    public Memento sauverDansMemento() {
        return new Memento(etat);
    }
    
    /**
     * Restitue son état depuis un "Memento"
     * @param pMemento
     */
    public void restaurerDepuisMemento(Memento pMemento) {
        etat = pMemento.getEtat();
    }
    
    /**
     * Affiche l'état de l'objet
     */
    public void afficher() {
        System.out.println("L'etat vaut : " + etat);
    }
}
