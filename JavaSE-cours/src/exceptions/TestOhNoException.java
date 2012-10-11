/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adminl
 */
public class TestOhNoException {
    
    public static void f(String author) throws OhNoException {
        if(author.equals("dan brown")){
            throw new OhNoException();
        }
    }
    
    
    public static void main(String[] args)  {
        try {              
            f("dan brown");
        } catch (OhNoException ex) {
            Logger.getLogger(TestOhNoException.class.getName()).log(Level.SEVERE, null, ex);
        }
       

      
    }
    
}
