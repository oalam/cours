/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factoryMethod;

/**
 *
 * @author adminl
 */
public abstract class Creator {
    
    
    public void computeInvoice(){
        
        Product p = factoryMethod();
        double result = 18 * p.getRate();
        
        System.out.println(result );
        
    }

    protected abstract Product factoryMethod() ;
}
