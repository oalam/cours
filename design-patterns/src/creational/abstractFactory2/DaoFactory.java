package creational.abstractFactory2;

/**
 * This class declares an interface for operations that create abstract product
 * objects.
 * @version 1.0
 * @created 03-ao�t-2011 16:46:09
 */
public abstract class DaoFactory {

	public DaoFactory(){

	}

	public void finalize() throws Throwable {

	}

	public abstract AccountDao CreateAccountDao();

	public abstract BookDao CreateBookDao();

}