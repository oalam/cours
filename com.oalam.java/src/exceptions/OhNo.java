/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author formation
 */
public class OhNo {

    public void test(boolean doThrow) throws OhNoException {
	if (doThrow) {
	    throw new OhNoException("time to coffee, don't u think ?");
	}
    }

    public void test2() throws OhNoException {
	test(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	OhNo n = new OhNo();
	try {
	    n.test(true);
	} catch (OhNoException ex) {
	    System.err.println("Caught OhNoException: " + ex.getMessage());
	}

    }
}
