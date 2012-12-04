/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

/**
 * Définit l'interface de l'objet à dupliquer.
 */
public abstract class Prototype implements Cloneable {

    protected String texte;
    
    /**
     * Constructeur de la classe.
     * @param pTexte
     */
    public Prototype(String pTexte) {
        texte = pTexte;
    }
    
    /**
     * La méthode clone est protected dans Object.
     * On doit la substituer pour la rendre visible.
     * De plus, il faut que la classe implémente l'interface Cloneable. 
     * Depuis Java5, on peut retourner un sous-type de Object.
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
    
    public void setTexte(String pTexte) {
        texte = pTexte;
    }
    
    /**
     * Méthode d'affichage des informations de l'objet.
     */
    public abstract void affiche();
}
