/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.state;

/**
 * Sous-classe concrète de l'interface "Etat"
 * On peut passer de l'état A vers l'état B ou l'état C
 */
public class ConcreteEtatA extends ClasseAvecEtat.Etat {

    // Méthodes pour changer d'état 
    // 
    public void operationEtatA(ClasseAvecEtat pClasse) {
        System.out.println("Classe déjà dans l'état A");
    }
    
    public void operationEtatB(ClasseAvecEtat pClasse) {
        setEtat(pClasse, new ConcreteEtatB());
        System.out.println("Etat changé : A -> B");
    }
    
    public void operationEtatC(ClasseAvecEtat pClasse) {
        setEtat(pClasse, new ConcreteEtatC());
        System.out.println("Etat changé : A -> C");
    }
    
    /**
     * Affichage de l'état courant
     */
    public void afficher() {
        System.out.println("Etat courant : A");
    }
}
