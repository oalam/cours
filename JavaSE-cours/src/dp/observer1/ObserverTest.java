/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observer1;

/**
 *
 * @author adminl
 */
public class ObserverTest {
    public static void main(String[] args) {
        
        Product p = new Product();
        Logger log = new Logger();
        Counter c = new Counter();
        
        p.attach(c);
        p.setPrice(150.5);
        p.attach(log);
        p.setPrice(1500.5);
        p.setPrice(10.5);
    }
   
}
