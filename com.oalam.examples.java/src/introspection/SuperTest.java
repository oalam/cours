package introspection;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bailett
 */
public abstract class SuperTest {

    public SuperTest() {
    }



    public String read() {
        Scanner sc = new Scanner(System.in);
        String ch = null;
        if (sc.hasNext()) {
            ch = sc.next();
        }
        
        
        return ch;
    }

    public void print() {
        // TODO dfgdfg
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
