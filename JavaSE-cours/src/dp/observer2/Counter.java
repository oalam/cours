/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author adminl
 */
public class Counter implements Observer{

    int count = 0;

    @Override
    public void update(Observable o, Object arg) {
       System.out.println(" price modified " + ++count + " times");
    }
    
}