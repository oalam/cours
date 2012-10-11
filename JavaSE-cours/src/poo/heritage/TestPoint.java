/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.heritage;

/**
 *
 * @author adminl
 */
public class TestPoint {

    public static void main(String[] args) {
        double d;
        Point p1 = new Point(1, 5);
        Point p2 = new Point(10, 50);

        PointTopographique pt1 = new PointTopographique(1, 2, 3);
        PointTopographique pt2 = new PointTopographique(10, 20, 30);

        d = p1.distance(p2); // Exécute distance de Point car p1 est un Point
        d = p1.distance(pt1); // idem, un paramètre d’une sous classe est admis
        d = pt1.distance(p1); // Exécute la méthode distance(Point) héritée car p1 est un Point
        d = pt1.distance(pt2); // Exécute distance(PointTopographique) car pt1 et pt2 sont des PointTopographique
    }
}
