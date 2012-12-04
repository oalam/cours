/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author formation
 */
public class CatchExceptionExample {

    public static void main(String[] args) {
        int value;
        
        try {
            value = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            value = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            value = 0;
            System.out.println("pas d'argument usage : .... " + value);
            e.printStackTrace();
        }
        System.out.println("value " + value);
    }
}
