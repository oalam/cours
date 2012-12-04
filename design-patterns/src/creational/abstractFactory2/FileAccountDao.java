package creational.abstractFactory2;

import creational.factoryMethod2.Account;

/**
 * This class (a) defines a product object to be created by the corresponding
 * concrete factory, and (b) implements the AbstractProduct interface.
 * @version 1.0
 * @created 03-ao�t-2011 16:46:09
 */
public class FileAccountDao extends AccountDao {

	public FileAccountDao(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    public boolean find(Account a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}