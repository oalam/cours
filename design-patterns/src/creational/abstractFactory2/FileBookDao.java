package creational.abstractFactory2;

/**
 * This class (a) defines a product object to be created by the corresponding
 * concrete factory, and (b) implements the AbstractProduct interface.
 * @version 1.0
 * @created 03-ao�t-2011 16:46:10
 */
public class FileBookDao extends BookDao {

	public FileBookDao(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}