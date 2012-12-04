/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

/**
 *
 * @author formation
 */
public class Counter {

    private int count = 0;

    public synchronized int getCount() {
        return count;
    }

    public synchronized void increment() {
        System.out.println("increment() " );
        count++;
    }

    synchronized void  decrement() {
	count--;
	try {
            System.out.println("decrement()" );
            Thread.sleep(10);
	} catch (InterruptedException ex) {
	    ex.printStackTrace();
	}
    }
}
