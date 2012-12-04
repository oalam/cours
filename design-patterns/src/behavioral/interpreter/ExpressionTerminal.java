/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.interpreter;

/**
 * Implémente une expression terminale.
 */
public class ExpressionTerminal extends Expression {

    private String texte;

    /**
     * Constructeur permettant de fixer un attribut texte
     * @param pTexte
     */
    public ExpressionTerminal(String pTexte) {
        texte = pTexte;
    }
    
    /**
     * Affiche l'attribut texte avec indentation
     */
    @Override
    public void operation(int pIndentation) {
        afficherIndentation(pIndentation);
        System.out.println(texte);
    }
}
