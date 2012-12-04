/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor;

/**
 * Présente une interface de haut niveau permettant 
 * de visiter les objets "Element" la composant.
 */
public class Structure {

    private Element[] elements = new Element[] {
            new ConcreteElementA("texte1"),
            new ConcreteElementA("texte2"),
            new ConcreteElementB(new Long(1)),
            new ConcreteElementA("texte3"),
            new ConcreteElementB(new Long(2)),
            new ConcreteElementB(new Long(3))
    };
    
    /**
     * Méthode de visite
     */
    public void visiter(Visiteur pVisiteur) {
        for(int i=0;i<elements.length;i++) {
            elements[i].recevoirVisiteur(pVisiteur);
        }
    }
}
