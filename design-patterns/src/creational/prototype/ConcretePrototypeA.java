/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

/**
 * Sous-class de Prototype.
 */
public class ConcretePrototypeA extends Prototype {
    
    public ConcretePrototypeA(String pTexte) {
        super(pTexte);
    }

    /**
     * Méthode d'affichage.
     * Indique que c'est un objet de classe ConcretePrototypeA 
     * et la valeur de l'attribut texte. 
     */
    @Override
    public void affiche() {
        System.out.println("ConcretePrototypeA avec texte : " + texte);
    }
}
