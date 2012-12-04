/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arty;

/**
 *
 * @author formation
 */
public class Singer extends Artist implements IBankable {

    @Override
    public void makeArt() {
        System.out.println("I'm singing in the rain");
    }
    
    @Override
    public double makeMoney() {
       return 150066.0;
    }
}
