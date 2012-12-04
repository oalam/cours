/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arty;

/**
 *
 * @author formation
 */
public class Movie implements IBankable{
    public String title;
    public int nbEntries;
    
    
    @Override
    public double makeMoney() {
        return nbEntries*6.0;
    }
    
}
