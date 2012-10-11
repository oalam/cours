/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adminl
 */
public class HelloRunnable implements Runnable {

    String name;

    public HelloRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //try {

        for (int i = 0; i < 10; i++) {
            if (Thread.interrupted()) {
                return;
            }
            //Thread.sleep(1000);
            System.out.println("Hello from thread " + name);
        }

        /* } catch (InterruptedException ex) {
         System.out.println("bye bye " + name);
         }*/

    }

    public static void main(String args[]) throws InterruptedException {
     

        HelloRunnable r = new HelloRunnable("th2");
        Thread t = new Thread(r);
        t.start();

        
           
        t.join();
        (new Thread(new HelloRunnable("th1"))).start();
        
        System.out.println("Hello from the main!");

       // t.interrupt();


    }
}
