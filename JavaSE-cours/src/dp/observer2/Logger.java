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
public class Logger implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println( arg);
        if (o instanceof Product) {
            Product p = (Product) o;
            System.out.println("new price " + p.getPrice());
        }
    }
}
