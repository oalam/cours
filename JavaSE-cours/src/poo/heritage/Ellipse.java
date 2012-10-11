/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.heritage;

/**
 *
 * @author adminl
 */
public class Ellipse {

    // r1 & r2 non disponible dans les classe filles
    protected double r1, r2;

     
    public Ellipse(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public   double surface() {
        return Math.PI * r1 * r2;
    }
}
