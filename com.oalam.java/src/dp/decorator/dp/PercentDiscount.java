package dp.decorator.dp;

/**
 * This class adds responsibilities to the component.
 *
 * @version 1.0 @created 26-juin-2012 12:17:38
 */
public class PercentDiscount extends PriceDecorator {

    public PercentDiscount() {
    }

    float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }



    @Override
    public float getPrice() {
         return super.getPrice() * (1 - amount) ;

    }
}