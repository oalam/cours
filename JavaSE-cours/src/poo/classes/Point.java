/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.classes;

/**
 *
 * @author adminl
 */
public class Point {

    // champs
    private int x;
    private int y;

    
    
    
    
    
    public Point() {
        x = 3;
    }

    private Point(int x) {
        this.x = x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

 

    // méthode
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
