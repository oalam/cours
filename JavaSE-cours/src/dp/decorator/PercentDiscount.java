/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorator;

/**
 *
 * @author adminl
 */
public class PercentDiscount extends Discount{

    private double rate;
    
    public PercentDiscount(Buyable decorated) {
        super(decorated);
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public double getPrice(){
        return decorated.getPrice() * (1-rate);
    }
}
