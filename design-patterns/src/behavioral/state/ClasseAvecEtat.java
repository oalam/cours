/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.state;

/**
 * Classe avec état.
 * Son comportement change en fonction de son état.
 */
public class ClasseAvecEtat {

    private Etat etat;
    

    /**
     * Définit l'interface d'un état 
     */
    public static abstract class Etat {

        /**
         * Méthode protégée permattant de changer l'état
         * @param pClasse
         * @param pEtat
         */
        protected void setEtat(ClasseAvecEtat pClasse, Etat pEtat) {
            pClasse.etat = pEtat;
        }
        
        // Méthodes pour changer d'état 
        public abstract void operationEtatA(ClasseAvecEtat pClasse);
        public abstract void operationEtatB(ClasseAvecEtat pClasse);
        public abstract void operationEtatC(ClasseAvecEtat pClasse);
        
        // Affichage de l'état courant
        public abstract void afficher();
    }
    
    /**
     * Constructeur avec initialisation à l'état A
     */
    public ClasseAvecEtat() {
        etat = new ConcreteEtatA();
    }
    
    // Méthodes pour changer d'état 
    public void operationEtatA() {
        etat.operationEtatA(this);
    }
    
    public void operationEtatB() {
        etat.operationEtatB(this);
    }
    
    public void operationEtatC() {
        etat.operationEtatC(this);
    }
    
    /**
     * Affichage de l'état courant
     */
    public void afficher() {
        etat.afficher();
    }
}
