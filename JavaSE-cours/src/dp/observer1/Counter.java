/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observer1;

/**
 *
 * @author adminl
 */
public class Counter implements Observer{

    int count = 0;
    @Override
    public void update(Product p) {
        System.out.println(" price modified " + ++count + " times");
    }
    
}