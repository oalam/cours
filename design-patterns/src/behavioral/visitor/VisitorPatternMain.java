/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor;

public class VisitorPatternMain {

    public static void main(String[] args) {
    	// Création des visiteurs
        Visiteur lVisiteurA = new ConcreteVisiteurA();
        Visiteur lVisiteurB = new ConcreteVisiteurB();
        
        // Création de la structure
        Structure lStructure = new Structure();
        
        // Appels des méthodes de réception des visiteurs
        lStructure.visiter(lVisiteurA);
        lStructure.visiter(lVisiteurB);
        
        // Affichage :
        // Visiteur A : 
        // Texte de l'element A : texte1
        // Visiteur A : 
        //    Texte de l'element A : texte2
        // Visiteur A : 
        //    Valeur de l'element B : 1
        // Visiteur A : 
        //    Texte de l'element A : texte3
        // Visiteur A : 
        //    Valeur de l'element B : 2
        // Visiteur A : 
        //    Valeur de l'element B : 3
        // Visiteur B : 
        //    Texte de l'element A : texte1
        // Visiteur B : 
        //    Texte de l'element A : texte2
        // Visiteur B : 
        //    Valeur de l'element B : 1
        // Visiteur B : 
        //    Texte de l'element A : texte3
        // Visiteur B : 
        //    Valeur de l'element B : 2
        // Visiteur B : 
        //    Valeur de l'element B : 3
    }
}
