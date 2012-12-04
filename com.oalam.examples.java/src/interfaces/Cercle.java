/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author bailett
 */
public class Cercle implements Redimensionnable {

  
    private double x,y, R;

    public Cercle(double x, double y, double R) {
        this.x = x;
        this.y = y;
        this.R = R;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

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

    
    @Override
    public String toString(){
        return "Cercle (" + x + "," + y + ")";
    }
    
    
    @Override
    public void reduire(int facteur) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void grossir(int facteur) {
        R *= facteur;
    }
    
}
