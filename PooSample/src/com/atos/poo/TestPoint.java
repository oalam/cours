/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.poo;

/**
 *
 * @author formation
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.println("nb points " + Point.getCount());

        Point p2 = new Point();
        System.out.println("nb points " + Point.getCount());

        p1.setX(-15.2);
        p1.setY(89.2);

        p2.setX(78.2);
        p2.setY(1.3);

        System.out.println(p1.toString());
        p1.translate(45.2, 89.2);
        System.out.println(p1.toString());




        // create a new rectangle
        double width = 8;
        double height = 3;
        Rectangle r = new Rectangle(p1, width, height);

        Rectangle r1 = r.clone();
        r1.equals(r);
        
        
        
        // move it
        System.out.println(r.toString());
        r.move(4.5, 8);
        System.out.println(r.toString());





    }
}
