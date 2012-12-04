/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.interpreter;

/**
 * Définit l'interface d'une expression
 */
public abstract class Expression {

    protected static void afficherIndentation(int pIndentation) {
        for(int i=0;i<pIndentation;i++) {
            System.out.print("    ");
        }
    }
    
    public void operation() {
        operation(0);
    }
    
    public abstract void operation(int pIndentation);
}
