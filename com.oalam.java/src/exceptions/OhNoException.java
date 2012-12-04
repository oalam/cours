/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author formation
 */
public class OhNoException extends Exception {

    /**
     * Creates a new instance of <code>OhNoException</code> without detail message.
     */
    public OhNoException() {
    }

    /**
     * Constructs an instance of <code>OhNoException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public OhNoException(String msg) {
        super(msg);
    }
}
