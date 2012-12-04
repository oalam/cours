/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.state;

/**
 * Sous-classe concrète de l'interface "Etat"
 * On peut passer de l'état B vers l'état A mais pas vers l'état B
 */
public class ConcreteEtatC extends ClasseAvecEtat.Etat {

    // Méthodes pour changer d'état 
    public void operationEtatA(ClasseAvecEtat pClasse) {
        setEtat(pClasse, new ConcreteEtatA());
        System.out.println("Etat changé : C -> A");
    }
    
    public void operationEtatB(ClasseAvecEtat pClasse) {
        System.out.println("Changement d'état (C -> B) non possible");
    }
    
    public void operationEtatC(ClasseAvecEtat pClasse) {
        System.out.println("Classe déjà dans l'état C");
    }
    
    /**
     * Affichage de l'état courant
     */
    public void afficher() {
        System.out.println("Etat courant : C");
    }
}
