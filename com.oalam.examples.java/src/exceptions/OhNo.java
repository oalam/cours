/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author formation
 */
public class OhNo {

    public void test(boolean doThrow) throws OhNoException {
        if(doThrow)
            throw new OhNoException("oh no !!!");
    }
    
    
    public void test2() throws OhNoException  {
        test(true);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        OhNo n = new OhNo();
        try {
            n.test2();
        } catch (OhNoException ex) {
            ex.printStackTrace();
        } finally{
            
        }
                
     
        
        
    }
}
