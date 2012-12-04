package dp.decorator.dp;

/**
 * This class adds responsibilities to the component.
 *
 * @version 1.0 @created 26-juin-2012 12:17:38
 */
public class FixedAmountDiscount extends PriceDecorator {

    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    

    public FixedAmountDiscount() {
    }

 

    @Override
    public float getPrice() {
        
        
        return super.getPrice() - amount;
      

    }
}