package creational.factoryMethod2;

/**
 * @author Administrateur
 * @version 1.0
 * @created 03-ao�t-2011 14:43:44
 */
public class AccountFactory extends BusinessObjectFactory {

    @Override
    public BusinessObject createBusinessObject(String id) {
        return new Account(id);
    }
}