/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Point {

    //private double x, y;
    
    private double r, theta;

    public Point(double x, double y) {
        this.r = Math.sqrt(x * x + y * y);
        this.theta = 2 * Math.atan( y/ (x + r));
    }

    public void deplace(double dx, double dy) {
        double newAbscisse = abscisse() + dx;
        double newOrdonnee = ordonnee() + dy;
        
        this.r = Math.sqrt(newAbscisse * newAbscisse + newOrdonnee * newOrdonnee);
        this.theta = 2 * Math.atan( newOrdonnee/ (newAbscisse + r));
    }

    public void affiche() {
        System.out.println("Point de coordonnees " + abscisse() + " " + ordonnee());
    }

    public double abscisse() {
        return r * Math.cos(theta);
    }

    public double ordonnee() {
        return r * Math.sin(theta);
    }

    private static double norme(Point p) {
        
        return Math.sqrt(p.abscisse() * p.abscisse()
                + p.ordonnee() * p.ordonnee());
    }

    // version usuelle
    public Point maxNorme(Point p) {
        double nP1 = norme(this);
        double nP2 = norme(p);

        if (nP2 > nP1) {
            return p;
        } else {
            return this;
        }
    }

    // version static
    public static Point maxNorme(Point p1, Point p2) {
        double nP1 = norme(p1);
        double nP2 = norme(p2);

        if (nP2 > nP1) {
            return p2;
        } else {
            return p1;
        }
    }

    public static void main(String args[]) {
        Point a;
        a = new Point(30, 5);
        a.affiche();

        System.out.println("x : " + a.abscisse()
                + ", y : " + a.ordonnee());

        a.deplace(2, 0);
        a.affiche();
        Point b = new Point(6, 8);
        b.affiche();

        System.out.println("point le plus loin ");

        Point lePlusLoin = Point.maxNorme(a, b);
        lePlusLoin.affiche();

        Point lePlusLoin2 = a.maxNorme(b);
        lePlusLoin2.affiche();

        Point lePlusLoin3 = b.maxNorme(a);
        lePlusLoin2.affiche();
    }
}
