/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator;

/**
 *
 * @author adminl
 */
public class FixedAmountDiscount extends Discount{

    public FixedAmountDiscount(Buyable decorated) {
        super(decorated);
    }
    
    
    double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getPrice(){
        return decorated.getPrice() - amount;
    }
}
