/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.state;

public class StatePatternMain {

    public static void main(String[] args) {
        // Création de la classe avec état
        ClasseAvecEtat lClasse = new ClasseAvecEtat();

        lClasse.operationEtatA();
        lClasse.operationEtatB();
        lClasse.operationEtatA();
        lClasse.afficher();
        lClasse.operationEtatB();
        lClasse.operationEtatC();
        lClasse.operationEtatA();
        
        // Affichage : 
        // Classe déjà dans l'état A
        // Etat changé : A -> B
        // Changement d'état (B -> A) non possible
        // Etat courant : B
        // Classe déjà dans l'état B
        // Etat changé : B -> C
        // Etat changé : C -> A
    }
}
