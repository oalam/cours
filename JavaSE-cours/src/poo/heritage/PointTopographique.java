/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.heritage;

/**
 *
 * @author adminl
 */
public class PointTopographique extends Point {

    int alt;

    PointTopographique(int x, int y, int alt) {
        super(x, y);
        this.alt = alt;
    }

    public double distance(PointTopographique pt) {
        System.out.println("PointTopographique.distance(PointTopographique p)");
        return 0.0;
    }
}