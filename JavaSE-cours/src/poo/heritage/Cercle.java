/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.heritage;

/**
 *
 * @author adminl
 */
public class Cercle extends Ellipse {

    public Cercle(double r) {
        super(r, r);
    }

    // redéfinition de la méthode Ellipse.surface()
    @Override
    public  double surface() {
        return 3.14159 * r1 * r2;
    }

    // surchage de la méthode Cercle.surface()
    public double surface(boolean test) {
        if (test) {
            return 0.0;
        } else {
            return 3.14159 * r1 * r2;
        }
    }
    
    
}
