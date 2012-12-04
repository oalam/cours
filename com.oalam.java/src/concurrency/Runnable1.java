/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HumanBooster
 */
public class Runnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println( " - i = " + i);
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        Thread t = new Thread(new Runnable1());
        t.start();
        
    }
}
