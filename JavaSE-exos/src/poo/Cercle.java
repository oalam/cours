/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author adminl
 */
public class Cercle {
    
    Point centre;
    double r;

    public Cercle(Point centre, double r) {
        this.centre = centre;
        this.r = r;
    }

    public void deplaceCentre(double dx, double dy){
        this.centre.deplace(dx, dy);
    }
    
    public void changerRayon(double newR){
        this.r = newR;
    }
            
    public Point getCentre(){
        return centre;
    }
    
    public void affiche(){
        centre.affiche();
        System.out.println( " r = " + r );
    }
    
}
