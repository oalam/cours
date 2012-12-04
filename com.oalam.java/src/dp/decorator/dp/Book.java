package dp.decorator.dp;

/**
 * This class defines an object to which additional responsibilites can be
 * attached.
 *
 * @version 1.0 @created 26-juin-2012 12:17:37
 */
public class Book extends BookstoreItem {

    float price;

    public Book() {
    }

    public void setPrice(float p) {
        price = p;
    }

    public float getPrice() {
        return price;
    }
}