/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.classes;

import poo.classes.Point;

/**
 *
 * @author adminl
 */
public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 8);


        p1.setX(12);
        p1.setY(-8);
        p1.translate(2, 2);

        System.out.println("p1.x = " + p1.getX());
        System.out.println("p1.y = " + p1.getY());


        p2.translate(3, 3);

        System.out.println("p2.x = " + p2.getX());
        System.out.println("p2.y = " + p2.getY());
    }
}
