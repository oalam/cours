package creational.factoryMethod2;

/**
 * This class overrides the factory method to return an instance of a
 * ConcreteProduct.
 * @version 1.0
 * @created 03-ao�t-2011 14:43:44
 */
public class BookFactory extends BusinessObjectFactory {

    @Override
    public BusinessObject createBusinessObject(String id) {
        return new Book(id);
    }
}