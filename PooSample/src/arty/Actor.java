/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arty;

/**
 *
 * @author formation
 */
public class Actor extends Artist implements IBankable {
 
    @Override
    public void makeArt() {
        System.out.println("I'm playing a wonderfull role");
    }

    @Override
    public double makeMoney() {
       return 1566.0;
    }
    
}
