package dp.decorator.dp;

/**
 * This class maintains a reference to a Component object and defines an
 * interface that conforms to Component's interface.
 *
 * @version 1.0 @created 26-juin-2012 12:17:38
 */
public abstract class PriceDecorator extends BookstoreItem {

    protected BookstoreItem component;

    public PriceDecorator() {
    }


    @Override
    public float getPrice() {
        if (component != null) {
            return component.getPrice();
        }else
            return 0.0f;
    }

    /**
     *
     * @param component
     */
    public void setComponent(BookstoreItem component) {
        this.component = component;
    }
}