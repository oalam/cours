/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

/**
 * Sous-class de Prototype.
 */
public class ConcretePrototypeB extends Prototype {
    
    public ConcretePrototypeB(String pTexte) {
        super(pTexte);
    }

    /**
     * Méthode d'affichage.
     * Indique que c'est un objet de classe ConcretePrototypeB 
     * et la valeur de l'attribut texte. 
     */
    @Override
    public void affiche() {
        System.out.println("ConcretePrototypeB avec texte : " + texte);
    }
}
