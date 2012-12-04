/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.poo;

/**
 *
 * @author formation
 */
public class Rectangle {

    public Point origin;
    public double width;
    public double heigth;

    
    private final double maxWidth = 100.0;

    public Rectangle(Point origin) {
        this.origin = origin;
    }
    
    
    
    public Rectangle(Point origin, double width, double heigth) {
        this.origin = origin;
        this.width = width;
        this.heigth = heigth;
    }

    public void move(double x, double y) {
       origin.translate(x, y);
    }

    public String toString() {
        return "Rectangle{" + "origin=" + origin + ", width=" + width + ", heigth=" + heigth + '}';
    }

  
    public Rectangle clone(){
        Rectangle result = new Rectangle(origin, width, heigth);
        
        return result;
        
    }
}
