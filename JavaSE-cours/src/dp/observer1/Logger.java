/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observer1;

/**
 *
 * @author adminl
 */
public class Logger implements Observer{

    @Override
    public void update(Product p) {
        System.out.println("new price " + p.getPrice());
    }
    
}
