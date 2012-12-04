package creational.abstractFactory2;

import creational.factoryMethod2.Account;
import creational.factoryMethod2.BusinessObject;

/**
 * This class declares an interface for a type of product object.
 * @version 1.0
 * @created 03-ao�t-2011 16:46:09
 */
public abstract class AccountDao {

    public AccountDao() {
    }

    public abstract boolean find(Account a) ;
}