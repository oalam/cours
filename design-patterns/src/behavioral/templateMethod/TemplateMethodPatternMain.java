/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.templateMethod;

public class TemplateMethodPatternMain {

    public static void main(String[] args) {
    	// Création de l'instance
        AbstractClasse lClasse = new ConcreteClasse();
        // Appel de la méthode définie dans AbstractClasse
        lClasse.operationTemplate();
        
        // Affichage :
        // operationAbs1
        //         operationAbs2 : 0
        //         operationAbs2 : 1
        //         operationAbs2 : 2
        //         operationAbs2 : 3
        //         operationAbs2 : 4
    }
}
