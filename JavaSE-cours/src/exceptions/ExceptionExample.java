/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author adminl
 */
public class ExceptionExample extends RuntimeException {

    public static char charAt(char[] array, int index) {
        return array[index];
    }

    public static void main(String[] args) throws OhNoException {

        try {

            char[] array = args[0].toCharArray();
            charAt(array, 0);

            System.out.println(0 / 0);

        } catch (ArithmeticException ex) {
            System.out.println("oups : " + ex.getMessage());
            throw new OhNoException();
        } finally{
            
            System.out.println("finnally");
            
        }
System.out.println("finnally 2");

        /*  
         */
    }
}