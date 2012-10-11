/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author adminl
 */
public class Cercle2 extends Point{

    double r;
    
    public Cercle2(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }
     public void deplaceCentre(double dx, double dy){
        deplace(dx, dy);
    }
    
    public void changerRayon(double newR){
        this.r = newR;
    }
    
    public Point getCentre(){
        return this;
    }
    
    @Override
    public void affiche(){
        super.affiche();
        System.out.println( " r = " + r );
    }
}
