/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atos.poo;

/**
 *
 * @author formation
 */
public class Point {

    private double x;
    private double y;
    
    
    
    
    private int id;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Point() {
        id = count++;
    }

    public int getId() {
        return id;
    }
    
    
    

// accesseurs
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * translate the point with deltas
     */
    public void translate(double dx, double dy) {
        this.x += dx;
        
        this.y += dy;
    }
    
    
    
    
    
    

    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = 7;
        return hash;
    }
}
