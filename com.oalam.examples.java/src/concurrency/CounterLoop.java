/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrency;

/**
 *
 * @author bailett
 */
public class CounterLoop implements Runnable {

    public String name;
    public static  final Counter counter = new Counter();
    private Object lock = new Object();

    @Override
    public  void run() {
        int i = 0;

        while (true) {
            synchronized (counter) 
            {
                if (counter.getCount() >= 100) {
                    break;
                } else {
                    counter.increment();
                  
                    System.out.println(name + " - " + counter.getCount());
                }
            }
        }
    }

    public static void main(String[] args) {
        CounterLoop mt1 = new CounterLoop();
        CounterLoop mt2 = new CounterLoop();
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        mt1.name = "t1";
        mt2.name = "t2";

        t1.start();
        t2.start();
      

    }
}
