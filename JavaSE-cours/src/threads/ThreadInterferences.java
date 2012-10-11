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
public class ThreadInterferences {

    static void threadMessage(String message) {
        String threadName =
                Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                threadName,
                message);
    }

    static class Counter {

        private int c = 0;

        public synchronized void increment() {

            c++;

        }

        public synchronized void decrement() {
            c--;
        }

        public synchronized int value() {
            return c;
        }
    }

    static class CounterThread implements Runnable {

        Counter c;

        public CounterThread(Counter c) {
            this.c = c;
        }

        @Override
        public void run() {

            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(5);
                    threadMessage("before " + c.value());
                    synchronized (c) {
                        c.increment();
                        c.decrement();
                    }
                    threadMessage("after " + c.value());

                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadInterferences.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter();

        (new Thread(new CounterThread(c))).start();
        (new Thread(new CounterThread(c))).start();
        (new Thread(new CounterThread(c))).start();
    }
}
