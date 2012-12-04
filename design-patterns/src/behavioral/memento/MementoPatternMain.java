/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.memento;

public class MementoPatternMain {

    public static void main(String[] args) {
        // Création du gardien
        Gardien lGardien = new Gardien();
        // Création du créateur
        Createur lCreateur = new Createur();
        
        // Sauvegarde l'état (2) dans le "Gardien" par le "Memento"
        lGardien.ajouterMemento(lCreateur.sauverDansMemento());
        // Affiche l'état (2)
        lCreateur.afficher();
        // Change l'état (2 * 2 = 4)
        lCreateur.suivant();
        // Sauvegarde l'état (4) dans le "Gardien" par le "Memento"
        lGardien.ajouterMemento(lCreateur.sauverDansMemento());
        // Change l'état (4 * 4 = 16)
        lCreateur.suivant();
        // Sauvegarde l'état (16) dans le "Gardien" par le "Memento"
        lGardien.ajouterMemento(lCreateur.sauverDansMemento());
        // Affiche l'état (16)
        lCreateur.afficher();
        // Récupère l'état (4) de l'index 1 depuis le "Gardien"
        Createur.Memento lMemento1 = lGardien.getMemento(1);
        // Restaure l'état depuis le "Memento"
        lCreateur.restaurerDepuisMemento(lMemento1);
        // Affiche l'état (4)
        lCreateur.afficher();
        
        // Affichage : 
        // L'etat vaut : 2
        // L'etat vaut : 16
        // L'etat vaut : 4
    }
}
