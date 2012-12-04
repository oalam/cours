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
        count++;
    }
}
