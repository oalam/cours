/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.state;

/**
 * Sous-classe concrète de l'interface "Etat"
 * On peut passer de l'état B vers l'état C mais pas vers l'état A
 */
public class ConcreteEtatB extends ClasseAvecEtat.Etat {

    // Méthodes pour changer d'état 
    public void operationEtatA(ClasseAvecEtat pClasse) {
        System.out.println("Changement d'état (B -> A) non possible");
    }
    
    public void operationEtatB(ClasseAvecEtat pClasse) {
        System.out.println("Classe déjà dans l'état B");
    }
    
    public void operationEtatC(ClasseAvecEtat pClasse) {
        setEtat(pClasse, new ConcreteEtatC());
        System.out.println("Etat changé : B -> C");
    }
    
    /**
     * Affichage de l'état courant
     */
    public void afficher() {
        System.out.println("Etat courant : B");
    }
}
