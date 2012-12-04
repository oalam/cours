/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy;

/**
 * Utilise une stratégie.
 * La classe fait appel à la même méthode de l'objet "Strategie".
 * C'est l'objet "Strategie" qui change. 
 */
public class ClasseUtilisantStrategie {

    private Strategie strategie;
    
    /**
     * Constructeur recevant un objet "Strategie" en paramètre
     * @param pStrategie
     */
    public ClasseUtilisantStrategie(Strategie pStrategie) {
        strategie = pStrategie;
    }
    
    /**
     * Délègue le traitement à la stratégie
     */
    public void operation() {
        strategie.operationStrategie();
    }
}
