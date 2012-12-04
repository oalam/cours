/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy;

public class StrategyPatternMain {

    public static void main(String[] args) {
        // Création d'instance des classes "Strategie"
        Strategie lStrategieA = new ConcreteStrategieA();
        Strategie lStrategieB = new ConcreteStrategieB();
        
        
        // Création d'instance de la classe qui utilise des "Strategie"
        ClasseUtilisantStrategie lClasseA = new ClasseUtilisantStrategie(lStrategieA);
        ClasseUtilisantStrategie lClasseB = new ClasseUtilisantStrategie(lStrategieB);
        
        // Appel de la méthode de la classe
        // utilisant une stratégie
        lClasseA.operation();
        lClasseB.operation();
        
        // Affichage :
        // Operation de la strategie A
        // Operation de la strategie B
    }
}
