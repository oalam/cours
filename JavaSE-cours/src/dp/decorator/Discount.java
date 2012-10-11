/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator;

/**
 *
 * @author adminl
 */
public abstract class Discount implements Buyable {

    protected Buyable decorated;

    public Discount(Buyable decorated) {
        this.decorated = decorated;
    }
    
    
}
