/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.interpreter;

public class InterpreterPatternMain {

    public static void main(String[] args) {
        // Création des expressions non terminales
        ExpressionNonTerminale lRacine = 
                new ExpressionNonTerminale("RACINE");
        ExpressionNonTerminale lElement1 = 
                new ExpressionNonTerminale("ELEMENT1");
        ExpressionNonTerminale lElement2 = 
                new ExpressionNonTerminale("ELEMENT2");
        ExpressionNonTerminale lElement3 = 
            new ExpressionNonTerminale("ELEMENT3");
        
        // Création des expressions terminales
        ExpressionTerminal lTexte1 = 
                new ExpressionTerminal("TEXTE1");
        ExpressionTerminal lTexte2 = 
                new ExpressionTerminal("TEXTE2");

        // Construit l'arborescence
        lRacine.ajouterExpression(lElement1);
        lRacine.ajouterExpression(lElement2);
        lElement2.ajouterExpression(lElement3);
        lElement1.ajouterExpression(lTexte1);
        lElement3.ajouterExpression(lTexte2);
        
        // Appel la méthode de l'expression racine
        lRacine.operation();
        
        // Affichage : 
        // <RACINE>
        //     <ELEMENT1>
        //         TEXTE1
        //     </ELEMENT1>
        //     <ELEMENT2>
        //         <ELEMENT3>
        //             TEXTE2
        //         </ELEMENT3>
        //     </ELEMENT2>
        // </RACINE>
    }
}
