/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton;

/**
 *
 * @author bailett
 */
public class SingletonPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton sg = Singleton.getInstance();
        sg.toString();
        
        Singleton sg2 = Singleton.getInstance();
        sg2.toString();
    }
}
