package creational.abstractFactory2;

/**
 * This class implements the operations to create concrete product objects.
 * @version 1.0
 * @created 03-ao�t-2011 16:46:10
 */
public class FileDaoFactory extends DaoFactory {

    public FileDaoFactory() {
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public AccountDao CreateAccountDao() {
        return null;
    }

    public BookDao CreateBookDao() {
        return null;
    }
}