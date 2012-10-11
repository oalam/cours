/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author adminl
 */
public class Segment {

    private Point extr1, extr2;

    public Point getExtr1() {
        return extr1;
    }

    public void setExtr1(Point extr1) {
        this.extr1 = extr1;
    }

    public Point getExtr2() {
        return extr2;
    }

    public void setExtr2(Point extr2) {
        this.extr2 = extr2;
    }

    public Segment(Point extr1, Point extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
    }

    public double getLongueur() {
        double xbxa = extr1.abscisse() - extr2.abscisse();
        double ybya = extr1.ordonnee() - extr2.ordonnee();
        return Math.sqrt(xbxa * xbxa + ybya * ybya);
    }
    
    public boolean appartient(Point p){
        // calcul compliqué
        
        return false;
    }
}
