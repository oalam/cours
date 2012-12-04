/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype;

public class PrototypePatternMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Instancie un objet de classe ConcretePrototypeA
        // et un autre de classe ConcretePrototypeB
        // de "manière traditionnelle".
        Prototype lPrototypeA = new ConcretePrototypeA("Original");
        Prototype lPrototypeB = new ConcretePrototypeB("Original");
        
        // Duplique les objets précédemment créés/
        Prototype lPrototypeAClone = lPrototypeA.clone();
        Prototype lPrototypeBClone = lPrototypeB.clone();
        
        // Affiche les objets : 
        // les clones sont identiques aux originaux
        lPrototypeA.affiche();
        lPrototypeAClone.affiche();
        lPrototypeB.affiche();
        lPrototypeBClone.affiche();
        
        // Modifie les clones
        lPrototypeAClone.setTexte("Clone (enfait)");
        lPrototypeBClone.setTexte("Clone (enfait)");
        
        // Met en évidence que les clones
        // sont bien des instances à part.
        lPrototypeA.affiche();
        lPrototypeAClone.affiche();
        lPrototypeB.affiche();
        lPrototypeBClone.affiche();
        
        // Affichage :
        // ConcretePrototypeA avec texte : Original
        // ConcretePrototypeA avec texte : Original
        // ConcretePrototypeB avec texte : Original
        // ConcretePrototypeB avec texte : Original
        // ConcretePrototypeA avec texte : Original
        // ConcretePrototypeA avec texte : Clone (enfait)
        // ConcretePrototypeB avec texte : Original
        // ConcretePrototypeB avec texte : Clone (enfait)
    }
}
