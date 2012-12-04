/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author bailett
 */
public class Page implements Redimensionnable {

    double l,L;

    public Page(double l, double L) {
        this.l = l;
        this.L = L;
    }
     
    @Override
    public String toString(){
        return "Page (" + l + "," +  L + ")";
    }

    public double getL() {
        return L;
    }

    public void setL(double L) {
        this.L = L;
    }

    
    
    @Override
    public void grossir(int facteur) {
        l *= facteur;
        L *= facteur;
    }

    @Override
    public void reduire(int facteur) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
