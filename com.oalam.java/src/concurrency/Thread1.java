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
public class Thread1 extends Thread{
    String name;

    public Thread1(String name) {
        this.name = name;
    }
    
    
    @Override
    public void run(){
        
        for (int i = 0; i < 10000; i++) {
           
                System.out.println(name + " - i = " + i);
              //  Thread.sleep(10);
           
        }
    }
    
    
    public static void main(String[] args) {
        
        Thread1 t1 = new Thread1("t1");
        Thread1 t2 = new Thread1("t2");
        
        t1.start();
        t2.start();
    }
    
}
